package Problem2;

public class Billing extends Person {

	String patientName;
	String drName;
	double billingAmount;

	public Billing(Person Doctor, Person Patient) {
		drName = Doctor.getName();
		patientName = Patient.getName();
		billingAmount = ((Doctor) Doctor).getOfficeVisitFee();
	}

	public void writeOutput(Billing billAmount) {

		System.out.println("Doctor: " + drName);
		System.out.println("Patient: " + patientName);
		System.out.println("Billing Amout: " + billingAmount);

	}

	public boolean compareRecords(Billing billAmount)
    {
        return (this.drName.equalsIgnoreCase(billAmount.drName) && 
        		this.patientName.equalsIgnoreCase(billAmount.patientName)&&
        				this.billingAmount== billAmount.billingAmount);
    }

}
