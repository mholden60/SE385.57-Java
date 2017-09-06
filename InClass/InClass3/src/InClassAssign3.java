import java.util.Scanner;

public class InClassAssign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
StringBuffer strBuf = new StringBuffer();
String word1; 
String word2;
String word3;
System.out.println("Enter 3 words ");
word1 = keyboard.nextLine();
word2 = keyboard.nextLine();
word3 = keyboard.nextLine();
System.out.println("Concatenated String = "+ word1+word2+word3);
 strBuf.append(word1).append(word2).append(word3);
System.out.print("StringBuffer = " + strBuf);
	}

}
