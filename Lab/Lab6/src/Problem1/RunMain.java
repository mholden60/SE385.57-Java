package Problem1;

public class RunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RegularPay regPay = new RegularPay(7.5);
		HazzardPay hazPay = new HazzardPay(7.5);
		PayCalculator payCac;
		//regPay.payRate= 7.5;
		//hazPay.payRate=7.5;
		
		System.out.println("40 hours regular pay at 7.5 is " +regPay.getPay(40));
		System.out.println("40 hours hazard pay at 7.5 is " + hazPay.getPay(40));
		System.out.println("");
	regPay.changeRate(17);
	hazPay.changeRate(17);
	
	System.out.println("40 hours regular pay at 17 is " +regPay.getPay(40));
	System.out.println("40 hours regular pay at 17 is " +hazPay.getPay(40));
	}

}
