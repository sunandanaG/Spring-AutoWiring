package com.vm.entity;

public class Order {
	private int orderid;
	private String productname;
	private int  Quantity;
	
	
	
	
	public Order(int orderid, String productname, int quantity) {
		super();
		this.orderid = orderid;
		this.productname = productname;
		Quantity = quantity;
	}




	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", productname=" + productname + ", Quantity=" + Quantity + "]";
	}




	public void displayorderdetails()
	{
		System.out.println("------order details-----");
		System.out.println("order id is:"+orderid);
		System.out.println("product name is:"+productname);
		System.out.println("quantity:"+Quantity);
		
	}
	

}
