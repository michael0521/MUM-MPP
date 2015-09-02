package lab5.prob1.rulesets;

import java.awt.Component;

import lab5.prob1.RuleSet;
import lab5.prob1.samplecode.AddrWindow;


final public class AddressRuleSet implements RuleSet {
	//package level access
	AddressRuleSet() {}
	@Override
	public void applyRules(Component ob) throws RuleException {
		AddrWindow addr = (AddrWindow)ob;
		//comment 
		String id = addr.getIdValue();
		String street = addr.getStreetValue();
		String city = addr.getCityValue();
		String state = addr.getStateValue();
		String zip = addr.getZipValue();
		
		if(id.isEmpty() || street.isEmpty() || city.isEmpty() || state.isEmpty() || zip.isEmpty())
			throw new RuleException("All fields must be noempty!");
		try{
			Integer.parseInt(id);
		}catch(NumberFormatException nfe){
			throw new RuleException("ID field must be numeric!");
		}
		try{
			Integer.parseInt(zip);
			if(zip.length()!=5)
				throw new RuleException("Zip field must be numeric with exactly 5 digits!");
		}catch(NumberFormatException nfe){
			throw new RuleException("Zip must be numeric!");
		}
	
		if(state.length()!=2 && state.matches("^[A-Z]*$"))
			throw new RuleException("State must have two characters in the range A-Z!");
	
		if(id.equals(zip))
			throw new RuleException("ID field may not equal zip field!");
	}

}
