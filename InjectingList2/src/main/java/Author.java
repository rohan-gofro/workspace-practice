
public class Author {
	
	public String name;
	public String email;
	
	public Author(){}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	void dispAuthor()
	{
		System.out.println(name + " - "+ email);
	}
}
