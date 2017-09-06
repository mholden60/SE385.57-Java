import java.util.Scanner;

public class InClassAssign6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SalesPerson First = new SalesPerson("Mathew", "Holden");
SalesPerson Second = new SalesPerson();
Second.setFirstName("Mathew");
Second.setLastName("Holden");
First.print();
Second.print();
First.equals(Second);

	}

}
