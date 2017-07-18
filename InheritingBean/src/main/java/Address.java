
public class Address {
	
	private int houseNo;
	private String locality;
	private String city;
	
	public Address()
	{
		
	}
	
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void dispAddress()
	{
		System.out.println("Address\nHNo. " + houseNo + " , " + locality + " , " + city);
	}
	
}
