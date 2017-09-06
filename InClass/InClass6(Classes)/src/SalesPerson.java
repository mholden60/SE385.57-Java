
public class SalesPerson {
	private String FirstName;
	private String LastName;

public SalesPerson()
{
	FirstName = "";
	LastName = "";
}
	
	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public SalesPerson(String SalesFirstName, String SalesLastName)
	{
		setFirstName(SalesFirstName);
		setLastName(SalesLastName);
	}
	public void print()
	{
		System.out.println(this.getFirstName() + " "+ this.getLastName());
	}
	public boolean equals(SalesPerson target)
	{
		if(FirstName.equals(target.FirstName) && LastName.equals(target.LastName))
		{System.out.println("They Match");
			return true;}
		else 
			{System.out.println("They dont Match");
			return false;}
	}
	public float calculateCommission(float commissionRate, int salesAmount){
		return commissionRate * salesAmount;
	}

}
