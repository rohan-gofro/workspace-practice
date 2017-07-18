
public class Employee {
	
	private String name;
	private Address address;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void dispEmployeeData()
	{
		System.out.println("Name -> " + name);
		address.dispAddress();
	}
	
	

}
