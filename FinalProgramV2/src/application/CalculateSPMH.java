package application;

public class CalculateSPMH {
	double netSales;
	double crewHours;
	double manHours;
	double spm;
	//double total;
	CalculateNetSales cal;

	public void setNetSales(double netSales) {
		this.netSales = netSales;
	}

	public double getNetSales() {
		return netSales;
	}

	public double getCrewHours() {
		return crewHours;
	}

	public void setCrewHours(double crewHours) {
		this.crewHours = crewHours;
	}

	public double getManHours() {
		return manHours;
	}

	public void setManHours(double manHours) {
		this.manHours = manHours;
	}

	public double calSPHM() {
		
		spm = netSales / (crewHours + manHours);
		return spm;
	}

	public double getSpm() {
		return spm;
	}

	public void setSpm(double spm) {
		this.spm = spm;
	}
}
