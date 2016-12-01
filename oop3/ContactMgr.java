public class ContactMgr {
	private Contact[] contacts = new Contact[100];
	private int currentPosition = 0;

	// Contact 객체를 전달받아서 배열에 저장하기
	public void addContact(Contact contact) {	//()안에는 contact객체를 달라!! 는 말
		contacts[currentPosition] = contact;
		currentPosition++;
	}

	// contacts 배열에 저장된 모든 연락처 정보 표시하기
	public void displayContact() {
		for (int i=0; i<=currentPosition; i++) {
			Contact c = contacts[i];

			System.out.printf("%d %s %s %s\n", c.getNo(), c.getName(), c.getPhone(), c.getEmail());
		}
				
	}

}