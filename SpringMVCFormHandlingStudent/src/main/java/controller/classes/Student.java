package controller.classes;

public class Student {
	
	private String name;
	private int age;
	private String address;
	
	public Student()
	{
		System.out.println("Default constructor of student called");
	}
	
	public String getName() {
		System.out.println("Calling getter method for name");
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		System.out.println("Setter Method for name called");
	}
	
	public int getAge() {
		System.out.println("Calling getter method for age");
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
		System.out.println("Setter Method for Age called");
	}
	
	public String getAddress() {
		System.out.println("Calling getter method for address");
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
		System.out.println("Setter Method for address called");
	}
	
}
