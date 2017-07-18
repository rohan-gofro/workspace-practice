
public class Address {
	
	private int houseNo;
	private String locality;
	private String city;
	private String state;
	
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", locality=" + locality + ", city=" + city + ", State=" + state + "]";
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

	public void setState(String state) {
		this.state = state;
	}

}
