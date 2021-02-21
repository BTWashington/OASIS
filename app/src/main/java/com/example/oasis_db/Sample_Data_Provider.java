package com.example.oasis_db;

import com.example.oasis_db.Profile_PI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample_Data_Provider {
	/**
	 * Create Collections to collect the data -> to store the sample data
	 *
	 * One LIST -> ArrayList
	 * One MAP -> HashMap
	 *
	 * */
	public static List<Profile_PI> dataItemList;
	public static Map<String, Profile_PI> dataItemMap;

	/**
	 * Create a static initializer for each of the collections
	 *
	 * */
	static{
		dataItemList = new ArrayList<>();
		dataItemMap = new HashMap<>();

		addItem(new Profile_PI("0001","Brandon","Washington","105 Dreamland way",null,"Greenville","SC",29609,
				null,7101981,864-555-1212,"bwashinsurance@gmail.com","123456789"));

		addItem(new Profile_PI("0002","Brian","Watkins","105 Dream way",null,"Greenville","SC",29609,
				null,7101981,864-555-2121,"bwashinsurance@gmail.com","987654321"));

		addItem(new Profile_PI("0003","John","Childers","105 land way",null,"Greenville","SC",29609,
				null,7101981,864-555-2222,"bwashinsurance@gmail.com","222222222"));

		addItem(new Profile_PI("0004","Dan","Boyer","105 Dramlan way",null,"Greenville","SC",29609,
				null,7101981,864-555-1111,"bwashinsurance@gmail.com","753159468"));

		addItem(new Profile_PI("0005","Steve","Smith","110 Dland way",null,"Greenville","SC",29609,
				null,7101981,864-555-5555,"bwashinsurance@gmail.com","1467923257"));

	}

	/**
	 *Create a private static void method to add the "data item" to each collection
	 *
	 **/
	private static void addItem(Profile_PI pi_profile){
		dataItemList.add(pi_profile);
		dataItemMap.put(pi_profile.getId(), pi_profile);



	}

}
