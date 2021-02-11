package com.example.oasis_db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseAssistant extends SQLiteOpenHelper {
	/**
	 *
	 *  Created a CONSTANT Variable for the name of the table and each column in the table  @author BWash@version 1.00@since 1/30/2021
	 * */
	public static final String CUSTOMER_TABLE = "CUSTOMER_TABLE";
	public static final String Col_PROFILE_NAME = "PROFILE_NAME";
	public static final String Col_PHONE_NUMBER = "PHONE_NUMBER";
	public static final String Col_ACTIVE_PROFILE = "ACTIVE_PROFILE";
	public static final String Col_PROFILE_ID = "PROFILE_ID";

	/** @author BWash
	 *
	 * @since 1/30/2021
	 * Create a helper object to create, open, and/or manage a database.
	 * This method always returns very quickly.  The database is not actually
	 * created or opened until one of {@link #getWritableDatabase} or
	 * {@link #getReadableDatabase} is called.
	 *
	 * @param context to use for locating paths to the the database
	 *            C:\Users\Brand\Full Sail\Project OASIS\Database
	 */
	public DataBaseAssistant(@Nullable Context context) {
		super(context,"Profile_DB", null, 1);
	}

	/** @author BWash
	 *
	 * @since 1/30/2021
	 * Called when the database is created for the first time. This is where the
	 * creation of tables and the initial population of the tables should happen.
	 *
	 * @param db The database.
	 */
	@Override
	public void onCreate(SQLiteDatabase db) {
		String createTableStatement = " CREATE TABLE " + CUSTOMER_TABLE + " (" + Col_PROFILE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + Col_PROFILE_NAME + " TEXT, " +
				Col_PHONE_NUMBER + " INT, " + Col_ACTIVE_PROFILE + " BOOL)";

		db.execSQL(createTableStatement);
	}

	/** @author BWash
	 *
	 * @since 1/30/2021
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

	/**@author BWash
	 *
	 * @since 1/30/2021
	 *
	 * Boolean "addOne" method -> writes data to the database
	 *
	 * */
	public boolean addOne (CustomerModel Profile){
		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues cv = new ContentValues();

		cv.put(Col_PROFILE_NAME, Profile.getName());
		cv.put(Col_PHONE_NUMBER, Profile.getPhone());
		cv.put(Col_ACTIVE_PROFILE, Profile.isActiveProfile());

		// Inserting into CUSTOMER_TABLE
		long insert = db.insert(CUSTOMER_TABLE, null, cv);

		// Add the true/false return IF statement
		if(insert == -1){
			return false;
		}else {
			return true;
		}
	}



}
