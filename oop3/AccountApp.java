public class AccountApp {
	public static void main(String[] args) {
		Account a = new Account("ȫ�浿","111-22-3333", 1234, 1000000);

		// a.info();
		// System.out.println("������:"+ a.owner);	// owner�� ������ �� ���� ->private��
		System.out.println("������:"+a.getOwner());

	}
}