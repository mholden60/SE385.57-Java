
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RoomOccupancy room1 = new RoomOccupancy();
		RoomOccupancy room2 = new RoomOccupancy();

		room1.addOneToRoom();
		room1.addOneToRoom();
		room1.addOneToRoom();
		room2.addOneToRoom();
		room2.addOneToRoom();
		room1.removeOneFromRoom();
		room2.removeOneFromRoom();

		System.out.println("Room1 has a total of: "+room1.getNumber()+" people.");
		System.out.println("Room1 has a total of: "+room2.getNumber()+" people.");
		System.out.println("The total of the 2 rooms is: "+RoomOccupancy.getTotal()+" people.");

	}

}
