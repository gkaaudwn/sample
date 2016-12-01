import java.util.Scanner;

public class Quizz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 숫자를 입력받아서 그 숫자들의 합과 평균을 계산해서 출력하기
		// 1. 학생 수를 입력받기
		// 2. 학생 수 만큼의 크기를 가진 배열을 만들기
		// 3. 학생 수 만큼 반복하면서 점수를 입력받고 배열에 담기
		// 4. 배열에 저장된 값으로 합계와 평균을 계산해서 출력하기

		System.out.print("국어 시험을 본 학생들의 수를 입력하세요:");
		int size = sc.nextInt();	// 학생수 == 배열의 크기
		int[] scores = new int[size];// 학생수만큼 크기의 배열을 생성
		int total = 0;
		int avg = 0;

		for(int i=0; i<scores.length; i++) {			// 값을 담는 배열
			System.out.print("점수를 입력하세요:");
			scores[i] = sc.nextInt();	// score.length는 size와 동일
			
		}
		//for(int i=0; i<score.length; i++) {			// 값을 꺼내는 배열
		//	total += score[i];
		//}	
		for (int score : scores) {
			total += score;
		}
		
		avg = total/scores.length; // score.length는 size와 동일
		System.out.println("총점:"+total+"평균:"+avg);
	}
}