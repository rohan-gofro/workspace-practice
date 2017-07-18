public class Student {

	private String name;
	private int age;
	
	public Student(){
	
		System.out.println("Object created");
		
	}
	
	public Student(int age){
		
		this.age = age;
		
	}
	
	public Student(String name){
		
		this.name = name;
		
	}
	
	public Student(String name , int age){
		
		System.out.println("Created");
		
		this.name = name;
		this.age = age;
		
	}
	
	public void display(){
		
		System.out.println("Name --> " + name + " Age --> " + age);
		
	}
	
}
