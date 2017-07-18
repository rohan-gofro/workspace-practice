
public class Solutions {
	
	int sid;
	String solution;
	Author author;
	
	public Solutions()
	{
		
	}
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public void dispSolution()
	{
		System.out.println(sid + " - " + solution);
		System.out.println("Author -- ");
		author.dispAuthor();
	}
	
	

}
