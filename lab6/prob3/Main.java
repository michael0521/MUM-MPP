package lab6.prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Main {
	private static final String NAME = "name";
	private static final String STREET = "street";
	private static final String CITY = "city";
	private static final String ZIP = "zip";

	// Use the DomServiceClass to get all customers
	// whose city of residence begins with "Ma", in sorted order.
	// Create
	public List<Customer> allCustomersBeginWithMa() throws DomException {
		DomServiceClass dsc = new DomServiceClass("src/lesson6/lab6/prob3/customer.xml");
		List<Properties> list = dsc.lookupEntry("city", "Ma");
		List<Customer> customers = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			Customer c = new Customer(list.get(i).getProperty("name"), list
					.get(i).getProperty("zip"),
					list.get(i).getProperty("city"), list.get(i).getProperty(
							"street"));
			customers.add(c);
		}
		return customers;
	}

	public static void main(String[] args) throws DomException {
		Main m = new Main();
		List<Customer> list = m.allCustomersBeginWithMa();
		System.out.println(list);

	}

}
