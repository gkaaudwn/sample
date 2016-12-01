import java.util.*;
public class SystemDemo {
	public static void main(String[] args) {
		
		// ���� �ð� �˾Ƴ���(�߿�)
		long time1 = System.currentTimeMillis();

		System.out.println(time1);

		long time2 = System.currentTimeMillis();

		System.out.println(time2-time1);

		long nanoTime = System.nanoTime();
		System.out.println(nanoTime);

		// ȯ�溯���� ��ȸ�ϱ�
		String value1 = System.getenv("JAVA_HOME");
		System.out.println(value1);
		String value2 = System.getenv("PATH");
		System.out.println(value2);

		// ���� �ý����� �ٹٲ޹��� ��ȸ�ϱ�
		String newLineChar = System.getProperty("line.separator");
		System.out.println("asdfsa"+newLineChar+"sadfsaf");

		// ���� �ý����� ����� Ȩ ���丮 ��ȸ�ϱ�
		String dir = System.getProperty("user.home");
		System.out.println(dir);

		// ���α׷� �����ϱ�
		//System. exit(0);

		// �迭 �����ϱ�
		String[] src = {"�̼���", "������", "������", "ȫ�浿", "������", "�Ӳ���"};
		String[] dest = new String[10];

		System.arraycopy(src, 3, dest, 1, 2);	
		// (�����迭, �������� ������ �׸��� ������ġ, �� �迭, �� �迭���� �ٿ����� ������ġ ,����Ǵ� ����)

		System.out.println(Arrays.toString(dest));

	}
}