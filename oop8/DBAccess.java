// 추상 클래스
public abstract class DBAccess {						// 추상화 하려면 클래스도 추상이어야됨

	// 구현 메소드
	public void connect() {
		System.out.println("db와 연결합니다");
	}

	// 구현 메소드
	public abstract void createRepository();

	public void disconnect() {
		System.out.println("db와 연결을 해제합니다.");
	}
}