package lab10.prob4;

public class Customer {
	private String name;
	private String street;
	private String city;
	private String zip;
	public Customer(String n, String s, String c, String z) {
		name = n;
		street = s;
		city = c;
		zip = z;
	}
	@Override
	public String toString() {
		return "(" + name + ", " + street + ", " + city + ", " + zip + ")";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
}
