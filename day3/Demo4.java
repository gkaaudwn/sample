public class Demo4 {
	public static void main (String[] args) {
		// 비트 연산자

	int a = 4;
	int b = 6;

	int result = a % b;
	System.out.println(result);
	result = a | b;
	System.out.println(result);
	result = a ^ b;
	System.out.println(result);
	result = ~a;
	System.out.println(result);

	int c = -4;
	result = c >> 2;			// 비어있는 부분에 원래 부호를 넣는다(1)
	System.out.println(result);
	result = c << 2;
	System.out.println(result);
	result = c >>> 2;
	System.out.println(result);

	}
}