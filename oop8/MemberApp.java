public class MemberApp {
	public static void main(String[] args) {
		
		// ȸ�������� ��� ���� Member ��ü�� �����ϰ�
		// setter�� ����ؼ� �̸�, ���̵�, ���, ���� ���� �����͸� ��ü�� �����ϱ�
		Member m = new Member();

		m.setName("ȫ�浿");
		m.setId("hong");
		m.setPassword("dong");
		m.setAge(21);

		// ������ Member��ü�� ����� ���� getter�Լ��� ����ؼ� ȭ�鿡 ����ϱ�
		System.out.println("��    ��: "+m.getName());
		System.out.println("�� �� ��: "+m.getId());
		System.out.println("��й�ȣ: "+m.getPassword());
		System.out.println("��    ��: "+m.getAge());
		
		
		
		


	}
}