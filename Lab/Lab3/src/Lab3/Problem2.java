
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account account = new Account(1122, 20000);
account.withdraw(2500);
account.deposit(3000);
account.setAnnualIntrestRate(4.5);
account.getBalance();
System.out.println("Balance is " +account.getBalance());
System.out.println("Monthly interest is " +account.getMonthlyIntrest());
System.out.println("This account was created at "+account.getDateCreated());

	}

}
