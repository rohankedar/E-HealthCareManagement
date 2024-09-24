package com.entity;

public class Bill {

	private int id;
	private String fullName;
	private int doctorcharges;
	private String medicinenames;
	private String diseases;
	private int medicinequantity;
	private int medicinecharges;
	private int bedcharges;
	private int nursecharges;
	private int extracharges;
	private double amountDue;
	private String pymentStatus;
	
	public Bill(int id2, String fullName2, int doctorcharges2, String medicinenames2, String diseases2, int medicinequantity2, int medicinecharges2, int bedcharges2, int nursecharges2, int extracharges2, double amountDue2, String pymentStatus2) {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getDoctorcharges() {
		return doctorcharges;
	}

	public void setDoctorcharges(int doctorcharges) {
		this.doctorcharges = doctorcharges;
	}

	public String getMedicinenames() {
		return medicinenames;
	}

	public void setMedicinenames(String medicinenames) {
		this.medicinenames = medicinenames;
	}

	public String getDiseases() {
		return diseases;
	}

	public void setDiseases(String diseases) {
		this.diseases = diseases;
	}

	public int getMedicinequantity() {
		return medicinequantity;
	}

	public void setMedicinequantity(int medicinequantity) {
		this.medicinequantity = medicinequantity;
	}

	public int getMedicinecharges() {
		return medicinecharges;
	}

	public void setMedicinecharges(int medicinecharges) {
		this.medicinecharges = medicinecharges;
	}

	public int getBedcharges() {
		return bedcharges;
	}

	public void setBedcharges(int bedcharges) {
		this.bedcharges = bedcharges;
	}

	public int getNursecharges() {
		return nursecharges;
	}

	public void setNursecharges(int nursecharges) {
		this.nursecharges = nursecharges;
	}

	public int getExtracharges() {
		return extracharges;
	}

	public void setExtracharges(int extracharges) {
		this.extracharges = extracharges;
	}

	public double getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}

	public String getPymentStatus() {
		return pymentStatus;
	}

	public void setPymentStatus(String pymentStatus) {
		this.pymentStatus = pymentStatus;
	}
	
	
	
}
