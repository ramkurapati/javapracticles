package p2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="AccountInfo")
public class Account 
{
	@Id
	@Column(name="accnum")
	private long accNum;
	
	
	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	
	@Column(name="acctype")
	private String accType;
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}

	
	@Column(name="accBalance")
	private float accBalance;
	public float getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(float accBalance) {
		this.accBalance = accBalance;
	}


}
