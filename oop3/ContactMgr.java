public class ContactMgr {
	private Contact[] contacts = new Contact[100];
	private int currentPosition = 0;

	// Contact ��ü�� ���޹޾Ƽ� �迭�� �����ϱ�
	public void addContact(Contact contact) {	//()�ȿ��� contact��ü�� �޶�!! �� ��
		contacts[currentPosition] = contact;
		currentPosition++;
	}

	// contacts �迭�� ����� ��� ����ó ���� ǥ���ϱ�
	public void displayContact() {
		for (int i=0; i<=currentPosition; i++) {
			Contact c = contacts[i];

			System.out.printf("%d %s %s %s\n", c.getNo(), c.getName(), c.getPhone(), c.getEmail());
		}
				
	}

}