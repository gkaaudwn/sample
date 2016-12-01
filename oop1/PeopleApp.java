public class PeopleApp {
	public static void main(String[] args) {
		People a1 = new People();
		People a2 = new People();

		a1.num = 1;
		a1.name = "홍길동";
		a1.phone = "010-1111-1111";
		a1.department = "영업부";
		a1.position = "과장";
		a1.wage = 2000000;

		a2.num = 2;
		a2.name = "김유신";
		a2.phone = "010-2222-2222";
		a2.department = "영업부";
		a2.position = "대리";
		a2.wage = 1800000;

		int income = a1.income();
		int income2 = a2.income();

		System.out.println("연봉:"+ income/10000+"만원");
		a1.information();
		System.out.println("연봉:"+ income2/10000+"만원");
		a2.information();
	}
}