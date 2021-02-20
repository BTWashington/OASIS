package com.example.oasis_db;

import java.util.Random;
import java.

public class Profile_Key {
	private String profile_key;
	private String profile_id;

	// Constructor for the Profile_Key
	Profile_Key(String key,String id){
		profile_key = key;
		profile_id = id;
	}

	/**
	 *  Method to Generate Stored password -> XOR'd from Random Number generated per USER
	 *  Generate the Random Number used for Creating individual profile_key
	 *  rooted from the User defined Key
	 *  Return the rndNum to String format and return value to Caller
	 * */
	// Method to Generate Stored password -> XOR'd from Random Number generated per USER
	// **** IDEA ****
	public static String Create_Password_Key(String User_key, String Pf_ID){
		// Generate the Random Number used for Creating individual profile_key
		// rooted from the User defined Key
		int TEMP = Integer.parseInt(User_key);
		Random rndNum = new Random(TEMP);
		// Return the rndNum to String format and return value to Caller
		return rndNum.toString();
	}

	/**
	 *
	 *
	 * */
	// Method to Convert the Password_Key


	/**
	 *  Storing the Profile_Key in a Map Container associated with the profile_ID
	 *  Key / Value pair -> (Profile_ID,m Profile_Key)
	 *
	 */



}
