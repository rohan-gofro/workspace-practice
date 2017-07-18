
public class Employee {
	
	private Name nm;
	private Address addr;
	
	public Employee()
	{
		System.out.println("Employee Object Created");
	}
	
	public void setNm(Name nm) {
		this.nm = nm;
	}
	
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	public void displayData()
	{
		nm.displayName();
		addr.displyAddr();
	}

}
