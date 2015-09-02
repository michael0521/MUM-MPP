package lab3.prob2;


import java.util.*;

/**
 * 
 */
public class Apartment {
	/**
     * 
     */
    private double cost;

    private Rent rent;
    /**
     * 
     */
    public Apartment(double cost, double price) {
    	this.cost = cost;
    	rent = new Rent(price);
    }

  
    public double getProfit() {
		return getRent().getMonthlyPrice()-cost;
	}
    
    public Rent getRent() {
		return rent;
	}


}