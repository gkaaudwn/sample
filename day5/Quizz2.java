import java.util.Scanner;

public class Quizz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ���ڸ� �Է¹޾Ƽ� �� ���ڵ��� �հ� ����� ����ؼ� ����ϱ�
		// 1. �л� ���� �Է¹ޱ�
		// 2. �л� �� ��ŭ�� ũ�⸦ ���� �迭�� �����
		// 3. �л� �� ��ŭ �ݺ��ϸ鼭 ������ �Է¹ް� �迭�� ���
		// 4. �迭�� ����� ������ �հ�� ����� ����ؼ� ����ϱ�

		System.out.print("���� ������ �� �л����� ���� �Է��ϼ���:");
		int size = sc.nextInt();	// �л��� == �迭�� ũ��
		int[] scores = new int[size];// �л�����ŭ ũ���� �迭�� ����
		int total = 0;
		int avg = 0;

		for(int i=0; i<scores.length; i++) {			// ���� ��� �迭
			System.out.print("������ �Է��ϼ���:");
			scores[i] = sc.nextInt();	// score.length�� size�� ����
			
		}
		//for(int i=0; i<score.length; i++) {			// ���� ������ �迭
		//	total += score[i];
		//}	
		for (int score : scores) {
			total += score;
		}
		
		avg = total/scores.length; // score.length�� size�� ����
		System.out.println("����:"+total+"���:"+avg);
	}
}