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



		// ����ڰ� �Է��� ���� ������ �迭
		int[] answer = new int[3];

		boolean isSuccess = false;

		for (int a=1; a<=10; a++) {
			int strike = 0;
			int ball = 0;

////////////////////// �ڵ�����//////////////////////////////////////////////////////////////			
			String strikeString = "";
			String ballString = "";

			System.out.println("ù��° ���� �Է�:");
			answer[0] = sc.nextInt();
			System.out.println("�ι�° ���� �Է�:");
			answer[1] = sc.nextInt();
			System.out.println("����° ���� �Է�:");
			answer[2] = sc.nextInt();
			
			for (int i=0; i<numbers.length; i++) {	//number�� ���� ���� answer�� üũ//////////////////////////////////////////
				for (int j=0; j<answer.length; j++) {
					if (numbers[i] == answer[j]) {	// numbers �� answer �� ���ٸ�
						if (i == j) {				// �׸��� ������ ���ٸ�
							strike++;				// ��Ʈ����ũ
						} else {					// 
							ball++;
						}
					}
				}
				 
			}
			if (ball + strike == 0) {
				System.out.println ("�ƿ�");
			} else {
				
				if (0 == strike) {
					strikeString = "��";
				}
				if (1 == strike) {
					strikeString = "��";
				}
				if (2 == strike) {
					strikeString = "��";
				}
				if (3 == strike) {
					strikeString = "����";
				}
				if (1 == ball) {
					ballString = "��";
				}
				if (2 == ball) {
					ballString = "��";
				}
				if (3 == ball) {
					ballString = "����";
				}
				if (0 == ball) {
					ballString = "��";
				}
				System.out.println (strikeString+"��Ʈ����ũ  "+ballString+"��");
			}
			System.out.println(Arrays.toString(answer));

//////////////////////////�ڵ�����//////////////////////////////////////////////////////////////

			if (strike == 3) {
				isSuccess = true;
				break;
			}

			answerCount++;
			System.out.println(10-answerCount +"ȸ ���ҽ��ϴ�");
		}
		
		if (isSuccess) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
}