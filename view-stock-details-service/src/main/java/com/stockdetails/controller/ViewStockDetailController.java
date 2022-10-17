package com.stockdetails.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockdetails.model.StockPrice;
import com.stockdetails.service.ViewStockDetailService;

@RestController
@RequestMapping("/api/v1.0/market/stockdetails")
public class ViewStockDetailController {
	
	@Autowired
	private ViewStockDetailService viewStockDetailService;
	
	@GetMapping("/getstockbetween/{message}")
	public ResponseEntity<StockPrice[]> getStockPriceBetween(@PathVariable String message){
		
		ResponseEntity<StockPrice[]> stockPriceBetween = this.viewStockDetailService.getStockPriceBetween(message);
		return stockPriceBetween;
		
	}

	@GetMapping("/getmaxstockbetween/{message}")
	public ResponseEntity<StockPrice> getMaxStockPriceBetween(@PathVariable String message){
		
		ResponseEntity<StockPrice> maxStockPriceBetween = this.viewStockDetailService.getMaxStockPriceBetween(message);
		return maxStockPriceBetween;
		
	}
	
	@GetMapping("/getminstockbetween/{message}")
	public ResponseEntity<StockPrice> getMinStockPriceBetween(@PathVariable String message){
		
		ResponseEntity<StockPrice> minStockPriceBetween = this.viewStockDetailService.getMinStockPriceBetween(message);
		return minStockPriceBetween;
		
	}

}
