import java.util.Scanner;

public class RPS {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String user;
		int userchoice = 0;
		int computerchoice = (int)(Math.random()*3);
		System.out.print("Please choose Rocks Paper or Scissors" );
		user = keyboard.nextLine();
		
switch(computerchoice){
case 0:
	System.out.println("Computer choose rock" );
	computerchoice = 0;
	break;
case 1:
	System.out.println("Computer choose paper" );
	computerchoice = 1;
	break;
case 2:
	System.out.println("Computer choose scissor" );
	computerchoice = 2;
	break;
default:
}

switch(user){
case "Rock":
	userchoice = 0;
	break;
case "Paper":
	userchoice = 1;
	break;
case "Scissor":
	userchoice = 2;
	break;
default:
}
if(computerchoice == 0)
{
	if(userchoice == 0)
	{
		System.out.print("game is a tie" );
	}
	else if(userchoice == 1)
	{
		System.out.print("You Win" );
	}
	else if (userchoice == 2)
	{
		System.out.print("Computer Wins");
	}
}
else if(computerchoice == 1)
{
	if(userchoice == 0)
	{
		System.out.print("Computer Wins" );
	}
	else if(userchoice == 1)
	{
		System.out.print("Game is a tie" );
	}
	else if (userchoice == 2)
	{
		System.out.print("User Wins");
	}
}
else if(computerchoice == 2)
{
	if(userchoice == 0)
	{
		System.out.print("User wins" );
	}
	else if(userchoice == 1)
	{
		System.out.print("Computer wins" );
	}
	else if (userchoice == 2)
	{
		System.out.print("Game is a tie");
	}
}
	
		
		

}}

