/* banking program
1. ���µ�� ���
	�̸�, ��й�ȣ, ���� �Աݾ��� �Է¹޾Ƽ� ���¸� �����Ѵ�.
2. ��ȸ���
	�̸�, ���¹�ȣ, �ܾ��� ǥ���Ѵ�.
3. ��й�ȣ ������
	���� ��й�ȣ�� �� ��й�ȣ�� �Է¹޾Ƽ� ��й�ȣ�� �����Ѵ�.
4. �Ա� ���
	�Աݾ��� �Է¹޾Ƽ� �ܾ��� ������Ų��.
5. ��ݱ��
	��ݾװ� ��й�ȣ�� �Է¹޾Ƽ� �ܾ��� ���ҽ�Ų��.
6. ����
	���α׷��� �����Ѵ�.
*/
public class Acount {
	private String name;
	private int password;
	private int money;

	public Acount() {}

	public Acount(String name, int password, int money) {
		this.name = name;
		this.password = password;
		this.money = money;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}

	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
