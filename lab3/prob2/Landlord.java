package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
	
	private List<Building> buildings;
	private double profitSum;

	public Landlord() {
		this.buildings = new ArrayList<>();
	}

	public List<Building> getBuildings() {
		return buildings;
	}


	public void addBuildings(Building building) {
		buildings.add(building);
	}


	public static void main(String[] args) {
		Landlord lord = new Landlord();
		Building b1 = new Building();
		b1.addApartments(new Apartment(90.00, 800));
		b1.addApartments(new Apartment(80.00, 900));
		b1.addApartments(new Apartment(70.00, 700));
		Building b2 = new Building();
		b2.addApartments(new Apartment(90.00, 800));
		b2.addApartments(new Apartment(80.00, 900));
		b2.addApartments(new Apartment(70.00, 700));
		lord.addBuildings(b2);
		lord.addBuildings(b1);
		System.out.println(lord.calculateProfit());
	}
	
	private double calculateProfit(){
		for (Building building : buildings) {
			profitSum += building.getProfit();
		}
		
		return profitSum;
	}

}
