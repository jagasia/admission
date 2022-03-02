package com.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.springframework.stereotype.Component;

//use appropriate annotation to configure the Admission class as Component
@Component
public class Admission {
	
	@Pattern(regexp = "\\d{6}", message = "Admission ID should be a 6 digit positive number")
	@Min(value = 100000, message="Admission ID should be a 6 digit positive number")
	@Max(value=999999, message="Admission ID should be a 6 digit positive number")
	private String admissionId;
	private String deptName;
	private String preferHostel;
	private String firstGraduateInfo;
	private double tuitionFees;

	public String getAdmissionId() {
		return admissionId;
	}
	public void setAdmissionId(String admissionId) {
		this.admissionId = admissionId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getPreferHostel() {
		return preferHostel;
	}
	public void setPreferHostel(String preferHostel) {
		this.preferHostel = preferHostel;
	}
	public String getFirstGraduateInfo() {
		return firstGraduateInfo;
	}
	public void setFirstGraduateInfo(String firstGraduateInfo) {
		this.firstGraduateInfo = firstGraduateInfo;
	}
	public double getTuitionFees() {
		return tuitionFees;
	}
	public void setTuitionFees(double tuitionFees) {
		this.tuitionFees = tuitionFees;
	}
	
	

}
