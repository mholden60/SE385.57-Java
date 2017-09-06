import java.util.*;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
				
		System.out.println("Enter a line of text. No punctuation please");
		String word = keyboard.nextLine();
		
		
		String fWord = word.substring(0, word.indexOf(" "));
		int fWordlng = fWord.length();
		String restofLine = word.substring(fWordlng+2);
		String capFirst = word.substring((fWordlng+1),(fWordlng+2)).toUpperCase();
		
		System.out.println("I have rephrased that line to read:");
		System.out.println(capFirst + restofLine + " "+ fWord);

		

	}

}
