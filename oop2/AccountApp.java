public class AccountApp {
	public static void main(String[] args) {
		
		Account acc = new Account();

		acc.owner = "ȫ�浿";
		acc.accountNumber = "11-222-3333";
		acc.password = 1234;
		acc.balance = 1000000;

		int money = acc.withdraw(50000, 1234);
		System.out.println("��ݾ�: " + money);

		acc.deposit(30000);
		//System.out.println("�Աݾ�: " + dep);	// ������ �����ϱ�...

		acc.info();


		

	}
}