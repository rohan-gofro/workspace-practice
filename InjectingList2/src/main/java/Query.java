import java.util.List;

public class Query {
	
	
	private int qid;
	private String query;
	private String user;
	private List<Solutions> solutions;
	
	public void setQid(int qid) {
		this.qid = qid;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public void setSolutions(List<Solutions> ls) {
		this.solutions = ls;
	}
	
	public void setQuery(String query) {
		this.query = query;
	}
	void dispQuery()
	{
		System.out.println(qid + " - " + query);
		System.out.println("By -" + user);
		System.out.println("Solutions");
		for(Solutions i:solutions){
			i.dispSolution();
		}
	}

}
