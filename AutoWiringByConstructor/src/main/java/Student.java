public class Student {
	
	Address addr;
	Name nm;
	
	public Student(Address addr , Name nm){
		
		this.addr = addr;
		this.nm = nm;
		
	}
	
	public void disp()
	{
		addr.dispAddress();
		nm.dispName();
	}

}
