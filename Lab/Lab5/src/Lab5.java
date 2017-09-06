import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Lab5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		LinkedList<String> stadiumNames = new LinkedList<String>();
		LinkedList<Double> gameRevenue = new LinkedList<Double>();
			
		String name = "",target = "";
		Double revenue = 0.00, totalRevenue = 0.00, stadiumRevenue;
		Iterator <String>iterator;
		
		
		int counter = 0;
		
		System.out.println("Enter data now");
		System.out.println("On each line enter a stadium name and game revenue");
		System.out.println("Enter done when you are finished");
		
		name = keyboard.next();
		while(!name.equals("done"))
		{
			stadiumNames.add(name);
			revenue = keyboard.nextDouble();
			gameRevenue.add(revenue);
			name = keyboard.next();
		}
		System.out.println("Enter the name of the stadium to get the total revenue: ");
		target = keyboard.next();
		iterator = stadiumNames.iterator();
		while(iterator.hasNext())
		{
			if(iterator.next().equals(target))
			{
				stadiumRevenue = gameRevenue.get(counter);
				totalRevenue = totalRevenue + stadiumRevenue;
				
			}
			counter++;
		}
		System.out.println(target + " "+ totalRevenue);
	}
}
