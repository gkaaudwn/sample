import java.util.*;

public class Quizz3 {
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
		// System.out.println(Arrays.toString(numbers));
		int answerCount = 0;	



		// 사용자가 입력한 답을 저장할 배열
		int[] answer = new int[3];

		boolean isSuccess = false;

		for (int a=1; a<=10; a++) {
			int strike = 0;
			int ball = 0;

////////////////////// 코딩구간//////////////////////////////////////////////////////////////			
			String strikeString = "";
			String ballString = "";

			System.out.println("첫번째 숫자 입력:");
			answer[0] = sc.nextInt();
			System.out.println("두번째 숫자 입력:");
			answer[1] = sc.nextInt();
			System.out.println("세번째 숫자 입력:");
			answer[2] = sc.nextInt();
			
			for (int i=0; i<numbers.length; i++) {	//number가 도는 동안 answer을 체크//////////////////////////////////////////
				for (int j=0; j<answer.length; j++) {
					if (numbers[i] == answer[j]) {	// numbers 와 answer 가 같다면
						if (i == j) {				// 그리고 순서도 같다면
							strike++;				// 스트라이크
						} else {					// 
							ball++;
						}
					}
				}
				 
			}
			if (ball + strike == 0) {
				System.out.println ("아웃");
			} else {
				
				if (0 == strike) {
					strikeString = "노";
				}
				if (1 == strike) {
					strikeString = "원";
				}
				if (2 == strike) {
					strikeString = "투";
				}
				if (3 == strike) {
					strikeString = "쓰리";
				}
				if (1 == ball) {
					ballString = "원";
				}
				if (2 == ball) {
					ballString = "투";
				}
				if (3 == ball) {
					ballString = "쓰리";
				}
				if (0 == ball) {
					ballString = "노";
				}
				System.out.println (strikeString+"스트라이크  "+ballString+"볼");
			}
			System.out.println(Arrays.toString(answer));

//////////////////////////코딩구간//////////////////////////////////////////////////////////////

			if (strike == 3) {
				isSuccess = true;
				break;
			}

			answerCount++;
			System.out.println(10-answerCount +"회 남았습니다");
		}
		
		if (isSuccess) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
	}
}