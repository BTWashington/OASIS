package com.example.oasis_db;
/**@author BWash
 * @version 1.00
 * @since  1/30/2021
 *
 * !PPI
 * This is the definition of the 'Customer' or 'Client'
 * Uses: Quoting -> Online quote request/ Paul's Wall
 * 		 Creating Profiles for Clients
 * 		 Triggering Vehicle
 * 		 Triggering Insurance
 * 		 Triggering Warranty
 * */

public class CustomerModel {
	private int id;
	private String name;
	private int phone;
	private boolean activeProfile;

	// Constructors
	/**@author BWash
	 *
	 * @since  1/30/2021
	 *
	 * Constructors -> One Default (non - parameterized) Constructor
	 * 				-> One Full Assignment Constructor
	 *
	 * */

	public CustomerModel(int id, String name, int phone, boolean activeProfile) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.activeProfile = activeProfile;
	}

	public CustomerModel() {
	}

	// ToString Method
	/**@author BWash
	 *
	 * @since  1/30/2021
	 *
	 * Methods -> ToString()
	 * 				Takes all of the properties and places them into a String
	 * 				Uses: Used to print
	 * 						-> For Logs
	 * 						-> Pop-up messages
	 * 						-> Lists to be used in other
	 * 							parts of the application
	 *
	 * */
	@Override
	public String toString() {
		return "CustomerModel{" +
				"id=" + id +
				", name='" + name + '\'' +
				", phone=" + phone +
				", activeProfile=" + activeProfile +
				'}';
	}


	// Getters and Setters
	/**@author BWash
	 *
	 * @since  1/30/2021
	 *
	 * Getters and Setters -> All private properties are set with a public
	 * 						-> Getter and a public Setter
	 * 					-> Allows access to private class properties
	 * 					> id
	 * 					> name
	 * 					> phone
	 * 					> activeProfile
	 *
	 * */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public boolean isActiveProfile() {
		return activeProfile;
	}

	public void setActiveProfile(boolean activeProfile) {
		this.activeProfile = activeProfile;
	}
}
