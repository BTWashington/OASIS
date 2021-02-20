package com.example.oasis_db;

import java.util.Random;

public class Profile_Key {
	private Integer profile_key;
	private String profile_id;

	// Constructor for the Profile_Key
	Profile_Key(Integer key,String id){
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
	public static String Create_Password_Key(Integer User_key){
		// Generate the Random Number used for Creating individual profile_key
		// rooted from the User defined Key
		Random rndNum = new Random(User_key);
		// Return the rndNum to String format and return value to Caller
		return rndNum.toString();
	}




	/**
	 *
	 *
	 * */
	// Method to use the Password_Key to convert User Defined Key to User_Password
	public static int Convert_To_Profile_Key(String rndKey, int profile_key){
		// Convert rndKey to a Integer
		int intrndkey = Integer.parseInt(rndKey);

		// XOR the profile key with the rndKey generated in Create_Password_Key Method
		profile_key ^= intrndkey;

		return profile_key;

	}

	/**
	 *  Storing the Profile_Key in a Map Container associated with the profile_ID
	 *  Key / Value pair -> (Profile_ID,m Profile_Key)
	 *
	 *  Profile_Key profile_key = new Profile_Key(rndKey,User_key);
	 */



}
