import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int denom;
		int numer;
int number;
int number2;
int number3;
String text = "\\n";

		System.out.print("Enter a numerator: ");
		numer = keyboard.nextInt();
//***************************SYSTEM ESCAPE*****************************************************************
		if(numer == 0)
		{
			System.out.print("System exited");
			System.exit((int) numer);		
		}
//*********************************************************************************************************
		System.out.print("Enter a denominator: ");
		denom = keyboard.nextInt();

		while(numer != 0)
		{
			if(numer < denom)
			{
				System.out.println(numer+"/"+denom+" is a proper fraction");
				System.out.println(" ");
			}
			number2 = numer%denom;
			if((number2/2)==0)
			{
				number = (numer / denom);
				System.out.println(numer+" / "+denom+" is an improper fraction and can be reduced to "+number);
				System.out.println(" ");
			}
			else if((number2 %2)==0)
			{
			number2 = (numer/denom);
			number3 = (numer-denom);	
			
			System.out.println(numer+" / "+denom+" is an improper fraction and can be reduced to "+number2+" + "+ number3+" / "+denom);
			System.out.println(" ");
			}
			 
			System.out.print("Enter a numerator: ");
			numer = keyboard.nextInt();
			
			if(numer == 0)
			{
				System.out.print("program exited");
				System.exit((int) numer);		
			}

			System.out.print("Enter a denominator: ");
			denom = keyboard.nextInt();
			
		}
		
	}
}
