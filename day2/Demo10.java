public class Demo10 {
	public static void main(String[] args){
		// 산술 연산자
		int a = 10;
		int b = 5;

		// 연산은 항상 새로운 값을 생성해낸다.
		// 반드시 그 값을 변수에 담자.
		int c = a + b;
		int d = a - b;
		int e = a*b;
		int f = a/b;
		int g = a%b;
		System.out.println(g);
		// +연산자는 문자열과 관련있는 경우 이어붙이기로 동작한다.
		// "문자열" + 숫자일 경우 숫자를 문자로 인식한다.
		// 숫자 + "문자열" 일 경우 숫자 연산 후 문자를 이어붙이기 한다.
		String x = "가나다라";
		String y = "hello";
		String z = x + y;
		System.out.println(3 + 6 + "hello");
		System.out.println("hello" + 3 + 6);
		System.out.println("hello" + (3+6));

		int kor = 60;
		int eng = 70;
		int math = 30;
		System.out.println("총점 : " + (kor + eng + math));

		
	}
}