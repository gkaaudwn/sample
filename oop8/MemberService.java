public class MemberService {

	// ������
	private Member member;
	// �α��ο���
	private boolean auth = false;

	public MemberService (Member member) {
		this.member = member;
	}

	public boolean isAuth() {		// isAuth�� ��ȯ
		return auth;
	}
	

	// ���̵�� ����� ���޹޾Ƽ� member�� ����� ���̵� ��й�ȣ�� ���ؼ� ��ġ�ϸ� auth���� true�� ����
	public void login(String id, String password) {
		if (member.getId().equals(id) && member.getPassword().equals(password)) {
			auth = true;
		}
	}

	// �α׾ƿ� ó���ϱ�(auth�� ���� false�� �ٲٱ�)
	public void logout () {
		if (auth) {
			auth = false;
		}
	}

/*
	public MemberService(Member member) {	// ��� Ŭ������ �޶�°� �ƴϰ� ��� ��ü�� �޶�� ����
		this.member = member;
	}

	
	// ���̵�� ��й�ȣ�� ���޹޾Ƽ� �α��ΰ��� ���θ� ��ȯ�ϴ� �޼ҵ�
	public boolean login (String id, String password) {
		boolean result = false;							// ��ȯ���� �ִ� ��� ��ȯ�ϴ� Ÿ���� ���� ����

		if (member.getId() == id && member.getPassword() == password) {
			result = true;
		} else {
			result = false;
		}


		return result;
	}

	// ���̵� ���޹޾Ƽ� �α׾ƿ������ �����ϴ� �޼ҵ�
	public void logout (String id) {
		System.out.println("["+id+"]�� �α׾ƿ� �Ǿ����ϴ�.");
	}
	*/
}