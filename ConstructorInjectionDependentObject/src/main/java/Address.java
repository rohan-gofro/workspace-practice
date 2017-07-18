
public class Address {

	private int houseNo;
	private String street;
	private String city;
	
	public Address()
	{
	}
	
	public  Address(int houseNo , String street , String city)
	{
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
	}
	
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString()
	{
		return (houseNo + " - " + street + " - " + city);
	}

}
