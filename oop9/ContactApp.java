public class ContactApp {
	public static void main(String[] args) {
		
		Contact contact = new Contact();	// �ּҷ�����(�̸�, �������� ��ȭ��ȣ, �ּ�)�� �����ϴ� ��ü ����

		// �̸� ���� ����
		String name = "ȫ�浿";
		contact.setName(name);

		// ��ȭ��ȣ ���� ����
		Tel[] phones = new Tel[10];

		Tel tel1 = new Tel();
		tel1.setType("��");
		tel1.setNumber("010-2222-3333");
		phones[0] = tel1;

		Tel tel2 = new Tel();
		tel1.setType("����");
		tel1.setNumber("02-111-1111");
		phones[1] = tel2;

		contact.setTels(phones);

		// �ּ����� ����
		Address addr = new Address();
		addr.setSido("����Ư����");
		addr.setGugun("���α�");
		addr.setDetail("���͵� ��Ƹ����� 401ȣ");

		contact.setAddress(addr);

	}
}