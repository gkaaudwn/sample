import java.util.Scanner;   // 만약 실행1번을 눌렀다면 작업관리자의 프로세스에 java.exe를 제거

public class Quizz1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		// 국어, 영어, 수학점수를 입력받아서 
		// 총합과 평균을 계산하기
		System.out.print("국어 점수를 입력하세요:");
		int kor = sc.nextInt();
		System.out.print("영어점수를 입력하세요:");
		int eng = sc.nextInt();
		System.out.print("수학점수를 입력하세요:");
		int math = sc.nextInt();

		int total = kor + eng + math;
		float avg = (float)total/3;
		System.out.println("총합 : "+total+"\t평균 :"+avg);
	}
}