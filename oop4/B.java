public class B {
	int x;
	static int y;
	
	public void m1() {
		System.out.println(x);
		System.out.println(y);
	
	}

	// static 메소드에서는 non-static 변수를 사용할 수 없다.
	// this를 사용할 수 없다.
	public static void m2() {	// 객체가 생성되자마자 쓸 수 있는데
		//System.out.println(x);	// 객체가 생성후 쓸 수 있기때문에	// m2사용 가능 시점에 x사용 불가 // 결국 static 끼리만 사용 가능하다능.....
		System.out.println(y);
	}

	public void m3() {
		m1();
		m2();
	}

	public static void m4() {
		//m1();
		m2();
	}
}