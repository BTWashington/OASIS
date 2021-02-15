package com.example.oasis_db;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
	// references to buttons and other controls on the layout
	Button btn_add, btn_viewAll;
	EditText et_name, et_PhoneNumber;
	Switch sw_activeProfile;
	RecyclerView rv_profileList;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
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

		btn_add.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				CustomerModel profileModel;
				// Try / Catch Block to Catch USER incorrect inputs creating New Profiles
				try{
					// Creating a Profile_Model (CustomerModel) Object
					profileModel = new CustomerModel(-1,et_name.getText().toString(),
							Integer.parseInt(et_PhoneNumber.getText().toString()),
							sw_activeProfile.isChecked());

					// Creates a new Profile for the USER prints confirm EVENT to the USER screen to confirm it is working correctly
					Toast.makeText(MainActivity.this, profileModel.toString(), Toast.LENGTH_SHORT).show();

				}catch(Exception e){
					// In the case the USER Enters an Incorrect entry Creating a profile
					Toast.makeText(MainActivity.this,"Error Creating Profile", Toast.LENGTH_SHORT).show();
					// In the case of failure, create error transaction in table
					profileModel = new CustomerModel(-1,"error", 0 , false);
				}

				DataBaseAssistant dataBaseAssistant = new DataBaseAssistant(MainActivity.this);
				// Using the addOne method to add the Profile to the database
				boolean success = dataBaseAssistant.addOne(profileModel);
				// Creating a Toast to confirm profile was added to the database successfully
				Toast.makeText(MainActivity.this,"Success= " + success, Toast.LENGTH_SHORT).show();

			}

		});

		btn_viewAll.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {


				// Prints "View All Profiles" to the screen to confirm EVENT is working correctly
				Toast.makeText(MainActivity.this,"View All Profiles", Toast.LENGTH_SHORT).show();

			}
		});

	}
}