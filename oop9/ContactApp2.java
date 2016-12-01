import java.util.Scanner;

public class ContactApp2{
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Contact contact = new Contact();
		Tel[] tels = new Tel[50];
		int position = 0;

		for (;;) {
			System.out.println("1.�̸���� 2.��ȭ��ȣ��� 3.�ּҵ��/���� 4.��ȸ 0.����");
			System.out.print("�޴��� �����ϼ���");
			int no = sc.nextInt();
			if(no == 1) {
				// �̸��� �Է¹޾Ƽ� Contact�� �����մϴ�.
				System.out.print("��    ��:  ");
				contact.setName(sc.next());
				
			} else if(no == 2) {
				// ��ȭ��ȣ ������ �Է¹޾Ƽ� Contact�� �����մϴ�
				// Tel��ü ���� -> �� �Է¹޾Ƽ� ä��� -> Contact�� addTel(Tel tel)���� Tel ��ü �����ؼ� �迭�� ���
				Tel tel = new Tel();
				System.out.print("��ȭŸ��:  ");
				tel.setType(sc.next());
				System.out.print("��ȭ��ȣ:  ");
				tel.setNumber(sc.next());

				contact.addTel(tel);
				
			} else if(no == 3) {
				// �ּ� ������ �Է¹޾Ƽ� Contact�� �����մϴ�
				// Address��ü ���� -> �� �Է¹޾Ƽ� ä��� -> Contact�� setter �̿��ؼ� ����
				Address adr = new Address();
				System.out.print("��,�� �Է�:  ");
				adr.setSido(sc.next());
				System.out.print("��,�� �Է�:  ");
				adr.setGugun(sc.next());
				System.out.print("������ �ּ� �Է�:  ");
				adr.setDetail(sc.next());

				contact.setAddress(adr);


			} else if(no == 4) {
				// ����ó ������ ȭ�鿡 ǥ���մϴ�.
				

				contact.info();
			} else if(no == 0) {
				// ���α׷��� �����մϴ�.
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
		}

	}
}

/*
Database�� ������� �ϴ� �۾�
	Create		- �� ������ ����
	Retrieve	- ������ ��ȸ	
	Update		- ������ ����
	Delete		- ������ ����

*/