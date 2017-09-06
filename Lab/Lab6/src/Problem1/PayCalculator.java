package Problem1;

public abstract class PayCalculator {
	double payRate;

	public double getPay(double hours) {
		return payRate * hours;
	}

	public void changeRate(double payRate) {
		this.payRate = payRate;

	}
}
