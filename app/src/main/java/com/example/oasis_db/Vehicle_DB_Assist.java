package com.example.oasis_db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

/**
 * Declaring Global Variables
 *
 *
 *Vehicle_DB_Assist Database extends the sqlitehelper superCLass
 *
 */



public class Vehicle_DB_Assist extends SQLiteOpenHelper {

	public static final String VEHICLES_PROFILES_TABLE = "VEHICLES";
	public static final String COL_VEHICLE_MAKE = "VEHICLE_MAKE";
	public static final String COL_VEHICLE_MODEL = "VEHICLE_MODEL";
	public static final String COL_VEHICLE_YEAR = "VEHICLE_YEAR";
	public static final String COL_VEHICLE_VIN = "VEHICLE_VIN";
	public static final String COL_ODOMETER = "ODOMETER";

	/**
	 * Constructor for the Vehicle_DB_Assist class sends the final three
	 * parameters up to the super, using CONTEXT to locate the DB
	 *
	 * Passed through to the SuperClass
	 *  : OASIS_Vehicle_DB nameOfDB
	 *  : NULL factory
	 *  : 1 version
	 * */
	public Vehicle_DB_Assist(@Nullable Context context){
		super(context, "OASIS_Vehicle_DB", null, 1);
	}


	/**
	 * Called when the database is created for the first time. This is where the
	 * creation of tables and the initial population of the tables should happen.
	 *
	 * @param db The database.
	 */
	@Override
	public void onCreate(SQLiteDatabase db) {
		/**
		 * Creating the tables for the Database
		 *
		 * Vehicles
		 * Parts_of_a_vehicle
		 *
		 * */
		String createVehicleTableStatement = "CREATE TABLE " + VEHICLES_PROFILES_TABLE + " (ID_VEHICLE INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_VEHICLE_MAKE + " TEXT, " + COL_VEHICLE_MODEL + " TEXT," +
				COL_VEHICLE_YEAR + " INT, " + COL_VEHICLE_VIN + " LONGLONG, " + COL_ODOMETER + " LONG )";



		db.execSQL(createVehicleTableStatement);



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
