public class MemberServiceApp {
	public static void main(String[] args) {
	
		/*
			�̸� : "ȫ�浿"
			���̵� : "hong"
			��й�ȣ : "1234"
			���� : 30
			������ ���� Member��ü�� ��� �ִ� MemberService��ü �����ϱ�
		*/

		Member m = new Member();

		m.setName("ȫ�浿");
		m.setId("hong");
		m.setPassword("1234");
		m.setAge(30);

		MemberService service = new MemberService(m);	// ���� ����m�� Memberservice�� ���

		// MemberService�� ���ǵ� login��� ����غ���
		//System.out.println(service.login("hongg", "12344"));
		//System.out.println(service.login("hong", "1234"));
		service.login("hong", "1234");
		System.out.println(service.isAuth());

		service.logout();
		System.out.println(service.isAuth());

		
	}
}