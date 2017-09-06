
public class RoomOccupancy {
	public int numberinRoom;
	public static int totalNumber;

	public RoomOccupancy() {
		numberinRoom = 0;
		totalNumber = 0;
	}

	public int getNumberinRoom() {
		return numberinRoom;
	}

	public void setNumberinRoom(int numberinRoom) {
		this.numberinRoom = numberinRoom;
	}

	public static int getTotalNumber() {
		return totalNumber;
	}

	public static void setTotalNumber(int totalNumber) {
		RoomOccupancy.totalNumber = totalNumber;
	}

	public void addOneToRoom() {
		numberinRoom++;

	}

	public void removeOneFromRoom() {
		if (numberinRoom > 0) {
			numberinRoom--;
		} else {
			System.out.println("No one in room");
		}

	}

	public int getNumber() {
		totalNumber = totalNumber + numberinRoom;
		return numberinRoom;
	}

	public static int getTotal() {
		return totalNumber;
	}

}
