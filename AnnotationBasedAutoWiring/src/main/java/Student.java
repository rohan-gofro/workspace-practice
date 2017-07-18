import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	
	private int rollNo;
	@Autowired
	private Name name;
	
	@Required
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	/*
	public void setName(Name name) {
		this.name = name;
	}*/
	
	public void dispdata()
	{
		System.out.println("Roll No is: " + rollNo);
		name.dispName();
	}

}
