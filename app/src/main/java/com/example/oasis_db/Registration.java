package com.example.oasis_db;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

	// Creating variables for each field on the layout
	private EditText et_reg_first_name, et_reg_last_name, et_reg_user_name, et_reg_mailing_address,
				et_reg_city, et_reg_state, et_reg_zip_code, et_reg_territory, et_reg_email, et_reg_phone,
				et_reg_password;

	private Switch sw_reg_has_vehicle, sw_reg_has_insurance, sw_reg_has_warranty, sw_reg_has_claims;

	private Button btn_reg_register;

	private TextView tv_userLogin;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registration);
		setupUIViews();
		Profile_PI pi_profile;
		Profile_Key password_key;





		btn_reg_register.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// First, Validate each field given by the user
				if(validate()){
					// if input has been validated, upload data to the database


				};
			}
		});

		tv_userLogin.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(Registration.this,Login_Screen.class));
			}
		});

	}

	/**
	 * Methods -> Set up UI views
	 *  -> Makes connection to the XML
	 *
	 *
	 * */

	private void setupUIViews(){
		et_reg_first_name = (EditText)findViewById(R.id.et_reg_first_name);
		et_reg_last_name = (EditText)findViewById(R.id.et_reg_last_name);
		et_reg_user_name = (EditText)findViewById(R.id.et_reg_user_name);
		et_reg_mailing_address = (EditText)findViewById(R.id.et_reg_street_address);
		et_reg_city = (EditText)findViewById(R.id.et_reg_city);
		et_reg_state = (EditText)findViewById(R.id.et_reg_state);
		et_reg_zip_code = (EditText)findViewById(R.id.et_reg_zip_code);
		et_reg_territory = (EditText)findViewById(R.id.et_reg_territory);
		et_reg_email = (EditText)findViewById(R.id.et_reg_email);
		et_reg_phone = (EditText)findViewById(R.id.et_reg_phone);
		et_reg_password = (EditText)findViewById(R.id.et_reg_password);
		sw_reg_has_vehicle = (Switch)findViewById(R.id.sw_has_Vehicle);
		sw_reg_has_insurance = (Switch)findViewById(R.id.sw_has_insurance);
		sw_reg_has_warranty = (Switch)findViewById(R.id.sw_has_warranty);
		sw_reg_has_claims = (Switch)findViewById(R.id.sw_has_claims);
		btn_reg_register = (Button)findViewById(R.id.btn_reg_registration);
		tv_userLogin = (TextView)findViewById(R.id.btn_reg_registration);
	}


	private Boolean validate(){
		Boolean result = false;

		String username = et_reg_user_name.getText().toString();
		String firstName = et_reg_first_name.getText().toString();
		String lastName = et_reg_last_name.getText().toString();
		String mailingAddress = et_reg_mailing_address.getText().toString();
		String city = et_reg_city.getText().toString();
		String state = et_reg_state.getText().toString();
		String zipCode = et_reg_zip_code.getText().toString();
		String territory = et_reg_territory.getText().toString();
		String email = et_reg_email.getText().toString();
		String phone = et_reg_phone.getText().toString();
		String password = et_reg_password.getText().toString();


		if(username.isEmpty() && firstName.isEmpty() && lastName.isEmpty() && email.isEmpty() && password.isEmpty()){
			Toast.makeText(this, "Please enter all required details for an account", Toast.LENGTH_SHORT).show();

		}else{
			result = true;
		}
		return result;
	}


}