package com.stockprice.payloads;

import java.util.Date;

public class StockPriceDto {

	private int stockPriceId;
	
	private String companyCode;
	
	private double stockPrice;
	
	private Date date;
	
	private String time;

	public StockPriceDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StockPriceDto(int stockPriceId, String companyCode, double stockPrice, Date date, String time) {
		super();
		this.stockPriceId = stockPriceId;
		this.companyCode = companyCode;
		this.stockPrice = stockPrice;
		this.date = date;
		this.time = time;
	}

	public int getStockPriceId() {
		return stockPriceId;
	}

	public void setStockPriceId(int stockPriceId) {
		this.stockPriceId = stockPriceId;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
}
