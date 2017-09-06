
public class runRest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rest first = new Rest();
		Rest second = new Rest("McDonalds", "Big Mac");
		
		second.setCuisine("Qrt. Pounder");
				
		first.makeReservations(4);
		Rest.calculateTips(20);
		System.out.print(Rest.calculateTips(20));
		System.out.print(first);
	}

}
