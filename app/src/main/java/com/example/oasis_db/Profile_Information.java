package com.example.oasis_db;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class Profile_Information extends AppCompatActivity {

	// references to buttons and other controls on the layout
	ImageView profile_image;
	EditText et_profile_first_name, et_profile_last_name, et_profile_ID_number, et_profile_UserName, et_garaging_address2, et_profile_city, et_profile_state, etn_profile_zipCode;
	EditText et_profile_phone, et_profile_email, et_Territory, et_profile_password, et_profile_dateOfBirth;
	Switch sw_has_Vehicle, sw_has_insurance, sw_has_warranty, sw_has_claims;
	Button btn_back_button,btn_vehicle_info,btn_quote_pool,btn_Home_page, btn_save_profile;
	CheckBox cb_profile_activeProfile;


	Button btn_add, btn_viewAll;
	EditText et_name, et_PhoneNumber;
	Switch sw_activeProfile;
	RecyclerView rv_profileList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_profile__information);

		// Profile Information Database using findViewById to make connection from User
		// Interface
		profile_image = findViewById(R.id.iv_profile_picture);
		et_profile_first_name = findViewById(R.id.et_profile_first_name);
		et_profile_last_name = findViewById(R.id.et_profile_last_name);
		et_profile_ID_number = findViewById(R.id.et_profile_ID_number);
		et_profile_UserName = findViewById(R.id.et_Profile_UserName);
		et_garaging_address2 = findViewById(R.id.et_garaging_address2);
		et_profile_city = findViewById(R.id.et_profile_city);
		et_profile_state = findViewById(R.id.et_profile_state);
		etn_profile_zipCode = findViewById(R.id.etn_profile_zipCode);
		et_profile_dateOfBirth = findViewById(R.id.et_profile_dateOfBirth);
		et_profile_phone = findViewById(R.id.et_profile_phone);
		et_profile_email = findViewById(R.id.et_profile_email);
		et_profile_password = findViewById(R.id.et_profile_password);

		// Switches for profile information screen - Boolean Values
		sw_has_Vehicle = findViewById(R.id.sw_has_Vehicle);
		sw_has_insurance = findViewById(R.id.sw_has_insurance);
		sw_has_warranty = findViewById(R.id.sw_has_warranty);
		sw_has_claims = findViewById(R.id.sw_has_claims);
		cb_profile_activeProfile = findViewById(R.id.cb_profile_activeProfile);

		// Buttons for navigation from profile information screen
		btn_Home_page = findViewById(R.id.btn_Home_page);
		btn_back_button = findViewById(R.id.btn_back_button);
		btn_vehicle_info = findViewById(R.id.btn_vehicle_info);
		btn_quote_pool = findViewById(R.id.btn_quote_pool);
		btn_save_profile = findViewById(R.id.btn_save_profile);
//__________________________________________________________________________________________

		// Customer Profile Database
		btn_add = findViewById(R.id.btn_add);
		btn_viewAll = findViewById(R.id.btn_viewAll);
		et_PhoneNumber = findViewById(R.id.et_PhoneNumber);
		et_name = findViewById(R.id.et_name);
		sw_activeProfile = findViewById(R.id.sw_activeProfile);
		rv_profileList = findViewById(R.id.rv_profileList);


		/**
		 * Navigation Buttons
		 *  -> Home
		 *  -> Back
		 *  -> Vehicle Information
		 *  -> Quote Pool
		 *
		 * */

		/**
		 * Vehicle Information
		 * -> Navigation Button
		 *   -> A way to navigate to vehicle information page
		 *
		 * */
		btn_vehicle_info.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(Profile_Information.this, Vehicle_Model.class));
			}
		});


		/**
		 * Home Page Button
		 * -> Navigation Button
		 *   -> A way to always find the home page from any layer of the app		 *
		 *
		 * */

		btn_Home_page.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(Profile_Information.this, Home_Page.class));
			}
		});


		/**
		 * Back Button
		 * -> Returns user to the previous screen
		 *
		 * */

		btn_back_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Need to figure out how to send to previous page
			}
		});


		/**
		 * Save Profile Button
		 *
		 * */


		btn_save_profile.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Instance of a Profile_PI object
				Profile_PI pi_profile;
				Profile_Key pi_key = new Profile_Key(null,null);

				// try / catch block for PI_Profile Creation
				try {
					pi_profile = new Profile_PI(
							et_profile_ID_number.getText().toString(),
							et_profile_first_name.getText().toString(),
							et_profile_last_name.getText().toString(),
							et_profile_UserName.getText().toString(),
							et_garaging_address2.getText().toString(),
							et_profile_state.getText().toString(),
							et_profile_city.getText().toString(),
							Integer.parseInt(etn_profile_zipCode.getText().toString()),
							profile_image.getDrawable().toString(),
							Integer.parseInt(et_profile_dateOfBirth.getText().toString()),
							Integer.parseInt(et_profile_phone.getText().toString()),
							et_profile_email.getText().toString(),
							et_profile_password.getText().toString(),
							sw_has_Vehicle.isChecked(), sw_has_insurance.isChecked(),
							sw_has_warranty.isChecked(), sw_has_claims.isChecked(),
							cb_profile_activeProfile.isChecked());



				}catch(Exception e){
					// In the case the USER Enters an Incorrect entry Creating a profile
					Toast.makeText(Profile_Information.this, "Error Creating Profile", Toast.LENGTH_SHORT).show();

					// In the case of failure, create error transaction in table
					pi_profile = new Profile_PI(Profile_PI.ERROR, Profile_PI.ERROR, Profile_PI.ERROR, Profile_PI.ERROR, Profile_PI.ERROR, Profile_PI.ERROR, Profile_PI.ERROR, 0,
							Profile_PI.ERROR, 0, 0, Profile_PI.ERROR, Profile_PI.ERROR, false, false, false, false, false);

				}

				// try / catch block for Password Encryption
				try{
					//Encrypting User defined password


					pi_key = new Profile_Key(et_profile_password.getText().toString(), Profile_Key.Create_int_Password_Key(Integer.parseInt(et_profile_password.getText().toString())));

				}catch(Exception e){
					Toast.makeText(Profile_Information.this, "Error Encrypting Password... Password will be Set to last 4 digits of First name, first four digits of Last Name", Toast.LENGTH_SHORT).show();

					// In case of failure, set Profile Password to First four digits of First Name, First four digits of Last Name
				    pi_key = new Profile_Key(Profile_PI.ERROR,0);

				}



			}
		});




		//___________________________________________________________________________________________

		/**
		 *
		 *  ADD BUTTON
		 *  Purpose: Creates a new Profile -> Checks for Valid Input from USER
		 *  								-> Throws an Exception if invalid
		 *  Try / Catch Block to Catch USER incorrect inputs creating New Profiles
		 *			Creates a new profile
		 *			Database Assistant writes the profile to the database
		 *
		 *  */
		btn_add.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				// *** Needs to be updated to Profile_PI when ready ***
				CustomerModel profileModel;
				// Try / Catch Block to Catch USER incorrect inputs creating New Profiles
				try {
					// Creating a Profile_Model (CustomerModel) Object
					profileModel = new CustomerModel(-1, et_name.getText().toString(),
							Integer.parseInt(et_PhoneNumber.getText().toString()),
							sw_activeProfile.isChecked());

					// Creates a new Profile for the USER prints confirm EVENT to the USER screen to confirm it is working correctly
					Toast.makeText(Profile_Information.this, profileModel.toString(), Toast.LENGTH_SHORT).show();

				} catch (Exception e) {
					// In the case the USER Enters an Incorrect entry Creating a profile
					Toast.makeText(Profile_Information.this, "Error Creating Profile", Toast.LENGTH_SHORT).show();
					// In the case of failure, create error transaction in table
					profileModel = new CustomerModel(-1, "error", 0, false);
				}

				DataBaseAssistant dataBaseAssistant = new DataBaseAssistant(Profile_Information.this);
				// Using the addOne method to add the Profile to the database
				boolean success = dataBaseAssistant.addOne(profileModel);
				// Creating a Toast to confirm profile was added to the database successfully
				Toast.makeText(Profile_Information.this, "Success= " + success, Toast.LENGTH_SHORT).show();

			}

		});

		btn_viewAll.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {


				// Prints "View All Profiles" to the screen to confirm EVENT is working correctly
				Toast.makeText(Profile_Information.this, "View All Profiles", Toast.LENGTH_SHORT).show();
			}
		});


	}


	private void setup_profile_from_registration() {
		et_profile_first_name = (EditText)findViewById(R.id.et_reg_first_name);
		et_profile_last_name = (EditText)findViewById(R.id.et_reg_last_name);
		et_profile_UserName = (EditText)findViewById(R.id.et_reg_user_name);
		et_garaging_address2 = (EditText)findViewById(R.id.et_reg_street_address);
		et_profile_city = (EditText)findViewById(R.id.et_reg_city);
		et_profile_state = (EditText)findViewById(R.id.et_reg_state);
		etn_profile_zipCode = (EditText)findViewById(R.id.et_reg_zip_code);
		et_profile_password = (EditText)findViewById(R.id.et_reg_password);
		et_profile_email = (EditText)findViewById(R.id.et_reg_email);
		et_profile_phone = (EditText)findViewById(R.id.et_reg_phone);
		et_profile_dateOfBirth = (EditText)findViewById(R.id.et_profile_dateOfBirth);
		et_profile_password = ()



	}


}