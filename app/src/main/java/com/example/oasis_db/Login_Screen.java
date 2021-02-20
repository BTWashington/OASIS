package com.example.oasis_db;

import androidx.appcompat.app.AppCompatActivity;

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

	private String UserName = "Admin";
	private String Password = "";


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login__screen);

		// use FindViewById() to bind the UI elements to XML layout
		et_Username = findViewById(R.id.et_UserName);
		et_password = findViewById(R.id.et_TextPassword);
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