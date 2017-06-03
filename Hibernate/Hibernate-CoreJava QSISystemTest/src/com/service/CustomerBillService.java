package com.service;

import java.sql.SQLException;
import java.util.List;

import com.DAO.CustomerBillDAO;
import com.model.Bill;

public class CustomerBillService 
{
	
	private CustomerBillDAO cbdao;

	public void setCbdao(CustomerBillDAO cbdao) {
		this.cbdao = cbdao;
	}
	
	public void insert(Bill bill) throws SQLException
	{
		cbdao.insertBills(bill);
	}
	
	public List<Bill> display() throws SQLException
	{
		return cbdao.getBills();
		
	}
 
}
