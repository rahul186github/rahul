/*
 *java version "1.8.0_131"
 *05 April 2018
 *
 */
package com.retailer;

import java.util.Date;

public class Retailer {

	
	  String retailerCode,invoiceNo;
	  Date invoiceData,dueDate;
	  float totalValue,taxableValue;
	  
	public Retailer(String retailerCode, String invoiceNo, Date invoiceData, Date dueDate, float totalValue,
			float taxableValue) {
		super();
		this.retailerCode = retailerCode;
		this.invoiceNo = invoiceNo;
		this.invoiceData = invoiceData;
		this.dueDate = dueDate;
		this.totalValue = totalValue;
		this.taxableValue = taxableValue;
	}
	
	
	public Retailer() {
		super();
	}


	public String getRetailerCode() {
		return retailerCode;
	}
	public void setRetailerCode(String retailerCode) {
		this.retailerCode = retailerCode;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public Date getInvoiceData() {
		return invoiceData;
	}
	public void setInvoiceData(Date invoiceData) {
		this.invoiceData = invoiceData;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public float getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(float totalValue) {
		this.totalValue = totalValue;
	}
	public float getTaxableValue() {
		return taxableValue;
	}
	public void setTaxableValue(float taxableValue) {
		this.taxableValue = taxableValue;
	}

	@Override
	public String toString() {
		return "Retailer [retailerCode=" + retailerCode + ", invoiceNo=" + invoiceNo + ", invoiceData=" + invoiceData
				+ ", dueDate=" + dueDate + ", totalValue=" + totalValue + ", taxableValue=" + taxableValue + "]";
	}
	


}
