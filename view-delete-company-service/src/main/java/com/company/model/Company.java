package com.company.model;



public class Company {
	
	private int companyId;
	private String companyCode;
	private String companyName;
	private String companyCEO;
	private int companyTurnover;
	private String companyWebsite;
	private String stockExchange;
	private StockPrice stockPrice;
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(int companyId, String companyCode, String companyName, String companyCEO, int companyTurnover,
			String companyWebsite, String stockExchange, StockPrice stockPrice) {
		super();
		this.companyId = companyId;
		this.companyCode = companyCode;
		this.companyName = companyName;
		this.companyCEO = companyCEO;
		this.companyTurnover = companyTurnover;
		this.companyWebsite = companyWebsite;
		this.stockExchange = stockExchange;
		this.stockPrice = stockPrice;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyCEO() {
		return companyCEO;
	}
	public void setCompanyCEO(String companyCEO) {
		this.companyCEO = companyCEO;
	}
	public int getCompanyTurnover() {
		return companyTurnover;
	}
	public void setCompanyTurnover(int companyTurnover) {
		this.companyTurnover = companyTurnover;
	}
	public String getCompanyWebsite() {
		return companyWebsite;
	}
	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public StockPrice getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(StockPrice stockPrice) {
		this.stockPrice = stockPrice;
	}
	
	

}
