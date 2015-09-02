package lab3.prob2;


import java.util.*;

/**
 * 
 */
public class Building {
	
	List<Apartment> apartments;

    /**
     * 
     */
    public Building() {
    	apartments = new ArrayList<>();
//    	apartments.add(new Apartment(90.00, 400));
//    	apartments.add(new Apartment(80.00, 500));
//    	apartments.add(new Apartment(70.00, 600));
    }
    
    public void addApartments(Apartment apartment){
    	apartments.add(apartment);
    }
    
    
    public List<Apartment> getApartments(){
    	return apartments;
    }

    /**
     * @return
     */
    public double getProfit() {
    	double sum = 0.0;
        for (Apartment apartment : apartments) {
			sum += apartment.getProfit();
		}
        return sum;
    }
    
    public static void main(String[] args) {
		System.out.println(new Building().getProfit());
	}

}