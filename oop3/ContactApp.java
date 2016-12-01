import java.util.Scanner;

public class ContactApp {
	public static void main(String[] args) {
		// ������ ������ �Է¹޴� ȭ�� ���� Ŭ����
		// ������� �Է��� �о���� Scanner ��ü �����ϱ�
		Scanner sc = new Scanner(System.in);

		Contact[] contacts = new Contact[100];
		int currentPosition = 0;

		for(;;) {
			System.out.println("1:���   2: ��ȸ   0:����");

			System.out.print("�޴� ��ȣ�� �Է��ϼ���:");
			int menuNo = sc.nextInt();

			if (menuNo ==1) {
				contacts[currentPosition] = new Contact();
				// �迭�� ����ϱ�
				// �迭�� currentPosition�� ����Ű�� ��ġ�� Contact�� �����ϰ�
				// currentPosition�� ���� 1������Ų��
				System.out.print("��    ȣ:  ");
				contacts[currentPosition].setNo(sc.nextInt());

				System.out.print("��    ��:  ");
				contacts[currentPosition].setName(sc.next());

				System.out.print("��ȭ��ȣ:  ");
				contacts[currentPosition].setPhone(sc.next());

				System.out.print("�� �� ��:  ");
				contacts[currentPosition].setEmail(sc.next());

				currentPosition++;

			} else if (menuNo == 2) {
				// �迭�� ����� ��� ����ó ���� ǥ���ϱ� (enhanced for�� ������� ����)
				// ���´µ� null�̸� break
				// �迭���� 0���� currentPosition�� ����Ű�� ��ġ �ձ��� �ݺ��ؼ� ���
				for (int i=0; i<currentPosition; i++) {
					Contact c = contacts[i];

					System.out.printf("%d %s %s %s\n", c.getNo(), c.getName(), c.getPhone(), c.getEmail());
				}
				

			} else if (menuNo == 3) {
				break;
			}
		}
		

	}
}