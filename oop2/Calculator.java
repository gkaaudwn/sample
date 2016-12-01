public class Calculator {	// 메소드 오버로딩 연습
	
	// 매개변수의 타입이나 갯수가 다를때 메소드의 이름이 같아도 된다.

	// 정수 2개를 전달받아서 합을 계산하고 반환하는 메소드
	public int plus(int a, int b) {
		System.out.println("정수+정수");
		
		return a+b;
	}

	// 실수 2개를 전달받아서 합을 계산하고 반환하는 메소드
	public double plus(double a, double b) {
		
		System.out.println("실수+실수");
		
		return a+b;
	}

	// 정수 3개를 전달받아서 합을 계산하고 반환하는 메소드
	public int plus(int a, int b, int c) {
		System.out.println("정수+정수+정수");
		
		return a+b+c;
	
	}

	// 실수 3개를 전달받아서 합을 계산하고 반환하는 메소드
	public double plus(double a, double b, double c) {
		System.out.println("실수+실수+실수");
		
		return a+b+c;
	
	}

}