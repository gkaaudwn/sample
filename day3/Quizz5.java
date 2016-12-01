import java.util.Scanner;

public class Quizz5 {
	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를입력받아서
		// 총점, 평균, 학점을 출력하기
		// 학점은 90이상:A, 80이상:B, 70이상:C, 60이상:D, 그 외는 F
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수:");
		int kor = sc.nextInt();
		System.out.print("영어점수:");
		int eng = sc.nextInt();
		System.out.print("수학점수:");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		int avg = total/3;
		
		if(avg >= 90) {
			System.out.println("총점:"+total+"평균:"+avg+"학점:"+"A");
		}else if(avg >= 80) {
			System.out.println("총점:"+total+"평균:"+avg+"학점:"+"B");
		}else if(avg >= 70) {
			System.out.println("총점:"+total+"평균:"+avg+"학점:"+"C");
		}else if(avg >= 60) {
			System.out.println("총점:"+total+"평균:"+avg+"학점:"+"D");
		}else {
			System.out.println("총점:"+total+"평균:"+avg+"학점:"+"f");
		}
	}
}