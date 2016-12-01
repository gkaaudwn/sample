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

		// ����ڰ� �Է��� ���� ������ �迭
		int[] answer = new int[3];

		boolean isSuccess = false;

		for (int a=1; a<=10; a++) {
			int strike = 0;
			int ball = 0;

			System.out.println("ù��° ���� �Է�:");
			answer[0] = sc.nextInt();
			System.out.println("�ι�° ���� �Է�:");
			answer[1] = sc.nextInt();
			System.out.println("����° ���� �Է�:");
			answer[2] = sc.nextInt();

////////////////////// �ڵ�����//////////////////////////////////////////////////////////////			
			
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
				System.out.println("����");
			} else{
				System.out.println ("��Ʈ����ũ:"+strike+"   ��:"+ball);
			}
			


			if (strike == 3) {
				isSuccess = true;
				break;
			}
		}
		
		if (isSuccess) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
}