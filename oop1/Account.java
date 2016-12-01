/*  
	은행계좌를 표현하는 클래스
		-속성
			예금주
			계좌번호
			비밀번호
			잔액
		-기능
			출금기능 - 금액과 비밀번호를 전달받아서 
					   비밀번호가 개설시 입력한 비밀번호와일치하면 
					   금액만큼을 잔액에서 감소시키고
					   금액만큼의 돈을 반환한다.
			입금기능 - 금액을 전달받아서 그 금액만큼 잔액을 증가시티고
					   화면에 현재 잔액을 표시한다.
			조회기능 - 화면에 예금주, 계좌번호, 잔액을 표시한다.

*/  
public class Account {
	
	String owner;
	String accountNumber;
	int password;
	int balance;

	//출금기능
	public int withdraw(int amount,int pwd){
	int money=0;
	if(password==pwd){
		if(balance >=amount){
			balance-=amount;
			money=amount;
			System.out.println("출금 후 잔액:"+balance);
		}else{
		System.out.println("잔액이 부족");
		}
	}else{
		System.out.println("비밀번호가 일치하지 않습니다.");
	}
	return money;
	}
	
	public void deposit(int amount){
	balance+=amount;
	System.out.println("입금후 잔액:"+balance);

	}
	public void info(){
		System.out.println("####계좌정보 ####");
		System.out.println("예금주:"+owner);
		System.out.println("계좌번호:"+accountNumber);
		System.out.println("잔액:"+balance);
	}
}   
