import java.util.List;

public class Questions {
	
	private int qid;
	private String name;
	private List<String> answers;
	
	public Questions(){}
	
	public void setQid(int qid) {
		this.qid = qid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	public void Dispdata()
	{
		System.out.println(qid + " -> " + name);
		for(String i:answers)
			System.out.println(i);
	}
	
	
	
}
