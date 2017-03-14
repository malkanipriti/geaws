package com.citiustech.ge.aws.main.bean;

import org.springframework.data.annotation.Id;

public class PatientBean {

	@Id
	private String patientId;

	public String getPatientId() {
		return patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public String getPatientGender() {
		return patientGender;
	}



	private String patientName;
	private String patientGender;

	PatientBean() {
	}

	public PatientBean( String patientName, String patientGender) {
		this.patientName = patientName;
		this.patientGender = patientGender;
	}

	// Other getters are omitted

	public void update(String patientName, String patientGender) {
		this.patientName = patientName;
		this.patientGender = patientGender;

	}

	

	@Override
	public String toString() {
		return "Patient{" + "id=" + patientId + ", name='" + patientName + '\'' + ", gender ='" + patientGender + '\''
				+ '}';
	}

}
