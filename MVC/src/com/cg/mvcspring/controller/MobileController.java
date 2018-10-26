package com.cg.mvcspring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.mvcspring.dto.Mobile;
import com.cg.mvcspring.service.IMobileService;



@Controller

public class MobileController {
	@Autowired
	IMobileService mobileservice;
	
	@RequestMapping(value = "/home")
	public String getAllMobile(@ModelAttribute("my") Mobile mob,Map<String,Object> model) {  // linking between addmobile and mobile
		
		List<String> myList = new ArrayList<>();
		myList.add("Android");
		myList.add("iPhone");
		myList.add("Windows");
		
		model.put("cato",myList);
		return "AddMobile";
		
	}

	@RequestMapping(value = "adddata",method = RequestMethod.POST)
	public String addMobileData(@ModelAttribute("my") Mobile mobile) {
		mobileservice.addMobile(mobile);
		//System.out.println(mobile.getMobId() + mobile.getMobName() + mobile.getMobPrice()+mobile.getMobCategory());
        //System.out.println(mobile.getOnline()+" "+mobile.getMobCategory());
		return "success";
	}
	
	//SHOWING THE MOBILE DATA
	
	@RequestMapping(value = "showall",method = RequestMethod.GET)  //by default it is get
	public ModelAndView showAllMobileData() {
		List<Mobile> allMobile =  mobileservice.showAllMobile();
		System.out.println(allMobile);
		return new ModelAndView("mobileshow", "data", allMobile);
	                                                                                   
	}
}
	
