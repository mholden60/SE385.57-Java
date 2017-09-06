package application;

public class CalculateNetSales {
	double netSales;
	double breakfast;
	double lunch;
	double midDay;
	double dinner;
	double night;
	double crewHours;
	double LastYear;
	
	public double getBreakfast() {
		return breakfast;
	}



	public void setBreakfast(double breakfast) {
		this.breakfast = breakfast;
	}
	public double getLunch() {
		return lunch;
	}
	public double getNetSales() {
		return netSales;
	}



	public void setNetSales(double netSales) {
		this.netSales = netSales;
	}



	public void setLunch(double lunch) {
		this.lunch = lunch;
	}
	public double getMidDay() {
		return midDay;
	}
	public void setMidDay(double midDay) {
		this.midDay = midDay;
	}
	public double getDinner() {
		return dinner;
	}
	public void setDinner(double dinner) {
		this.dinner = dinner;
	}
	public double getNight() {
		return night;
	}
	public void setNight(double night) {
		this.night = night;
	}
	public double getCrewHours() {
		return crewHours;
	}
	public void setCrewHours(double crewHours) {
		this.crewHours = crewHours;
	}
	public double getLastYear() {
		return LastYear;
	}
	public void setLastYear(double lastYear) {
		LastYear = lastYear;
	}
	
	public double calculateNetSales()
	{
		netSales = (breakfast + lunch + dinner + midDay + night);
		return netSales;
	}

}
