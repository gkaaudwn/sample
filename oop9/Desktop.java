public class Desktop {

	private Mouse mouse;	// mouse에는 어떤 것도 담을 수 있음

	public Desktop() {}

	public Desktop(Mouse mouse) {
		this.mouse = mouse;
	}
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public void running() {
		mouse.click();
	}

	public void painting() {
		mouse.move();
	}

	public void cleaning() {
		if (mouse instanceof Cleanable) {
			((Cleanable) mouse).clean();
		} else {
			System.out.println("청소기능을 지원하지 않습니다");
		}
	}
}