import java.util.Scanner;
import java.util.Random;

public class ForDemo10 {
	public static void main (String[] args) {
		// 1. 두 주사위의 합(변수)이 7이되면 무인도행.
		// 2. 무인도에 갇힌 경우 같은 숫자조합일 때 무인도에서 탈출
		// 3. 무인도에 갇힌 경우 주사위를 3번 굴렸다면(남은 횟수 변수) 무인도에서 탈출
		// 4. 무인도에 갇히지 않은 경우에는 주사위의 합만큼 같을 이동
		Random random = new Random();

		for (int i=1; i<=10; i++) {
			
			int first = random.nextInt(6)+1;
			int second = random.nextInt(6)+1;

			System.out.printf("(%d,%d)\n", first, second);
		}
	}
}