public class People {
	// �Ӽ�
	// �����ȣ
	int num;
	// �̸�
	String name;
	// ��ȭ��ȣ
	String phone;
	// �ҼӺμ�
	String department;
	// ����
	String position;
	// �޿�
	int wage;

	// ���
	// ������ ����ؼ� ��ȯ�ϴ� �޼ҵ�(�޿�*12)
	public int income () {
		return wage*12;
	}	
	// ����� ��� ������ ����ϴ� �޼ҵ�
	public void information () {
		System.out.println("����:"+ num);
		System.out.println("�̸�:"+ name);
		System.out.println("��ȭ��ȣ:"+ phone);
		System.out.println("�ҼӺμ�:"+ department);
		System.out.println("����:"+ position);
		System.out.println("�޿�:"+ wage/10000+"����");
		System.out.println("����:"+income()/10000+"����");
	}
}