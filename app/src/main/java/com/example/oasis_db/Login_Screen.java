package com.example.oasis_db;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login_Screen extends AppCompatActivity {

	private EditText et_Username;
	private EditText et_password;
	private Button btn_login;
	private TextView tv_attemptsInfo;


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


	}
}