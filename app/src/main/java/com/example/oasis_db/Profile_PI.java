package com.example.oasis_db;




public class Profile_PI {
	public static final String ERROR = "Error";

	private String id;
	private String first_name;
	private String last_name;
	private String address;
	private String address_mailing;
	private String city;
	private String state;
	private int zipCode;
	private String image;
	private int DateOfBirth;
	private int age;
	private long phone;
	private String email;
	private String password;
	private Profile_Key pw_key;
	private boolean hasVehicle;
	private boolean hasInsurance;
	private boolean hasWarranty;
	private boolean hasClaims;
	private String acsLvl;
	private boolean isActive;

	// Constructors

	// -->> Default Constructor
	public Profile_PI(){}

	// -->> Create Profile Constructor -> PI info only

	public Profile_PI(String id, String first_name, String last_name, String address, String address_mailing, String city, String state, int zipCode,
					  String image, int dateOfBirth, long phone, String email, String password) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.address_mailing = address_mailing;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.image = image;
		DateOfBirth = dateOfBirth;
		this.phone = phone;
		this.email = email;
		this.password = password;

	}

	// -->> Profile Creation Constructor

	public Profile_PI(String id, String first_name, String last_name, String address, String address_mailing, String city, String state, int zipCode,
					  String image, int dateOfBirth, long phone, String email, String password, boolean hasVehicle, boolean hasInsurance,
					  boolean hasWarranty, boolean hasClaims, boolean isActive) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.address_mailing = address_mailing;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.image = image;
		DateOfBirth = dateOfBirth;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.hasVehicle = hasVehicle;
		this.hasInsurance = hasInsurance;
		this.hasWarranty = hasWarranty;
		this.hasClaims = hasClaims;
		this.isActive = isActive;
	}

	// -->> Fully Parameterized Constructor
	public Profile_PI(String id, String first_name, String last_name, String address, String address_mailing,
					  String city, String state, int zipCode, String image, int dateOfBirth, int age, long phone, String email, String password,
					  Profile_Key pw_key, boolean hasVehicle, boolean hasInsurance, boolean hasWarranty,boolean hasClaims, String acsLvl, boolean isActive) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.address_mailing = address_mailing;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.image = image;
		this.DateOfBirth = dateOfBirth;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.pw_key = pw_key;
		this.hasVehicle = hasVehicle;
		this.hasInsurance = hasInsurance;
		this.hasWarranty = hasWarranty;
		this.hasClaims = hasClaims;
		this.acsLvl = acsLvl;
		this.isActive = isActive;
	}

// Constructor for "Error in Creating Profile"
	public Profile_PI(String id, String error, String i1, boolean b) {
		this.id = ERROR;
		this.first_name = ERROR;
		this.last_name = ERROR;
		this.address = ERROR;
		this.address_mailing = ERROR;
		this.city = ERROR;
		this.state = ERROR;
		this.zipCode = 0;
		this.image = ERROR;
		this.DateOfBirth = 0;
		this.age = 0;
		this.phone = 0;
		this.email = ERROR;
		this.password = ERROR;
		this.hasVehicle = false;
		this.hasInsurance = false;
		this.hasWarranty = false;
		this.hasClaims = false;
		this.acsLvl = ERROR;
		this.isActive = false;
	}

	// Methods
	// --> ToString

	@Override
	public String toString() {
		return "Profile_PI{" +
				"id=" + id +
				", first_name='" + first_name + '\'' +
				", last_name='" + last_name + '\'' +
				", address='" + address + '\'' +
				", address_mailing='" + address_mailing + '\'' +
				", city='" + city + '\'' +
				", state='" + state + '\'' +
				", zipCode=" + zipCode +
				", DateOfBirth=" + DateOfBirth +
				", age=" + age +
				", phone=" + phone +
				", email='" + email + '\'' +
				", password='" + password + '\'' +
				", hasVehicle=" + hasVehicle +
				", hasInsurance=" + hasInsurance +
				", hasWarranty=" + hasWarranty +
				", hasClaims=" + hasClaims +
				", acsLvl='" + acsLvl + '\'' +
				", isActive=" + isActive +
				'}';
	}


	// Getters and Setters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress_mailing() {
		return address_mailing;
	}

	public void setAddress_mailing(String address_mailing) {
		this.address_mailing = address_mailing;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getImage(){return image;}

	public void setImage(String image){this.image = image;}

	public int getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public Profile_Key getPw_key() { return pw_key; }

	public void setPw_key(Profile_Key pw_key) {	this.pw_key = pw_key; }

	public boolean isHasVehicle() {
		return hasVehicle;
	}

	public void setHasVehicle(boolean hasVehicle) {
		this.hasVehicle = hasVehicle;
	}

	public boolean isHasInsurance() {
		return hasInsurance;
	}

	public void setHasInsurance(boolean hasInsurance) {
		this.hasInsurance = hasInsurance;
	}

	public boolean isHasWarranty() {
		return hasWarranty;
	}

	public void setHasWarranty(boolean hasWarranty) {
		this.hasWarranty = hasWarranty;
	}

	public boolean isHasClaims() {	return hasClaims; }

	public void setHasClaims(boolean hasClaims) { this.hasClaims = hasClaims; }

	public String getAcsLvl() {
		return acsLvl;
	}

	public void setAcsLvl(String acsLvl) {
		this.acsLvl = acsLvl;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean active) {
		isActive = active;
	}
}
