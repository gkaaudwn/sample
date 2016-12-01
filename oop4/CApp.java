public class CApp {
	public static void main(String[] args) throws Exception {
		// Class.forName("전체 클래스 이름")
		Class.forName("C");	// ----> 초기화 블록이 실행됐다.

		//C c1 = new C();
		//C c2 = new C();
		//C c3 = new C();

		System.out.println(C.y);
		System.out.println(C.y);
		System.out.println(C.y);


	}
}