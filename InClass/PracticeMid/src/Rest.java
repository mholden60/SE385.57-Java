
public class Rest {
String name;
String cuisine;
int ReservationsMade;

public Rest()
{
name = "";
cuisine = "";
}

public Rest(String myName, String myCuisine)
{
name = myName;
cuisine = myCuisine;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCuisine() {
	return cuisine;
}

public void setCuisine(String cuisine) {
	this.cuisine = cuisine;
}


public void makeReservations(int numberOfPatrons)
{
	ReservationsMade += numberOfPatrons;
}

public static float calculateTips(float bill)
{
	return bill *.18f;
}



}
