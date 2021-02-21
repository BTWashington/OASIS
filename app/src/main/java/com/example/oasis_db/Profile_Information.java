package com.example.oasis_db;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class Profile_Information extends AppCompatActivity {

	// references to buttons and other controls on the layout
	ImageView profile_image;
	EditText et_profile_first_name, et_profile_last_name, et_profile_ID_number, et_garaging_address, et_garaging_address2, et_profile_city, et_profile_state, etn_profile_zipCode;
	EditText et_profile_phone, et_profile_email, et_Territory, et_profile_password, et_profile_dateOfBirth;
	Switch sw_has_Vehicle, sw_has_insurance, sw_has_warranty, sw_has_claims;
	Button btn_back_button,btn_vehicle_info,btn_quote_pool,btn_Home_page, btn_save_profile;


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
		et_garaging_address = findViewById(R.id.et_garaging_address);
		et_garaging_address2 = findViewById(R.id.et_garaging_address2);
		et_profile_city = findViewById(R.id.et_profile_city);
		et_profile_state = findViewById(R.id.et_profile_state);
		etn_profile_zipCode = findViewById(R.id.etn_profile_zipCode);

		// Switches for profile information screen - Boolean Values
		sw_has_Vehicle = findViewById(R.id.sw_has_Vehicle);
		sw_has_insurance = findViewById(R.id.sw_has_insurance);
		sw_has_warranty = findViewById(R.id.sw_has_warranty);
		sw_has_claims = findViewById(R.id.sw_has_claims);

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
		 *
		 *  ADD BUTTON
		 *  Purpose: Creates a new Profile -> Checks for Valid Input from USER
		 *  								-> Throws an Exception if invalid
		 *  Try / Catch Block to Catch USER incorrect inputs creating New Profiles
		 *			Creates a new profile
		 *			Database Assistant writes the profile to the database
		 *
		 *  */

		btn_save_profile.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Instance of a Profile_PI object
				Profile_PI pi_profile;

				// try / catch block




			}
		});

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
	};
}