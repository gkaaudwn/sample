import java.util.Scanner;

public class ifDemo3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("사용 기간을 입력하세요(년):");
		int year = sc.nextInt();
		System.out.print("운행거리를 입력하세요(km):");
		int distance = sc.nextInt();

		// 사용 기간이 5년 이상이거나 운행 거리가 100000km 이상이면
		// 유상수리대상이고, 그 외의 경우는 무상수리대상 입니다.

		if (year >=5 || distance >= 100000) {
			System.out.println("유상수리 대상입니다.");
		} else {
			System.out.println("무상수리 대상입니다.");
		}
		
	}
}