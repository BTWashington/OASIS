package com.example.oasis_db;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class MainActivity extends AppCompatActivity {
	TextView tvOut;
	// Sample Data Provider
	List<Profile_PI> dataItemList = Sample_Data_Provider.dataItemList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		tvOut = (TextView) findViewById(R.id.out);

	}



}