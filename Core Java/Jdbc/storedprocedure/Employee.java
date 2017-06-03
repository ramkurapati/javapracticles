/**
 * 
 */
package storedprocedure;

import java.sql.Date;


/**
 * @author ram
 *
 */
public class Employee {

	/**
	 * @param args
	 */
	private String id;
	private String name;
	private String dob;
	private int salary;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
