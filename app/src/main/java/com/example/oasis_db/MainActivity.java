package com.example.oasis_db;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
	// Sample Data Provider
	List<Profile_PI> dataItemList = Sample_Data_Provider.dataItemList;

	// references to buttons and other controls on the layout
	Button btn_add, btn_viewAll;
	EditText et_name, et_PhoneNumber;
	Switch sw_activeProfile;
	RecyclerView rv_profileList;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		

	}



}