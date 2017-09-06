package lab4;

import java.util.Arrays;

public class Ledger {

	float[] sale = new float[20];
	int salesMade;
	int maxSales;
	float totalSale;
	

	public Ledger() {
		int maxSales = 0;
		int salesMade = 0;

	}

	public Ledger(int max) {
		int maxSales = max;
		int salesMade = 0;
	}

	public float[] getSale() {
		return sale;
	}

	public void setSale(float[] sale) {
		this.sale = sale;
	}

	public int getSalesMade() {
		return salesMade;
	}

	public void setSalesMade(int salesMade) {
		this.salesMade = salesMade;
	}

	public int getMaxSales() {
		return maxSales;
	}

	public void setMaxSales(int maxSales) {
		this.maxSales = maxSales;
	}

	public void addSales(float d) {
		sale[salesMade] = d;
		salesMade++;
		totalSale = totalSale + d;

	}

	public float totalSales() {
		return totalSale;
	}

	public int getNumberOfSales() {
		for (salesMade = 0; salesMade > 0; salesMade++) {
			salesMade = salesMade += 1;
		}
		return salesMade;
	}

	public double getAverageSales(double salesAverage) {
		return (totalSale / salesMade);

	}

	public double getCountAbove(double target) {
		int counter = 0;
		for (int i = 0; i < salesMade; i++) {

			if (sale[i] > target) {
				counter++;
			}
			
			

		}
		return counter;

	}
	public double getCountBelow(double target) {
		int counter = 0;
		for (int i = 0; i < salesMade; i++) {

			if (sale[i] < target) {
				counter++;
			}
			
			

		}
		return counter;

	}
	

	
	
}
