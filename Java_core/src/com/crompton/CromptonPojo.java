package com.crompton;

import java.util.Date;

public class CromptonPojo {
	
	private String CustomerSAPCode,CustomerName,CustomerAddress1,CustomerAddress2,CustomerCity,CustomerState,CustomerCountry,CustomerEmail,CustomerGSTIN,SalesmanCode,SalesmanName;
	private int CustomerPINCode,CustomerStateCode;
	private Long CustomerMobile,CustomerTelephoneNumber,CustomerFaxNumber,SalesmanMobile;
	private Date DateActiveFrom,DateActiveTo;
	
	public String getCustomerSAPCode() {
		return CustomerSAPCode;
	}
	public void setCustomerSAPCode(String customerSAPCode) {
		CustomerSAPCode = customerSAPCode;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerAddress1() {
		return CustomerAddress1;
	}
	public void setCustomerAddress1(String customerAddress1) {
		CustomerAddress1 = customerAddress1;
	}
	public String getCustomerCity() {
		return CustomerCity;
	}
	
	public String getCustomerAddress2() {
		return CustomerAddress2;
	}
	public void setCustomerAddress2(String customerAddress2) {
		CustomerAddress2 = customerAddress2;
	}
	public void setCustomerCity(String customerCity) {
		CustomerCity = customerCity;
	}
	public String getCustomerState() {
		return CustomerState;
	}
	public void setCustomerState(String customerState) {
		CustomerState = customerState;
	}
	public String getCustomerCountry() {
		return CustomerCountry;
	}
	public void setCustomerCountry(String customerCountry) {
		CustomerCountry = customerCountry;
	}
	public String getCustomerEmail() {
		return CustomerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}
	public String getCustomerGSTIN() {
		return CustomerGSTIN;
	}
	public void setCustomerGSTIN(String customerGSTIN) {
		CustomerGSTIN = customerGSTIN;
	}
	public String getSalesmanCode() {
		return SalesmanCode;
	}
	public void setSalesmanCode(String salesmanCode) {
		SalesmanCode = salesmanCode;
	}
	public String getSalesmanName() {
		return SalesmanName;
	}
	public void setSalesmanName(String salesmanName) {
		SalesmanName = salesmanName;
	}
	public int getCustomerPINCode() {
		return CustomerPINCode;
	}
	public void setCustomerPINCode(int customerPINCode) {
		CustomerPINCode = customerPINCode;
	}
	public int getCustomerStateCode() {
		return CustomerStateCode;
	}
	public void setCustomerStateCode(int customerStateCode) {
		CustomerStateCode = customerStateCode;
	}
	public Long getCustomerMobile() {
		return CustomerMobile;
	}
	public void setCustomerMobile(Long customerMobile) {
		CustomerMobile = customerMobile;
	}
	public Long getCustomerTelephoneNumber() {
		return CustomerTelephoneNumber;
	}
	public void setCustomerTelephoneNumber(Long customerTelephoneNumber) {
		CustomerTelephoneNumber = customerTelephoneNumber;
	}
	public Long getCustomerFaxNumber() {
		return CustomerFaxNumber;
	}
	public void setCustomerFaxNumber(Long customerFaxNumber) {
		CustomerFaxNumber = customerFaxNumber;
	}
	public Long getSalesmanMobile() {
		return SalesmanMobile;
	}
	public void setSalesmanMobile(Long salesmanMobile) {
		SalesmanMobile = salesmanMobile;
	}
	public Date getDateActiveFrom() {
		return DateActiveFrom;
	}
	public void setDateActiveFrom(Date dateActiveFrom) {
		DateActiveFrom = dateActiveFrom;
	}
	public Date getDateActiveTo() {
		return DateActiveTo;
	}
	public void setDateActiveTo(Date dateActiveTo) {
		DateActiveTo = dateActiveTo;
	}
	@Override
	public String toString() {
		return "CromptonPojo [CustomerSAPCode=" + CustomerSAPCode + ", CustomerName=" + CustomerName
				+ ", CustomerAddress1=" + CustomerAddress1 + ", CustomerAddress2=" + CustomerAddress2
				+ ", CustomerCity=" + CustomerCity + ", CustomerState=" + CustomerState + ", CustomerCountry="
				+ CustomerCountry + ", CustomerEmail=" + CustomerEmail + ", CustomerGSTIN=" + CustomerGSTIN
				+ ", SalesmanCode=" + SalesmanCode + ", SalesmanName=" + SalesmanName + ", CustomerPINCode="
				+ CustomerPINCode + ", CustomerStateCode=" + CustomerStateCode + ", CustomerMobile=" + CustomerMobile
				+ ", CustomerTelephoneNumber=" + CustomerTelephoneNumber + ", CustomerFaxNumber=" + CustomerFaxNumber
				+ ", SalesmanMobile=" + SalesmanMobile + ", DateActiveFrom=" + DateActiveFrom + ", DateActiveTo="
				+ DateActiveTo + "]";
	}
	
	
	

}
