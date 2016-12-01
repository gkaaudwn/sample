import java.util.Scanner;
public class AccountApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account = new Account();
		
		for(;;) {
			System.out.println("1.등록 2.조회 3.비번변경 4. 입금 5.출금 6.종료\n");

			System.out.print("메뉴 선택>");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				account = new Account();
				System.out.print("이    름:  ");
				account.setName(sc.next());

				System.out.print("비밀번호:  ");
				account.setPassword(sc.nextInt());

				System.out.print("최초입금액:  ");
				account.setMoney(sc.nextInt());

			} else if (menuNo == 2) {
				System.out.printf("%s %s %d\n", account.getName(), account.getPassword(), account.getMoney());
				
			} else if (menuNo == 3) {
				System.out.print("기존 비밀번호 입력:");
				int newPassword = sc.nextInt();
				if(account.getPassword() == newPassword) {
					System.out.print("새로운 비밀번호 입력:");
					account.setPassword(newPassword);
				} 

			} else if (menuNo == 4) {
				System.out.print("입금할 금액 입력:");
				int money = sc.nextInt();
				int newMoney = account.getMoney() + money;
				account.setMoney(newMoney);

			} else if (menuNo == 5) {
				System.out.print("출금할 금액 입력:");
				int money = sc.nextInt();
				int newMoney = account.getMoney() + money;
				account.setMoney(newMoney);
			
			}else if (menuNo == 6) {
				System.out.println("종료합니다");
				break;
			}
		}
	}
}