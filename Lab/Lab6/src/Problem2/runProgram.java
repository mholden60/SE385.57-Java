package Problem2;

public class runProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Patient patient1 = new Patient("Clavin", "123-45-6789");
		Patient patient2 = new Patient("Hobbes", "987-65-4321");
		Doctor doctor1 = new Doctor("Spock", "Periatrician", 200.00);
		Doctor doctor2 = new Doctor("Dolittle", "Witch", 175.00);
		
		
		
		System.out.println("Two doctors created:");
		System.out.println("");
		doctor1.writeOutput();
		System.out.println("");
		doctor2.writeOutput();
		System.out.println("");
		
		System.out.println("Two patients Created:");
		System.out.println("");
		patient1.writeOutput();
		System.out.println("");
		patient2.writeOutput();
		System.out.println("");
		
		System.out.println("Three Billing records created:");
		System.out.println("");
		
		Billing bill1 = new Billing(doctor1, patient1);
		bill1.writeOutput(bill1);
		System.out.println("");
		System.out.println("==============================");
		System.out.println("");
		Billing bill2 = new Billing(doctor1, patient2);
		bill2.writeOutput(bill2);
		System.out.println("");
		System.out.println("==============================");
		System.out.println("");
		Billing bill3 = new Billing(doctor2, patient1);
		bill3.writeOutput(bill3);
		System.out.println("");
		System.out.println("==============================");
		System.out.println("");
		
		
		System.out.println("First billing record equal to the second = "+ bill1.compareRecords(bill2));
		
	}
	

}
