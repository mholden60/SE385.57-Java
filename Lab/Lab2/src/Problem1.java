import java.awt.Point;
import java.util.Scanner;


public class Problem1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner keyboard = new Scanner(System.in);
	int weight;
	int height;
	int age;
	String sex;
	
	String level;
	float level2;
	int bar;
	float BMG;
	
	
	System.out.println("This program will calculate the number of 230 calorie candy bars to eat to maintain your weight.");
	System.out.println("What is your age in years");
	age = keyboard.nextInt();
	System.out.println("What is your height in inches");
	height = keyboard.nextInt();
	System.out.println("What is your weight in pounds");
	weight = keyboard.nextInt();
do
{
	System.out.println("Please enter M for Male Calculations or F for Female Calculations.");
	sex = keyboard.next().toUpperCase();
}while(!sex.equals("M") && !sex.equals("F"));

if(sex.equals("M"))
{
BMG = (float) (66 + (6.3 * weight) + (12.9 * height)-(6.8 * age));	
}
else
{
	BMG = (int) (655 + (4.3 * weight) + (4.7 * height)-(4.7 * age));
}

System.out.println("Are you:");
System.out.println("A. Sendentary");
System.out.println("B. Simewhat active (exercise occasionally");
System.out.println("C. Active (exersise 3-4 days per week");
System.out.println("D. Highly active(exercise everyday)");
System.out.println("Please enter A, B, C, or D");
level = keyboard.next().toUpperCase();

switch(sex){
case "M":
	sex = "Male";
	break;
case "F":
	sex = "Female";
	break;
}

switch(level){
case "A":
level2 = (float) (20.0/100);
level2 = ((BMG * level2) + BMG) / 230;

System.out.printf("A "+sex+" with those measurements should eat %.2f",level2);
System.out.println(" candy bars to maintain the same weight.");
break;

case "B":
	// BJG - make this floating point math.
level2 = (float) (30.0/100);	
level2 = ((BMG * level2) + BMG) / 230;

System.out.printf("A "+sex+" with those measurements should eat %.2f",level2);
System.out.println(" candy bars to maintain the same weight.");
break;

case "C":
level2 = 40/100;	
level2 = ((BMG * level2) + BMG) / 230;
System.out.printf("A "+sex+" with those measurements should eat %.2f",level2);
System.out.println(" candy bars to maintain the same weight.");
break;

case "D":
level2 = (float) (50.0/100);	
level2 = ((BMG * level2) + BMG) / 230;
System.out.printf("A "+sex+" with those measurements should eat %.2f",level2);
System.out.println(" candy bars to maintain the same weight.");
break;
default: System.out.println("You have not chosen a correct level of activty. Goodbye");
}

}

}