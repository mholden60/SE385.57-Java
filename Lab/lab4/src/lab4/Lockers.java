package lab4;

public class Lockers {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int NUMBER_OF_LOCKERS = 101;
		boolean[] lockers = new boolean[NUMBER_OF_LOCKERS];

		for (int student = 1; student < NUMBER_OF_LOCKERS; student++)
		{
	
		for (int skip = student; skip < NUMBER_OF_LOCKERS; skip += student)
		lockers[skip] = !lockers[skip]; 
		}
		int openCount = 0;
		for (int i = 1; i < NUMBER_OF_LOCKERS; i++) 
		if (lockers[i])
		{
		openCount++;
		System.out.println("Locker "+ i+ " is open");
		}

		
		
	}
		}
