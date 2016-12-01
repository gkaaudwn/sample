import java.util.*;

public class Quizz3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int[] numbers = new int[3];
		int position = 0;
		for (;;) {
			int number = ran.nextInt(10);
			boolean isExit = false;
			for(int i=0;i<position; i++) {
				if(numbers[i] == number) {
					isExit = true;
				}
			}
			if (!isExit) {
				numbers[position] = number;
				position++;
			}

			if (position == 3) {
				break;
			}
		}
		System.out.println(Arrays.toString(numbers));

		// 사용자가 입력한 답을 저장할 배열
		int[] answer = new int[3];

		boolean isSuccess = false;

		for (int a=1; a<=10; a++) {
			int strike = 0;
			int ball = 0;

			System.out.println("첫번째 숫자 입력:");
			answer[0] = sc.nextInt();
			System.out.println("두번째 숫자 입력:");
			answer[1] = sc.nextInt();
			System.out.println("세번째 숫자 입력:");
			answer[2] = sc.nextInt();

////////////////////// 코딩구간//////////////////////////////////////////////////////////////			
			
			for (int i=0; i<numbers.length; i++) {
				for (int j=0; j<answer.length; j++) {
					if (numbers[i] == answer[j]) {
						if(i==j) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}

			if (ball + strike == 0) {
				System.out.println("실패");
			} else{
				System.out.println ("스트라이크:"+strike+"   볼:"+ball);
			}
			


			if (strike == 3) {
				isSuccess = true;
				break;
			}
		}
		
		if (isSuccess) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
	}
}