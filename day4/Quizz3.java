import java.util.Scanner;

public class Quizz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		
		for(;;) {
			System.out.println("1.�Ա�2.���3.��ȸ0.����");

			System.out.println("��ȣ�� �����ϼ���");
			int num = sc.nextInt();

			if(num == 1){
				System.out.println("�ݾ��� �Է��ϼ���:");
				int in = sc.nextInt();
				balance += in;
				System.out.println("�ܾ���:"+balance+"�Դϴ�");

			} else if(num == 2){
				System.out.println("�ݾ��� �Է��ϼ���:");
				int out = sc.nextInt();
				
				if(balance < out) {
					System.out.println("����");
				} else {
					balance -= out;
					System.out.println("�ܾ���:"+balance+"�Դϴ�");
				}

			} else if(num == 3) {
				System.out.println("�ܾ���"+balance+"�Դϴ�");

			} else if(num == 0) {
				break;
			}
		}
		System.out.println("�����մϴ�");
	}
}