public class BallMouse implements Mouse, Cleanable {
	
	public void wheel() {
		System.out.println("빙글빙글");
	}

	public void click() {
		System.out.println("클릭클릭");
	}

	public void move() {
		System.out.println("움직움직");
	}

	public void clean() {
		System.out.println("볼의 먼지를 청소");
	}
}