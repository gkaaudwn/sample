import java.util.Scanner;
public class AccountApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account = new Account();
		
		for(;;) {
			System.out.println("1.��� 2.��ȸ 3.������� 4. �Ա� 5.��� 6.����\n");

			System.out.print("�޴� ����>");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				account = new Account();
				System.out.print("��    ��:  ");
				account.setName(sc.next());

				System.out.print("��й�ȣ:  ");
				account.setPassword(sc.nextInt());

				System.out.print("�����Աݾ�:  ");
				account.setMoney(sc.nextInt());

			} else if (menuNo == 2) {
				System.out.printf("%s %s %d\n", account.getName(), account.getPassword(), account.getMoney());
				
			} else if (menuNo == 3) {
				System.out.print("���� ��й�ȣ �Է�:");
				int newPassword = sc.nextInt();
				if(account.getPassword() == newPassword) {
					System.out.print("���ο� ��й�ȣ �Է�:");
					account.setPassword(newPassword);
				} 

			} else if (menuNo == 4) {
				System.out.print("�Ա��� �ݾ� �Է�:");
				int money = sc.nextInt();
				int newMoney = account.getMoney() + money;
				account.setMoney(newMoney);

			} else if (menuNo == 5) {
				System.out.print("����� �ݾ� �Է�:");
				int money = sc.nextInt();
				int newMoney = account.getMoney() + money;
				account.setMoney(newMoney);
			
			}else if (menuNo == 6) {
				System.out.println("�����մϴ�");
				break;
			}
		}
	}
}