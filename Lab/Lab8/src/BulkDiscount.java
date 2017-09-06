
public class BulkDiscount extends DiscountPolicy {
public double minimum;
public double percent;
public float total;
public BulkDiscount(double minimum, double percent) {
	
	this.minimum = minimum;
	this.percent = percent;
}
@Override
public float computeDiscount(int count, float itemCost) {
	if(count > minimum)
	{
		total = count * itemCost;
		total = (float) ((total*percent)/100);
}
	return total;
}



}
