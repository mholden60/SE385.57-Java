
public class ActorMain {
	
private static void tryout(Actor actor){
			actor.act();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Actor1 actor = new Actor1();
		Actor2 actor2 = new Actor2();
		
		actor.act();
		actor2.act();
		
		tryout(actor);
		tryout(actor2);
	}

}
