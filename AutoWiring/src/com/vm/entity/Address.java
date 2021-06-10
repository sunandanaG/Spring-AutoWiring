package com.vm.entity;

public class Address 
{
	
	private int dno;
	private String streetName;
	
		
public void setDno(int dno) {
		this.dno = dno;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


public void displayaddress()
{
	System.out.println("enter address variables");
	System.out.println("enter door no:"+dno);
	System.out.println("enter street name:"+streetName);
}
}
