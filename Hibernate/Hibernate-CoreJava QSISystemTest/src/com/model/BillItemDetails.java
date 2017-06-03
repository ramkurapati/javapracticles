package com.model;

public class BillItemDetails 
{

	private int id;
	private int bill_id;
	private int item_amount;
	private String item_description;

	public BillItemDetails(int id, int billid, int itemamount,
			String itemdescription) {
		super();
		this.id = id;
		this.bill_id = billid;
		this.item_amount = itemamount;
		this.item_description = itemdescription;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getBill_id() {
		return bill_id;
	}

	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}

	public int getItem_amount() {
		return item_amount;
	}

	public void setItem_amount(int item_amount) {
		this.item_amount = item_amount;
	}

	public String getItem_description() {
		return item_description;
	}

	public void setItem_description(String item_description) {
		this.item_description = item_description;
	}
	



}
