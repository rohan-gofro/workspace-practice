public class Address 
{	
	private String city;
	private String country;
	
	public Address()
	{
		System.out.println("Address object created");
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}
	
	public void displayData()
	{
		System.out.println(city + " , " + country);
	}

}