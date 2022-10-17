package com.stockdetails.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.stockdetails.model.StockPrice;

@Service
public class ViewStockDetailServiceImpl implements ViewStockDetailService {
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public ResponseEntity<StockPrice[]> getStockPriceBetween(String message) {
		// TODO Auto-generated method stub
		String requestURL1 = "http://stockprice-service/api/v1.0/market/stock/getstockpricebetween/"+message;
		ResponseEntity<StockPrice[]> responseEntity1 = restTemplate.getForEntity(requestURL1, StockPrice[].class);
		StockPrice[] stockPrice = responseEntity1.getBody();
		System.out.println(stockPrice.length);
		
		
		return new ResponseEntity<StockPrice[]>(stockPrice,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<StockPrice> getMaxStockPriceBetween(String message) {
		// TODO Auto-generated method stub
		String requestURL1 = "http://stockprice-service/api/v1.0/market/stock/getmaxstockpricebetween/"+message;
		ResponseEntity<StockPrice> responseEntity1 = restTemplate.getForEntity(requestURL1, StockPrice.class);
		StockPrice stockPrice = responseEntity1.getBody();
		return new ResponseEntity<StockPrice>(stockPrice,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<StockPrice> getMinStockPriceBetween(String message) {
		// TODO Auto-generated method stub
		String requestURL1 = "http://stockprice-service/api/v1.0/market/stock/getminstockpricebetween/"+message;
		ResponseEntity<StockPrice> responseEntity1 = restTemplate.getForEntity(requestURL1, StockPrice.class);
		StockPrice stockPrice = responseEntity1.getBody();
		return new ResponseEntity<StockPrice>(stockPrice,HttpStatus.OK);
	}

}
