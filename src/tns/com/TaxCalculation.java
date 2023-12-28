package tns.com;


public class TaxCalculation {
	public void calculateTax(Person person) 
	{
		if(person.getAge()>65  || person.getGender().equalsIgnoreCase("Female"));
		{
			person.setTax(0);
			System.out.println("tax is not Applicable");
		}
		else{
			if(person.getIncome()<=160000) 
			{
				person.setTax(0);
				System.out.println("tax is not Applicable");
			}
			else if(person.getIncome()>160000 && (person.getIncome()<=500000)) {
				
			}
		}
	}

}
