package Sample_Data;

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
