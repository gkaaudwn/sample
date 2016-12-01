// Contact의 클래스에서 불러온다
// Contact의 클래스의 no, name....등을 불러온다.

public class ContactApp {
	public static void main(String[] args) {

		Contact c1 = new Contact();
		Contact c2 = new Contact();

		c1.no = 23;
		c1.name = "홍길동";
		c1.phone = "010-1111-1111";
		c1.email = "hong@gmail.com";

		c2.no = 25;
		c2.name = "김유신";
		c2.phone = "010-2222-2222";
		c2.email = "kim@gmail.com";

		c1.call();
		c2.call();

		/*
		Contact[] c = new Contact[10];
		contacts[0] = c1;
		contacts[1] = c2;
		*/

	}
}