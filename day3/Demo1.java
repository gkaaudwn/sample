public class Demo1 {
	public static void main (String[] args) {
		// 논리 연산자
		int x = 10;
		int y = 10;

		// &&는 좌변이 false이면 우변을 평가하지 않고 전체 결과를 false로 판정
		// &는 좌변이 false이더라도 우변을 평가한다.
		boolean result1 = false && x++ > 10;	// &&일때 앞에가 false 니까 뒤의 연산을 하지 않음
		boolean result2 = false &  x++ > 10;	// &일때는 앞뒤 모두 연산을 하므로
		System.out.println(result1);
		System.out.println(result2);
		System.out.println("x:" +x);			// &&일때 앞에가 false 니까 뒤의 연산을 하지 않음 11출력
		System.out.println("y:" +y);			// &일때는 앞뒤 모두 연산을 하므로 10출력


	}
}