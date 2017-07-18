public class Employee {
	
	private String name;
	private String dept;
	private Address address;
	
		
	public Employee(Address address) {
	
		this.address = address;
	}
	

	public void setName(String name) {
		this.name = name;
	}


	public void setDepartment(String dept) {
		this.dept = dept;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public void displayData()
	{
		System.out.println(name + " - " + dept + " - " + address);
	}

}
