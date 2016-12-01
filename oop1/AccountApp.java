import java.util.Scanner;
public class AccountApp{
	public static void main(String[] args){
	Account a = new Account();
	Scanner sc=new Scanner(System.in);
	a.owner="이동민";
	a.accountNumber="110-315-992989";
	a.balance=10000000;
	a.password=1234;

	int money = a.withdraw(500000,234);
System.out.println("출금액:"+money);
a.deposit(300000);
  
	
	
	}
}