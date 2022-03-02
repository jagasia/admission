package com.service;

import org.springframework.stereotype.Service;

import com.model.Admission;

//use appropriate annotation to configure AdmissionService as Service
@Service
public class AdmissionService {
	
	public double calculateAdmissionFees(Admission obj)
	{
		double admissionFees=0.0;
		//fill the code
		
		double packageFees=0.0;
				
		switch (obj.getDeptName()) {
		case "EEE":
			obj.setTuitionFees(45000.0);
			packageFees=20000.0;
			break;
		case "ECE":
			obj.setTuitionFees(50000.0);
			packageFees=25000.0;
			break;
		case "CSE":
			obj.setTuitionFees(60000.0);
			packageFees=30000.0;
			break;		
		}
		
//		admissionFees = packageFees + tuitionFees + hostelFees
		double hostelFees=0.0;
		if(obj.getPreferHostel().equalsIgnoreCase("yes"))
		{
			hostelFees=75000.0;
		}
		
		admissionFees+=obj.getTuitionFees();
		
		if(!obj.getFirstGraduateInfo().equalsIgnoreCase("yes"))
		{	
			admissionFees+=packageFees+hostelFees;
		}
				
		
		return admissionFees;
	}

}
