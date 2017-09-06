package Problem2;

public class Doctor extends Person {

	String specialty;
	double officeVisitFee;

	public Doctor(String name) {
		super(name);
		specialty = "";
		officeVisitFee = 0;
	}

	public Doctor(String name, String newSpecialty, double newOfficeVisitFee ) {

		super(name);
		specialty = newSpecialty;
		officeVisitFee = newOfficeVisitFee;
		
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public double getOfficeVisitFee() {
		return officeVisitFee;
	}

	public void setOfficeVisitFee(double officeVisitFee) {
		this.officeVisitFee = officeVisitFee;
	}
	
	public void writeOutput()
	{
		super.writeOutput();
		System.out.println("Office Fee: "+ officeVisitFee);
		System.out.println("Specialty: "+ specialty);
		
	}

}
