import org.springframework.beans.factory.annotation.Autowired;

public class Student 
{
	
	private String name;
	private Address address;
	
	@Autowired
	public Student(String name , Address address)
	{
		this.name = name;
		this.address = address;
	}
	
	public void displayStudent()
	{
		System.out.println(name);
		System.out.println(address.toString());
	}

}
