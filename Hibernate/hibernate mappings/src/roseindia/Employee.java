package roseindia;



public class Employee {

	private int id;
	private String name;
	private EmployeeAddress address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EmployeeAddress getAddress() {
		address.setEmpid(getId());
		return address;
	}
	public void setAddress(EmployeeAddress address) {
		this.address = address;
	}
	
}
