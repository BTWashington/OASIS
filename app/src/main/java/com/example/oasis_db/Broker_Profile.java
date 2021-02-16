package com.example.oasis_db;

public class Broker_Profile extends Profile_PI {
	private int broker_id;
	private String Location;
	private String Territory;
	private String Username;
	private String Broker_Password;
	private String Work_Role;
	private String Email;
	private long Phone;
	private int quote_pool;
	private boolean personalAuto_Ins;
	private boolean homeOwners_Ins;
	private boolean motorcycle_Ins;
	private boolean commercial_Ins;
	private boolean AutoCrossOver;
	private boolean active_profile;

	// Constructors

	// -->> Default Constructor
	public Broker_Profile(){}

	// -->> Fully Parameterized Constructors

	public Broker_Profile(int broker_id, String location, String territory, String username, String broker_Password, String work_Role,
						  String email, long phone, int quote_pool, boolean personalAuto_Ins, boolean homeOwners_Ins, boolean motorcycle_Ins,
						  boolean commercial_Ins, boolean autoCrossOver, boolean active_profile) {
		this.broker_id = broker_id;
		Location = location;
		Territory = territory;
		Username = username;
		Broker_Password = broker_Password;
		Work_Role = work_Role;
		Email = email;
		Phone = phone;
		this.quote_pool = quote_pool;
		this.personalAuto_Ins = personalAuto_Ins;
		this.homeOwners_Ins = homeOwners_Ins;
		this.motorcycle_Ins = motorcycle_Ins;
		this.commercial_Ins = commercial_Ins;
		AutoCrossOver = autoCrossOver;
		this.active_profile = active_profile;
	}

	public Broker_Profile(int id, String first_name, String last_name, String address, String address_mailing, String city, String state, int zipCode, int dateOfBirth, int age, long phone, String email,
						  boolean hasVehicle, boolean hasInsurance, boolean hasWarranty, String acsLvl, boolean isActive,
						  int broker_id, String location, String territory, String username, String broker_Password, String work_Role, String email1, long phone1, int quote_pool, boolean personalAuto_Ins,
						  boolean homeOwners_Ins, boolean motorcycle_Ins, boolean commercial_Ins, boolean autoCrossOver, boolean active_profile) {
		super(id, first_name, last_name, address, address_mailing, city, state, zipCode, dateOfBirth, age, phone, email, hasVehicle, hasInsurance, hasWarranty, acsLvl, isActive);
		this.broker_id = broker_id;
		Location = location;
		Territory = territory;
		Username = username;
		Broker_Password = broker_Password;
		Work_Role = work_Role;
		Email = email1;
		Phone = phone1;
		this.quote_pool = quote_pool;
		this.personalAuto_Ins = personalAuto_Ins;
		this.homeOwners_Ins = homeOwners_Ins;
		this.motorcycle_Ins = motorcycle_Ins;
		this.commercial_Ins = commercial_Ins;
		AutoCrossOver = autoCrossOver;
		this.active_profile = active_profile;
	}

	// Methods
	// -->> ToString

	@Override
	public String toString() {
		return "Broker_Profile{" +
				"broker_id=" + broker_id +
				", Location='" + Location + '\'' +
				", Territory='" + Territory + '\'' +
				", Username='" + Username + '\'' +
				", Broker_Password='" + Broker_Password + '\'' +
				", Work_Role='" + Work_Role + '\'' +
				", Email='" + Email + '\'' +
				", Phone='" + Phone + '\'' +
				", quote_pool=" + quote_pool +
				", personalAuto_Ins=" + personalAuto_Ins +
				", homeOwners_Ins=" + homeOwners_Ins +
				", motorcycle_Ins=" + motorcycle_Ins +
				", commercial_Ins=" + commercial_Ins +
				", AutoCrossOver=" + AutoCrossOver +
				", active_profile=" + active_profile +
				'}';
	}


	// Getter and Setters


	public int getBroker_id() {
		return broker_id;
	}

	public void setBroker_id(int broker_id) {
		this.broker_id = broker_id;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getTerritory() {
		return Territory;
	}

	public void setTerritory(String territory) {
		Territory = territory;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getBroker_Password() {
		return Broker_Password;
	}

	public void setBroker_Password(String broker_Password) {
		Broker_Password = broker_Password;
	}

	public String getWork_Role() {
		return Work_Role;
	}

	public void setWork_Role(String work_Role) {
		Work_Role = work_Role;
	}

	@Override
	public String getEmail() {
		return Email;
	}

	@Override
	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public long getPhone() {
		return Phone;
	}

	public void setPhone(long phone) {
		Phone = phone;
	}

	public int getQuote_pool() {
		return quote_pool;
	}

	public void setQuote_pool(int quote_pool) {
		this.quote_pool = quote_pool;
	}

	public boolean isPersonalAuto_Ins() {
		return personalAuto_Ins;
	}

	public void setPersonalAuto_Ins(boolean personalAuto_Ins) {
		this.personalAuto_Ins = personalAuto_Ins;
	}

	public boolean isHomeOwners_Ins() {
		return homeOwners_Ins;
	}

	public void setHomeOwners_Ins(boolean homeOwners_Ins) {
		this.homeOwners_Ins = homeOwners_Ins;
	}

	public boolean isMotorcycle_Ins() {
		return motorcycle_Ins;
	}

	public void setMotorcycle_Ins(boolean motorcycle_Ins) {
		this.motorcycle_Ins = motorcycle_Ins;
	}

	public boolean isCommercial_Ins() {
		return commercial_Ins;
	}

	public void setCommercial_Ins(boolean commercial_Ins) {
		this.commercial_Ins = commercial_Ins;
	}

	public boolean isAutoCrossOver() {
		return AutoCrossOver;
	}

	public void setAutoCrossOver(boolean autoCrossOver) {
		AutoCrossOver = autoCrossOver;
	}

	public boolean isActive_profile() {
		return active_profile;
	}

	public void setActive_profile(boolean active_profile) {
		this.active_profile = active_profile;
	}
}
