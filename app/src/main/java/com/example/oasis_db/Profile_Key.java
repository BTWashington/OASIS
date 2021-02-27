package com.example.oasis_db;

import android.text.Editable;

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

	public Profile_Key(String id, int key) {
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
	public static String Create_Password_Key(int User_key){
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

	public static int Create_int_Password_Key(int User_key){

		try{
			if(User_key >= 1) {
				Random rndNum = new Random(User_key);

				return Integer.parseInt(String.valueOf(rndNum));
			}else{
				System.out.print(USER_INPUT_INCORRECT);
			}
		}catch(Exception e){
			System.out.print(Method_Failed);
		}

		// Return the rndNum to String format and return value to Caller
		return 0;
	}

	/**
	 *
	 *
	 * */
	// Method to use the Password_Key to convert User Defined Key to User_Password
	public static int Convert_To_Profile_Key(String rndNum, int user_key){
		// Convert rndKey to a Integer
		int rndkey = Integer.parseInt(rndNum);

		// XOR the profile key with the rndKey generated in Create_Password_Key Method
		user_key ^= rndkey;

		return user_key;

	}

	/**
	 *  Storing the Profile_Key in a Map Container associated with the profile_ID
	 *  Key / Value pair -> (Profile_ID,m Profile_Key)
	 *
	 *  Profile_Key profile_key = new Profile_Key(rndKey,User_key);
	 */



}
