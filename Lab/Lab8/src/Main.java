
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BulkDiscount test = new BulkDiscount(2, 10);
BuyNItemsGetOneFree free = new BuyNItemsGetOneFree(2);

System.out.println(test.computeDiscount(5, 20));
System.out.println(free.computeDiscount(5, 20));
	}

}
