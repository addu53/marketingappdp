package com.leads.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.leads.antites.leadgenerator;
import com.leads.dto.Leaddata;

import com.leads.repository.leadRepository;
import com.leads.service.leadService;

@Controller
public class leadController {
	
	@Autowired
	private leadService leadservice;
	
@RequestMapping("/v01")
	public String viewpage() {
		return "viewpage";
			
	}
//@RequestMapping(value="savev1",method = RequestMethod.POST)
//public String saveonelead(@ModelAttribute("lead")leadgenerator l) {
	//leadservice.saveonelead(l);
	//return"viewpage";

//@RequestMapping(value="savev1",method = RequestMethod.POST)
//public String saveonelead(@RequestParam("productname")String p,@RequestParam("quantity")String q,
	//	@RequestParam("name")String n,@RequestParam("mobile")String m,@RequestParam("location")String loc) {
	//leadgenerator lead= new leadgenerator();
	//lead.setProductname(p);
	//lead.setQuantity(q);
	//lead.setName(n);
	//lead.setMobile(m);
	//lead.setLocation(loc);
	//leadservice.saveonelead(lead);
	//return"viewpage";


@RequestMapping(value="savev1",method = RequestMethod.POST)
public String saveonelead(Leaddata data) {
	leadgenerator l=new leadgenerator();
	l.setProductname(data.getProductname());
	l.setName(data.getName());
	l.setMobile(data.getMobile());
	l.setLocation(data.getLocation());
	l.setQuantity(data.getQuantity());
	leadservice.saveonelead(l);
	return"viewpage";
}
}
