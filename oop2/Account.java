/*
	������¸� ǥ���ϴ� Ŭ����
		- �Ӽ�
			������
			���¹�ȣ
			��й�ȣ
			�ܾ�
		- ���
			��ݱ�� : �ݾװ� ��й�ȣ�� ���޹޾Ƽ� ��й�ȣ�� ������ �Է��� ��й�ȣ�� ��ġ�ϸ� �ݾ׸�ŭ�� �ܾ׿��� ���ҽ�Ű�� �ݾ׸�ŭ�� ���� ��ȯ�Ѵ�.
			�Աݱ�� : �ݾ��� ���޹޾Ƽ� �� �ݾ׸�ŭ �ܾ��� ������Ű�� ȭ�鿡 ���� �ܾ��� ǥ���Ѵ�.
			��ȸ��� : ȭ�鿡 ������, ���¹�ȣ, �ܾ��� ǥ���Ѵ�.
*/

public class Account {
	
	String owner;
	String accountNumber;
	int password;
	int balance;

	// ��ݱ��
	public int withdraw(int amount, int pwd) {
		int money = 0;	// ���޹޴� ��!!!
		if(password != pwd) {
			System.out.println("��й�ȣ�� �����ʽ��ϴ�");
		} else {
			if(balance < amount) {
				System.out.println("�ܾ��� �����մϴ�");
			
			} else {
				balance -= amount;
				System.out.println("��� �� �ܾ���:"+balance);
				money = amount;
			}
			
		}
		return money;
	}

	// �Աݱ��
	public void deposit(int amount) {
		balance += amount;
		System.out.println("�Ա� �� �ܾ���: "+balance);
	}
	
	// ��ȸ���
	public void info() {
		System.out.println("#### �������� ####");
		System.out.println("�� �� ��: "+ owner);
		System.out.println("���¹�ȣ: "+ accountNumber);
		System.out.println("��    ��: "+ balance);
	}
	
	
}