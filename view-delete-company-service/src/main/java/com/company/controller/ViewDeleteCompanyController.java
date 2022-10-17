package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.model.Company;
import com.company.service.ViewDeleteCompanyService;

@RestController
@RequestMapping("/api/v1.0/market/companydetails/")
public class ViewDeleteCompanyController {
	
	@Autowired
	private ViewDeleteCompanyService viewDeleteCompanyService;
	
	@GetMapping("/{companycode}")
	public ResponseEntity<String> getSingleCompanyDetails(@PathVariable String companycode){
		ResponseEntity<String> singleCompanyDetails = this.viewDeleteCompanyService.getSingleCompanyDetails(companycode);
		return singleCompanyDetails;
	}
	
	//get all companies info
	@GetMapping("/getall")
	public ResponseEntity<Company[]> getAllCompanyDetails(){
		ResponseEntity<Company[]> allCompanyDetails = this.viewDeleteCompanyService.getAllCompanyDetails();
		return allCompanyDetails;
	}
	
	//delete company and all its stockprice details
	@DeleteMapping("/delete/{companycode}")
	public ResponseEntity<String> deleteCompanyDetails(@PathVariable String companycode){
		ResponseEntity<String> message = this.viewDeleteCompanyService.deleteCompanyDetails(companycode);
		return message;
	}

}
