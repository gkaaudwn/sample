import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {
		// ������ ������ �Է¹޴� ȭ�� ���� Ŭ����
		// ������� �Է��� �о���� Scanner ��ü �����ϱ�
		Scanner sc = new Scanner(System.in);

		ContactMgr mgr = new ContactMgr();

		for(;;) {
			System.out.println("1:���   2: ��ȸ   0:����");

			System.out.print("�޴� ��ȣ�� �Է��ϼ���:");
			int menuNo = sc.nextInt();

			if (menuNo ==1) {
				// �迭�� ����ϱ�
				// mgr �� addContact (Contact contacts) �޼ҵ忡 ����� Contact ��ü ����
				Contact contact = new Contact();
				System.out.print("��ȣ�Է�:");
				contact.setNo(sc.nextInt());
				System.out.print("�̸��Է�:");
				contact.setName(sc.next());
				System.out.print("��ȭ��ȣ:");
				contact.setPhone(sc.next());
				System.out.print("�̸���:");
				contact.setEmail(sc.next());
				mgr.addContact(contact);


			} else if (menuNo == 2) {
				// �迭�� ����� ��� ����ó ���� ǥ���ϱ�
				// mgr�� displayContact()�� �����Ű��
				mgr.displayContact();
				
			} else if (menuNo == 3) {
				break;
			}
		}
		

	}
}