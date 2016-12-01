public class AccountApp {
	public static void main(String[] args) {
		
		Account acc = new Account();

		acc.owner = "홍길동";
		acc.accountNumber = "11-222-3333";
		acc.password = 1234;
		acc.balance = 1000000;

		int money = acc.withdraw(50000, 1234);
		System.out.println("출금액: " + money);

		acc.deposit(30000);
		//System.out.println("입금액: " + dep);	// 리턴이 없으니까...

		acc.info();


		

	}
}