package com.example.oasis_db;

public class Profile_PI {
	private int id;
	private String first_name;
	private String last_name;
	private String address;
	private String address_mailing;
	private String city;
	private String state;
	private int zipCode;
	private int DateOfBirth;
	private int age;
	private long phone;
	private String email;
	private boolean hasVehicle;
	private boolean hasInsurance;
	private boolean hasWarranty;
	private String acsLvl;
	private boolean isActive;

	// Constructors

	// -->> Default Constructor
	public Profile_PI(){}

	// -->> Fully Parameterized Constructor
	public Profile_PI(int id, String first_name, String last_name, String address, String address_mailing,
					  String city, String state, int zipCode, int dateOfBirth, int age, long phone, String email,
					  boolean hasVehicle, boolean hasInsurance, boolean hasWarranty, String acsLvl, boolean isActive) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.address_mailing = address_mailing;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		DateOfBirth = dateOfBirth;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.hasVehicle = hasVehicle;
		this.hasInsurance = hasInsurance;
		this.hasWarranty = hasWarranty;
		this.acsLvl = acsLvl;
		this.isActive = isActive;
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
				", hasVehicle=" + hasVehicle +
				", hasInsurance=" + hasInsurance +
				", hasWarranty=" + hasWarranty +
				", acsLvl='" + acsLvl + '\'' +
				", isActive=" + isActive +
				'}';
	}


	// Getters and Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
