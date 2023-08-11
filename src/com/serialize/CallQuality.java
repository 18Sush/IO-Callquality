package com.serialize;
import java.io.Serializable;
import java.io.*;

public class CallQuality implements Serializable {
	public int callid;
    public int callDuration;
    public String callQualityGrade;
    public String customerName;
    
    public CallQuality(int callid, int callDuration, String callQualityGrade, String customerName) {
		super();
		this.callid = callid;
		this.callDuration = callDuration;
		this.callQualityGrade = callQualityGrade;
		this.customerName = customerName;
	}


	public int getCallid() {
		return callid;
	}


	public void setCallid(int callid) {
		this.callid = callid;
	}


	public int getCallDuration() {
		return callDuration;
	}


	public void setCallDuration(int callDuration) {
		this.callDuration = callDuration;
	}


	public String getCallQualityGrade() {
		return callQualityGrade;
	}


	public void setCallQualityGrade(String callQualityGrade) {
		this.callQualityGrade = callQualityGrade;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
