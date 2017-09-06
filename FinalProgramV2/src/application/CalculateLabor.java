package application;

public class CalculateLabor {
	double cHours;
	double cRate;
	double mRate;
	double mHours;
	double labor;
	double netSales;
	CalculateNetSales cal;
	double crewTotal;
	double manTotal;
	double total;
	String managerName;
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public double getmHours() {
		return mHours;
	}
	public void setmHours(double mHours) {
		this.mHours = mHours;
	}

	
	
	public void setNetSales(double netSales) {
		
		this.netSales = netSales;
		
	}
	public double getNetSales() {
		return netSales;
	}
	
	public double getcHours() {
		return cHours;
	}
	public void setcHours(double cHours) {
		this.cHours = cHours;
	}
	
	public double getcRate() {
		return cRate;
	}
	public void setcRate(double cRate) {
		this.cRate = cRate;
	}
	public double getmRate() {
		return mRate;
	}
	public void setmRate(double mRate) {
		this.mRate = mRate;
	}
	
	public double calLabor()
	{
		crewTotal = cHours * cRate;
		manTotal = mHours * mRate;
		total = manTotal + crewTotal;
		labor = total / netSales;
		return labor;
	}
}
