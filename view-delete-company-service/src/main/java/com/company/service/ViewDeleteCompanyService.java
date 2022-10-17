package com.company.service;

import org.springframework.http.ResponseEntity;

import com.company.model.Company;



public interface ViewDeleteCompanyService {
	
	public ResponseEntity<String> getSingleCompanyDetails(String companycode);
	
	public ResponseEntity<Company[]> getAllCompanyDetails();
	
	public ResponseEntity<String> deleteCompanyDetails(String companycode);

}
