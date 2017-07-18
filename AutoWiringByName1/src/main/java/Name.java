
public class Name {
	
	private String fname;
	private String lname;
	
	public Name()
	{
		System.out.println("Name Constructor");
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public void displayName()
	{
		System.out.println(fname + " " + lname);	
	}	

}
