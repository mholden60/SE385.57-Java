package Problem1;

public  class HazzardPay extends PayCalculator {

	public HazzardPay(double payRate) {
		this.payRate = payRate;
	}
	public double getPay(double hours) {
		return super.getPay(hours) * 1.5;
	}

}
