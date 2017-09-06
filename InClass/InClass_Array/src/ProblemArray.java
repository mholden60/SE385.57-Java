import java.util.Scanner;

public class ProblemArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int number;
		int[] firstArray = new int[5];
		
		number = keyboard.nextInt();
		boolean isMatch = false;
		for(int i = 0; i <= firstArray.length; i++)
		{
			firstArray[i] = i;
			for(i = 0; i == number; i++)
			{
				if(number == i)
				{
					isMatch = true;
				}
			}
				
		}
		if(isMatch == false)
		{
			firstArray[number] = number;
			
		}
		
		System.out.print("The number is the array are"+number);
	}

}
