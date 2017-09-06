import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		float x1;
		float x2;
		float y1;
		float y2;
		float x3;
		float y3;
		float sqrDistance;
		
		System.out.print("Enter x1 and y1:");	
		x1 = keyboard.nextFloat();
		y1 = keyboard.nextFloat();
		System.out.print("Enter x2 and y2:");
		x2 = keyboard.nextFloat();
		y2 = keyboard.nextFloat();
		
		x3 = x2-x1;
		y3 = y2-y1;
		sqrDistance = (float) Math.sqrt(((Math.pow(x3, 2)) + (Math.pow(y3, 2))));
		System.out.print("The distance of the two points is "+ sqrDistance);
		
	}}


