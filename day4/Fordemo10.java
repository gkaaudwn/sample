import java.util.Scanner;
import java.util.Random;

public class ForDemo10 {
	public static void main (String[] args) {
		// 1. �� �ֻ����� ��(����)�� 7�̵Ǹ� ���ε���.
		// 2. ���ε��� ���� ��� ���� ���������� �� ���ε����� Ż��
		// 3. ���ε��� ���� ��� �ֻ����� 3�� ���ȴٸ�(���� Ƚ�� ����) ���ε����� Ż��
		// 4. ���ε��� ������ ���� ��쿡�� �ֻ����� �ո�ŭ ���� �̵�
		Random random = new Random();

		for (int i=1; i<=10; i++) {
			
			int first = random.nextInt(6)+1;
			int second = random.nextInt(6)+1;

			System.out.printf("(%d,%d)\n", first, second);
		}
	}
}