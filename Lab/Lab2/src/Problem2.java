import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		int number;
		int largest = 0;
		int counter = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter an integer(0 ends the input): ");
		number = keyboard.nextInt();

		while(number != 0)
		{
			
			number = keyboard.nextInt();
			if(number >= largest)
			{
				largest = number;
					
					counter++;
			}
		}
		
		System.out.println("the largest number is " + largest);
		System.out.println("the number "+ largest+" appears " + counter +" times");
		}
		
	
		
		

}
