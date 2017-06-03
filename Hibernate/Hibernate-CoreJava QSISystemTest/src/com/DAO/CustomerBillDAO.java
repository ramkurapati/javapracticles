package com.DAO;

import java.sql.SQLException;
import java.util.List;

import com.model.Bill;

public interface CustomerBillDAO 
{

	public void insertBills(Bill bill) throws SQLException;
	public List<Bill> getBills() throws SQLException;
	
}
