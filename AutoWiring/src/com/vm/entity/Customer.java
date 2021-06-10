package com.vm.entity;

public class Customer {
	private int id;
	private String name;
	private Address address;
	private Order order;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public void displaycustomerInfo()
	{
		System.out.println("id is:"+id);
		System.out.println("name is:"+name);
		order.displayorderdetails();
		address.displayaddress();
	}

}
