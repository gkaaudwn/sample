public class OpticalMouse implements Mouse, Lightable {		// 인터페이스를 상속받을 때는 implements 를 사용
	
	// Mouse인터페이스에 정의된 추상메소드 구현
	public void wheel() {
		System.out.println("빛을 번쩍이며 빙글빙글");
	}

	public void click() {
		System.out.println("빛을 번쩍이며 클릭클릭");
	}

	public void move() {
		System.out.println("빛을 번쩍이며 움직움직");
	}

	// Lightable인터페이스에 정의된 추상메소드 구현
	public void light() {
		System.out.println("반짝");
	}

	// Cleanable인터페이스에 정의된 추상메소드 구현
	//public void clean() {
	//	System.out.println("LED 발신부 청소 완료");
	//}
}