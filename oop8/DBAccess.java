// �߻� Ŭ����
public abstract class DBAccess {						// �߻�ȭ �Ϸ��� Ŭ������ �߻��̾�ߵ�

	// ���� �޼ҵ�
	public void connect() {
		System.out.println("db�� �����մϴ�");
	}

	// ���� �޼ҵ�
	public abstract void createRepository();

	public void disconnect() {
		System.out.println("db�� ������ �����մϴ�.");
	}
}