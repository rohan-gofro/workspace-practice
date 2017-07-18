
public class Student {
	
	private int rollNo;
	private String name;
	
	public Student(){}
	
	public Student(int rollNo)
	{
		this.rollNo = rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void dispData() {
		
		System.out.println("RollNo -> " + rollNo + "\nName -> " + name);
	}
}
