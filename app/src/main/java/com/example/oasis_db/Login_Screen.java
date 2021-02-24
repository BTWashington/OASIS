package com.example.oasis_db;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.UserHandle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Screen extends AppCompatActivity {

	private EditText et_Username;
	private EditText et_password;
	private Button btn_login;
	private TextView tv_attemptsInfo;

	// The user will only be able to enter the app if they enter the
	// correct credentials

	private String UserName = "";
	private String Password = "";

	boolean isValid = false;
	private int counter = 5;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login__screen);

		// use FindViewById() to bind the UI elements to XML layout
		et_Username = findViewById(R.id.et_Profile_UserName);
		et_password = findViewById(R.id.et_profile_password);
		btn_login = findViewById(R.id.btn_Login);
		tv_attemptsInfo = findViewById(R.id.tv_attemptsInfo);

		// Create the listener for the button click on the login screen
		btn_login.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				// Get the Username that the user entered
				String UserInputName = et_Username.getText().toString();
				String UserInputPassword = et_password.getText().toString();

				// Checking to see if the User input a value
				if(UserInputName.isEmpty() || UserInputPassword.isEmpty()) {
					Toast.makeText(Login_Screen.this, "Please enter both a Username and a password", Toast.LENGTH_SHORT).show();
				}else{
					// using the isValid variable to implement the ValidateUserInput Method
					isValid = ValidateUserInput(UserInputName, UserInputPassword);

					// Checking to see if the entry was valid or not
					if(!isValid){
						counter--;
						Toast.makeText(Login_Screen.this, "Incorrect Credentials Entered, please try again...", Toast.LENGTH_SHORT).show();

						tv_attemptsInfo.setText("No. of attempts remaining: " + counter);

						// if the counter is reduced to 0 then the login button will become disabled
						if(counter ==0){
							btn_login.setEnabled(false);
						}
					}else{
						Toast.makeText(Login_Screen.this, "Login Successful", Toast.LENGTH_SHORT).show();

						// Add the code here to go to new activity
						Intent intent = new Intent(Login_Screen.this, Profile_Information.class);
						startActivity(intent);

					}
				}
			}
		});
	}

	// Method to validate user input on the Username and Password
	private boolean ValidateUserInput(String name, String password){

		if(name.equals(UserName) && password.equals(Password)){
			return true;
		}

		return false;
	}



}