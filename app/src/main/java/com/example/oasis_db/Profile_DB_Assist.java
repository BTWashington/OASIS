package com.example.oasis_db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Profile_DB_Assist extends SQLiteOpenHelper {

	public static final String PROFILE_PI_TABLE = "Profile_PI";
	public static final String COL_PROFILE_FIRST_NAME = "COL_PROFILE_FIRST_NAME";
	public static final String COL_PROFILE_LAST_NAME = "COL_PROFILE_LAST_NAME";
	public static final String COL_PROFILE_USERNAME = "COL_PROFILE_USERNAME TEXT";
	public static final String COL_PROFILE_GARAGING_ADDRESS = "COL_PROFILE_GARAGING_ADDRESS";
	public static final String COL_PROFILE_CITY_TEXT = "COL_PROFILE_CITY TEXT";
	public static final String COL_PROFILE_STATE = "COL_PROFILE_STATE";
	public static final String COL_PROFILE_ZIPCODE = "COL_PROFILE_ZIPCODE";
	public static final String COL_PROFILE_EMAIL = "COL_PROFILE_EMAIL TEXT";
	public static final String COL_PROFILE_PHONE = "COL_PROFILE_PHONE INT";
	public static final String COL_PROFILE_PASSWORD = "COL_PROFILE_PASSWORD TEXT";
	public static final String COL_PROFILE_DATEOFBIRTH = "COL_PROFILE_DATEOFBIRTH";
	public static final String COL_PROFILE_HAS_A_VEHICLE = "COL_PROFILE_HAS_A_VEHICLE";
	public static final String COL_PROFILE_HAS_INSURANCE = "COL_PROFILE_HAS_INSURANCE";
	public static final String COL_PROFILE_HAS_WARRANTY = "COL_PROFILE_HAS_WARRANTY";
	public static final String COL_PROFILE_HAS_CLAIMS = "COL_PROFILE_HAS_CLAIMS";

	// Constructor
	public Profile_DB_Assist(@Nullable Context context){
		super(context,"OASIS_profiles",null,1);
	}



	/**
	 * Called when the database is created for the first time. This is where the
	 * creation of tables and the initial population of the tables should happen.
	 *
	 * @param db The database.
	 */
	@Override
	public void onCreate(SQLiteDatabase db) {
		String createProfileTableStatement = "CREATE TABLE " +
				PROFILE_PI_TABLE + " (ID INTEGER PRIMARY KEY AUTOINCREMENT," +
				" " + COL_PROFILE_FIRST_NAME + " TEXT," +
				" " + COL_PROFILE_LAST_NAME + " TEXT," +
				" " + COL_PROFILE_USERNAME + "TEXT," +
				" " + COL_PROFILE_GARAGING_ADDRESS + " TEXT," +
				" " + COL_PROFILE_CITY_TEXT + "," +
				" " + COL_PROFILE_STATE + " TEXT," +
				" " + COL_PROFILE_ZIPCODE + " INT," +
				" " + COL_PROFILE_EMAIL + "TEXT," +
				" " + COL_PROFILE_PHONE + "INT," +
				" " + COL_PROFILE_PASSWORD + "TEXT," +
				" " + COL_PROFILE_DATEOFBIRTH + "INT," +
				" " + COL_PROFILE_HAS_A_VEHICLE + "BOOLEAN," +
				" " + COL_PROFILE_HAS_INSURANCE + "BOOLEAN," +
				" " + COL_PROFILE_HAS_WARRANTY + "BOOLEAN," +
				" " + COL_PROFILE_HAS_CLAIMS + "BOOLEAN,)"
		;


		db.execSQL(createProfileTableStatement);
	}

	/**
	 * Called when the database needs to be upgraded. The implementation
	 * should use this method to drop tables, add tables, or do anything else it
	 * needs to upgrade to the new schema version.
	 *
	 * <p>
	 * The SQLite ALTER TABLE documentation can be found
	 * <a href="http://sqlite.org/lang_altertable.html">here</a>. If you add new columns
	 * you can use ALTER TABLE to insert them into a live table. If you rename or remove columns
	 * you can use ALTER TABLE to rename the old table, then create the new table and then
	 * populate the new table with the contents of the old table.
	 * </p><p>
	 * This method executes within a transaction.  If an exception is thrown, all changes
	 * will automatically be rolled back.
	 * </p>
	 *
	 * @param db         The database.
	 * @param oldVersion The old database version.
	 * @param newVersion The new database version.
	 */
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}
}
