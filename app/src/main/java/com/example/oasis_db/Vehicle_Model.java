package com.example.oasis_db;

public class Vehicle_Model {
	private int vehicle_id;
	private String NameOfDealership;
	private int yearOfVehicle;
	private String makeOfVehicle;
	private String modelOfVehicle;
	private long VehicleIdentificationNumber;
	private int Odometer;
	private boolean HasInsurance;
	private boolean HasWarranty;
	private boolean HasRoadAssistance;
	private boolean HasClaims;

	// Constructors

	public Vehicle_Model(){}


	public Vehicle_Model(int vehicle_id, String nameOfDealership, int yearOfVehicle, String makeOfVehicle, String modelOfVehicle,
						 long vehicleIdentificationNumber, int odometer, boolean hasInsurance, boolean hasWarranty,
						 boolean hasRoadAssistance, boolean hasClaims) {
		this.vehicle_id = vehicle_id;
		NameOfDealership = nameOfDealership;
		this.yearOfVehicle = yearOfVehicle;
		this.makeOfVehicle = makeOfVehicle;
		this.modelOfVehicle = modelOfVehicle;
		VehicleIdentificationNumber = vehicleIdentificationNumber;
		Odometer = odometer;
		HasInsurance = hasInsurance;
		HasWarranty = hasWarranty;
		HasRoadAssistance = hasRoadAssistance;
		HasClaims = hasClaims;
	}

	// Methods -> ToString()

	@Override
	public String toString() {
		return "Vehicle_Model{" +
				"vehicle_id=" + vehicle_id +
				", NameOfDealership='" + NameOfDealership + '\'' +
				", yearOfVehicle=" + yearOfVehicle +
				", makeOfVehicle='" + makeOfVehicle + '\'' +
				", modelOfVehicle='" + modelOfVehicle + '\'' +
				", VehicleIdentificationNumber=" + VehicleIdentificationNumber +
				", Odometer=" + Odometer +
				", HasInsurance=" + HasInsurance +
				", HasWarranty=" + HasWarranty +
				", HasRoadAssistance=" + HasRoadAssistance +
				", HasClaims=" + HasClaims +
				'}';
	}


	// Getters and Setters


	public int getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public String getNameOfDealership() {
		return NameOfDealership;
	}

	public void setNameOfDealership(String nameOfDealership) {
		NameOfDealership = nameOfDealership;
	}

	public int getYearOfVehicle() {
		return yearOfVehicle;
	}

	public void setYearOfVehicle(int yearOfVehicle) {
		this.yearOfVehicle = yearOfVehicle;
	}

	public String getMakeOfVehicle() {
		return makeOfVehicle;
	}

	public void setMakeOfVehicle(String makeOfVehicle) {
		this.makeOfVehicle = makeOfVehicle;
	}

	public String getModelOfVehicle() {
		return modelOfVehicle;
	}

	public void setModelOfVehicle(String modelOfVehicle) {
		this.modelOfVehicle = modelOfVehicle;
	}

	public long getVehicleIdentificationNumber() {
		return VehicleIdentificationNumber;
	}

	public void setVehicleIdentificationNumber(long vehicleIdentificationNumber) {
		VehicleIdentificationNumber = vehicleIdentificationNumber;
	}

	public int getOdometer() {
		return Odometer;
	}

	public void setOdometer(int odometer) {
		Odometer = odometer;
	}

	public boolean isHasInsurance() {
		return HasInsurance;
	}

	public void setHasInsurance(boolean hasInsurance) {
		HasInsurance = hasInsurance;
	}

	public boolean isHasWarranty() {
		return HasWarranty;
	}

	public void setHasWarranty(boolean hasWarranty) {
		HasWarranty = hasWarranty;
	}

	public boolean isHasRoadAssistance() {
		return HasRoadAssistance;
	}

	public void setHasRoadAssistance(boolean hasRoadAssistance) {
		HasRoadAssistance = hasRoadAssistance;
	}

	public boolean isHasClaims() {
		return HasClaims;
	}

	public void setHasClaims(boolean hasClaims) {
		HasClaims = hasClaims;
	}
}
