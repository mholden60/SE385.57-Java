package Problem2;

public class Patient extends Person {
	
	String idNumber;
	
public Patient(String name)
{
	super(name);
	idNumber = "";
}
public Patient(String name, String newIdNumber)
{
	super(name);
	idNumber = newIdNumber;
}
public String getIdNumber() {
	return idNumber;
}
public void setIdNumber(String idNumber) {
	this.idNumber = idNumber;
}
public void writeOutput()
{
	super.writeOutput();
	System.out.println("Social Security #: "+ idNumber);
	
	
}

}
