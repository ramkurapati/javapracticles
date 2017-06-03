package com.model;

import java.util.List;

public class Bill 
{

	private int id;
	private String bill_date;
	private int total_amount;
	private String bill_description;

	int totalbill=0;
	private List<BillItemDetails> billitemdetailsList;
	public Bill()
	{
	}

	public Bill(int id, String billdate,
			String billdescription,List<BillItemDetails> billitemdetailsList) 
	{

		this.id = id;
		this.bill_date = billdate;
		this.bill_description = billdescription;
		this.billitemdetailsList=billitemdetailsList;
		int totalbill=0;
		for(BillItemDetails i:this.billitemdetailsList)
		{
			totalbill=totalbill+i.getItem_amount();
		}
		this.total_amount=totalbill;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

	public String getBill_date() {
		return bill_date;
	}

	public void setBill_date(String bill_date) {
		this.bill_date = bill_date;
	}

	public int getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}

	public String getBill_description() {
		return bill_description;
	}

	public void setBill_description(String bill_description) {
		this.bill_description = bill_description;
	}

	public List<BillItemDetails> getBillitemdetailsList() {
		return billitemdetailsList;
	}

	public void setBillitemdetailsList(List<BillItemDetails> billitemdetailsList) {
		this.billitemdetailsList = billitemdetailsList;
	}
	

}
