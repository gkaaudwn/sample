public class PeopleApp {
	public static void main(String[] args) {
		People a1 = new People();
		People a2 = new People();

		a1.num = 1;
		a1.name = "ȫ�浿";
		a1.phone = "010-1111-1111";
		a1.department = "������";
		a1.position = "����";
		a1.wage = 2000000;

		a2.num = 2;
		a2.name = "������";
		a2.phone = "010-2222-2222";
		a2.department = "������";
		a2.position = "�븮";
		a2.wage = 1800000;

		int income = a1.income();
		int income2 = a2.income();

		System.out.println("����:"+ income/10000+"����");
		a1.information();
		System.out.println("����:"+ income2/10000+"����");
		a2.information();
	}
}