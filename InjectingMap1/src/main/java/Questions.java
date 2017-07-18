import java.util.Map;

public class Questions {
	
	private int id;
	private String question;
	private Map<Integer, String> ans;
	
	public Questions()
	{
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public void setAns(Map<Integer, String> ans) {
		this.ans = ans;
	}
	
	public void dispQuestions()
	{
		System.out.println("\nAnswers:");
		System.out.println(id + " - " + question);
		for(Map.Entry<Integer , String> obj: ans.entrySet())
		{
			System.out.println(obj.getKey());
			System.out.println(obj.getValue());
		}
	}

}
