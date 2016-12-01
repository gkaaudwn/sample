public class FinalDemo2 {
	private final int x;
	private int y;

	// 생성된 객체마다 다른 값을 가질 수는 있지만, 한번 값이 할당된 이후에는 값을 변경할 수 없다.
	public FinalDemo2(int x, int y) {	// 생성자에서는 변경 가능
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	// final로 지정된 변수는 setter를 사용해서 값을 변경할 수 없다.
	/*
	public void setX(int x) {
		this.x = x;
	}
	*/

	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}