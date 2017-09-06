public class BuyNItemsGetOneFree extends DiscountPolicy {

private double n;
	@Override
	public float computeDiscount(int count, float itemCost) {

		float discount = (int) (count/n) * itemCost;

		return discount;
	}
	public BuyNItemsGetOneFree(double n) {
		this.n = n;
	}



	
}
