package lab4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maxSales = 10;
		double sales = 0;
		double totalSale = 0;
		float d = 0;

		String answer;
		Ledger ledger = new Ledger(maxSales);
		int salesMade = 0;
		Scanner keyboard = new Scanner(System.in);
		int x = 1;
		
		do {
			x++;
			
			System.out.println("Would you like to enter sales");
			answer = keyboard.next();
			if(!answer.equals("y") && !answer.equals("n"))
		 {
				System.out.print("Please enter y or n");
				answer = keyboard.next();
		 }
			 if (answer.equals("y")) {
				 try{
				System.out.println("Please enter sales");
				d = keyboard.nextFloat();
				ledger.addSales(d);
				 }catch(InputMismatchException exception)
				 {

					  System.out.println("This is not an integer");
					}
			}
		 
		} while (answer.equals("y") && x <= maxSales);

		if (answer.equals("n")) {
			
			System.out.println("Testing Ledger: ");
			System.out.print("Adding sales: ");
			
			for  (int i = 0; i <= ledger.sale[i] ; i++) {
				System.out.print(ledger.sale[i] + ", ");
			}
			System.out.println();

		
			System.out.println("The total number of sales are:" + ledger.getSalesMade());
			System.out.println("The total amout of sales are: " + ledger.totalSales());
			System.out.println("The average sale amount is: " + ledger.getAverageSales(totalSale));
			System.out.println("The number of sales greater than 3.5 is: "+ledger.getCountAbove(3.5));
			System.out.println("The number of sales less than 3.0 is: "+ledger.getCountBelow(3.0));
		}

	}

}
