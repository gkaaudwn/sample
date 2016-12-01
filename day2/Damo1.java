public class Damo1 {
	public static void main (String[] args) {
		// 정수타입
		byte b1 = 23;
		byte b2 = -126;
		//byte b3 = 128; byte 자료형의 범위를 벗어난 값은 오류를 발생시킨다.

		int a1 = 128;
		int a2 = -128;

		long c1 = 10000;
		// 숫자의 범위가 int의 범위를벗어나는 값일 경우 반드시 숫자 끝에 L을 표시해야 한다.
		long c2 = 100000000000L; // 소문자l은 숫자1과 헷갈리므로 대문자L을 사용

		int m1 = 10;	// 10진수로 10을 표현
		int m2 = 012;	// 8진수로 10을 표현 1*8^1 + 2*8^0
		int m3 = 0xA;	// 16진수로 10을 표현 A(10)*16^0

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);

		// java7부터 숫자를 적을때 자릿수를 표현하기 위해서 _사용이 가능
		int m4 = 100_000_000;
		int m5 = 5;

		System.out.println(m4 * m5);


	}
}