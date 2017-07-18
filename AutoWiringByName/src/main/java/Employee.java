public class Employee {
	
	private String name;
	private Address addr;
	
	public Employee(){
		
		System.out.println("Employee object created");
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(Address addr) {
		this.addr = addr;
	}
	
	void disp()
	{
		System.out.println(name);
		addr.displayData();
	}
	
}
