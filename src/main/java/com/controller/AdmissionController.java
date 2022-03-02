package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Admission;
import com.service.AdmissionService;

//use appropriate annotation to configure AdmissionController as Controller
@Controller
public class AdmissionController {
	
	@Autowired
	private AdmissionService service;
	
	@ModelAttribute("deptNameList")
	public Map<String, String> buildState()
	{
		Map<String, String> deptNameList=new HashMap<String, String>();
		deptNameList.put("EEE", "EEE");
		deptNameList.put("ECE", "ECE");
		deptNameList.put("CSE", "CSE");
		return deptNameList;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/feesCalculatorPage")
	public String feesCalculatorPage(@ModelAttribute("admission") Admission admission)
	{
		return "feescalculatorpage";
	}
	
	//invoke the service class - calculateAdmissionFees method.
	@RequestMapping(method = RequestMethod.POST, value = "/result")
	public String calculateAdmissionFees(@ModelAttribute("admission") @Valid Admission admission, BindingResult result,ModelMap map)
	{
		if(result.hasErrors())
		{
			return "feesCalculatorPage";
		}
		double total = service.calculateAdmissionFees(admission);
		map.addAttribute("total",total);
		return "result";
	}
	
	@ModelAttribute("preferenceList")
	public Map<String, String> getHostelPreference()
	{
		Map<String, String> preferenceList=new HashMap<>();
		preferenceList.put("YES", "YES");
		preferenceList.put("NO", "NO");
		return preferenceList;
	}

	@ModelAttribute("graduateList")
	public Map<String, String> getFirstGraduateInfo()
	{
		Map<String, String> firstGraduateInfo=new HashMap<>();
		firstGraduateInfo.put("YES", "YES");
		firstGraduateInfo.put("NO", "NO");
		return firstGraduateInfo;
	}
}
