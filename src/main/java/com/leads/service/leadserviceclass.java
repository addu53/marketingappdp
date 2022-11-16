package com.leads.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leads.antites.leadgenerator;
import com.leads.repository.leadRepository;

@Service
public class leadserviceclass implements leadService {

	
	@Autowired
	private leadRepository leadrepo;
	@Override
	public void saveonelead(leadgenerator l) {
		leadrepo.save(l);
		
	}

}
