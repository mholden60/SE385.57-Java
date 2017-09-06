import java.util.Scanner;

public class InClassAssign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
		int distance;
		int mpg;
		double price;
		double total;
		
		
		System.out.print("Enter the driving distance: " );
		distance = keyboard.nextInt();
		
		System.out.print("Enter the Miles per Gallon: " );
		mpg = keyboard.nextInt();
		
		System.out.print("Enter the Price per Gallon: " );
		price = keyboard.nextDouble();
		
		total = (distance * mpg)/(double)(price);
		System.out.print("The cost of driving is $"+ total);
	}

}
