
public class Merlin {

private static Merlin theWizzard;

	private Merlin()
	{
		
	}
	
	public static Merlin summon()
	{
		if(theWizzard == null)
		{
			theWizzard = new Merlin();
			
		}return theWizzard;
	}
	public String consult()
	{
		return "Pull the sword from the stone";
	}
}
