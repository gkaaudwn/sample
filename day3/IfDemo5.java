import java.util.Scanner;

public class IfDemo5{
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("1:Ŀ��(1500��) 2:�����꽺(2000��) 3:�̿�����(1000��)");
		System.out.print("�ݾ��� �Է��ϼ���:");
		int money = sc.nextInt();
		System.out.print("���Ḧ ������:");
		int no = sc.nextInt(); 

		int returnCoin =0;

		if (no == 1) {
			if(money>=1500){
				System.out.println("Ŀ�Ǹ� �޾ư�����");
				returnCoin = money - 1500;
				
			} else {
				System.out.println("�� ������ ����");
			}
			
		} else if (no == 2) {
			if(money>=2000){
				System.out.println("�����꽺�� �޾ư�����");
				returnCoin = money - 2000;
				
			} else {
				System.out.println("�� ������ ����");
			}
		} else if (no == 3) {
			if(money>=1500){
				System.out.println("�̿����Ḧ �޾ư�����");
				returnCoin = money - 1000;
				
			} else {
				System.out.println("�� ������ ����");
			}
			
		} else {
			System.out.println("�߸��Է��Ͽ����ϴ�.");
		}
		int ft=returnCoin/5000;
		int ot=(returnCoin-ft*1000)/1000;
		int fh=(returnCoin-ot*1000)/500;
		int oh=(returnCoin-ot*1000-fh*500)/100;
		System.out.println("�Ž�����: " + returnCoin + "��");
		System.out.println("��õ��:"+ft+"õ��:"+ot+"�����:"+fh+"���:"+oh);
	}
}