package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.company.model.Company;
import com.company.model.StockPrice;



@Service
public class ViewDeleteCompanyServiceImpl implements ViewDeleteCompanyService {
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public ResponseEntity<String> getSingleCompanyDetails(String companycode) {
		// TODO Auto-generated method stub
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		String requestURL1 = "http://company-service/api/v1.0/market/company/info/"+companycode;
		ResponseEntity<String> responseEntity1 = restTemplate.exchange(requestURL1, HttpMethod.GET, entity, String.class);
		
		String requestURL2 = "http://stockprice-service/api/v1.0/market/stock/getlateststockprice/companycode/"+companycode;
		ResponseEntity<String> responseEntity2 = restTemplate.exchange(requestURL2, HttpMethod.GET, entity, String.class);
		return new ResponseEntity<String>(responseEntity1+"\n"+responseEntity2, HttpStatus.OK);
	}
	
	public ResponseEntity<Company[]> getAllCompanyDetails(){
		//HttpHeaders headers = new HttpHeaders();
		//HttpEntity<String> entity = new HttpEntity<String>(headers);
		String requestURL1 = "http://company-service/api/v1.0/market/company/info";
		String requestURL2 = "";
		ResponseEntity<Company[]> responseEntity1 = restTemplate.getForEntity(requestURL1, Company[].class);
		Company[] companies = responseEntity1.getBody();
		System.out.println(companies.length);
		for(int i=0;i<companies.length;i++) {
			requestURL2 = "http://stockprice-service/api/v1.0/market/stock/getlateststockprice/companycode/"+companies[i].getCompanyCode();
			System.out.println(requestURL2);
			ResponseEntity<StockPrice> responseEntity2 = restTemplate.getForEntity(requestURL2, StockPrice.class);
			StockPrice stockPrice = responseEntity2.getBody();
			System.out.println(stockPrice);
			companies[i].setStockPrice(stockPrice);
			System.out.println(companies[i].getStockPrice());
		}
		return new ResponseEntity<Company[]>(companies,HttpStatus.OK);
		
	}

	@Override
	public ResponseEntity<String> deleteCompanyDetails(String companycode) {
		// TODO Auto-generated method stub
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		String requestURL1 = "http://stockprice-service/api/v1.0/market/stock/delete/companycode/"+companycode;
		restTemplate.delete(requestURL1);
		String requestURL2 = "http://company-service/api/v1.0/market/company/delete/"+companycode;
		restTemplate.delete(requestURL2);
		return new ResponseEntity<String>("Company details deleted successfully",HttpStatus.OK);
	}

}
