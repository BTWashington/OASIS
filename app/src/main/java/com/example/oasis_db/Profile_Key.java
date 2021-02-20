package com.example.oasis_db;

import java.util.Random;

public class Profile_Key {


	// Contstants for Catch and Throw Calls
	public static final String Method_Failed = "Something went wrong converting user input, please try again...";
	public static final String USER_INPUT_INCORRECT = "User Input was incorrect, please try again...";


	private Integer profile_key = 0;
	private String profile_id = "";

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
		try{
			if(User_key >= 1) {
				Random rndNum = new Random(User_key);
				return rndNum.toString();
			}else{
				System.out.print(USER_INPUT_INCORRECT);
			}
		}catch(Exception e){
			System.out.print(Method_Failed);
		}

		// Return the rndNum to String format and return value to Caller
		return Method_Failed;
	}

	/**
	 *
	 *
	 * */
	// Method to use the Password_Key to convert User Defined Key to User_Password
	public static int Convert_To_Profile_Key(String rndNum, Integer profile_key){
		// Convert rndKey to a Integer
		Integer rndkey = Integer.parseInt(rndNum);

		// XOR the profile key with the rndKey generated in Create_Password_Key Method
		profile_key ^= rndkey;

		return profile_key;

	}

	/**
	 *  Storing the Profile_Key in a Map Container associated with the profile_ID
	 *  Key / Value pair -> (Profile_ID,m Profile_Key)
	 *
	 *  Profile_Key profile_key = new Profile_Key(rndKey,User_key);
	 */



}
