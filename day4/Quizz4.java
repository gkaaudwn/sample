import java.util.Scanner;
import java.util.Random;

// 1. �� �ֻ����� ��(����)�� 7�̵Ǹ� ���ε���.
// 2. ���ε��� ���� ��� ���� ���������� �� ���ε����� Ż��
// 3. ���ε��� ���� ��� �ֻ����� 3�� ���ȴٸ�(���� Ƚ�� ����) ���ε����� Ż��
// 4. ���ε��� ������ ���� ��쿡�� �ֻ����� �ո�ŭ ���� �̵�
// 5. �� �̵��Ÿ��� 100
// �ֻ����� ������ ��
//  -island == 0 �̸� ��������
//	-island == 1 �̸� ���ε���

public class Quizz4 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		boolean island = false; // 0�̸� Ż�� 1�̸� ���ε�
		int count = 3;
		int distance = 0;

		for (; ; ) {
			System.out.println("-----------------------------------");
			System.out.println("1. �ֻ��� ������        0. ����");
			System.out.println("-----------------------------------");

			System.out.print("�����ϼ���:");
			int no = sc.nextInt();
			if (no == 1) {
				int first = random.nextInt(6)+1;
				int second = random.nextInt(6)+1;
				System.out.printf("(%d, %d)\n", first, second);

				if (!island) {						// ���ε��� �������� �ʴ� ���
					if (first + second == 7) {		// �� �ֻ����� ���� 7�ΰ��	
						island = true;				// ���ε���
						count = 3;	
						System.out.println("@@@ ���ε��� ���� @@@");// Ż����� 3ȸ ����
					} else {						// �� �ֻ����� ���� 7�� �ƴ� ���
						distance += first + second; // �̵��Ÿ� ����
						System.out.println("�̵��Ÿ�:" + distance + "ĭ");
						if (distance > 100) {		// �̵��Ÿ��� 100�� ������ ������ ����
							System.out.println("###������ ����###");
							break;
						}
					}
				} else {						// ���ε��� �����ִ� ���
					if ( first == second) {		// �ֻ��� ���ڰ� ���� ���
						island = false;			// ���ε� Ż��
					} else {					// �ֻ��� ���ڰ� �ٸ����
						count--;				// ���� Ƚ���� 1 ���ҽ�Ų��

						if (count == 0) {		// ���� Ƚ���� 0�̸�	
							island = false;
							System.out.println("### 3ȸ�� ��� ���ε� Ż�� ###");// ���ε� Ż��
						} else {
							System.out.println("Ż�����"+count+ "ȸ ���ҽ��ϴ�");
						}
					}
				}
			} else if (no == 0) {
				break;
			}
		}
		System.out.printf("���α׷��� �����մϴ�.");
	}
}