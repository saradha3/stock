package com.stockdetails.service;

import java.util.Date;

import org.springframework.http.ResponseEntity;

import com.stockdetails.model.StockPrice;

public interface ViewStockDetailService {
	
	public ResponseEntity<StockPrice[]> getStockPriceBetween(String message);
	
	public ResponseEntity<StockPrice> getMaxStockPriceBetween(String message);
	
	public ResponseEntity<StockPrice> getMinStockPriceBetween(String message);
	

}
