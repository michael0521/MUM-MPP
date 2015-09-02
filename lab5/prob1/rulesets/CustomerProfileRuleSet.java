package lab5.prob1.rulesets;

import java.awt.Component;

import lab5.prob1.RuleSet;
import lab5.prob1.samplecode.ProfileWindow;

final public class CustomerProfileRuleSet implements RuleSet {
	//package level access
	CustomerProfileRuleSet() {}
	@Override
	public void applyRules(Component ob) throws RuleException {
		ProfileWindow custProf = (ProfileWindow)ob;
		//check data
		String id = custProf.getIdValue();		
		String fn = custProf.getFirstNameValue(); 				
		String ln = custProf.getLastNameValue();		
		String fm = custProf.getFavoriteMovieValue();		
		String fr = custProf.getFavoriteRestaurantValue();
		
		if(fr.equals(fm)){
			throw new RuleException("Favorite restaurant can't equal favoriate movie!");
		}
		if(id.isEmpty() || fn.isEmpty() || ln.isEmpty() || fm.isEmpty() || fr.isEmpty())
			throw new RuleException("All fields must be noempty!");
		try{
			Integer.parseInt(id);
		}catch(NumberFormatException nfe){
			throw new RuleException("ID field must be numeric!");
		}
		
		if(!fn.matches("^[a-zA-Z]*$")){
			System.out.println(fn.matches("^[a-zA-Z]*$"));
			throw new RuleException("Firstname and lastname fields may not contain spaces or characters other than a-z, A-Z");
		}
	}

}
