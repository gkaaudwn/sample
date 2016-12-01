public class StringDemo {
	
	public static void main(String[] args) {
		
		/*
			String Ŭ����
				String Ŭ������ ���ڿ��� ǥ���Ѵ�.
				String ���� �Һ����̴�. �ѹ� ������� ���Ŀ��� ������ �� ����.
				String�� ��ü�� �����ϴ� Ư���� ����� �����Ѵ�.
					String str = new String("abc");	// �����ڸ� �̿��� String��ü ����
					String str = "abc";				// ���ڿ� ǥ������ �̿��� String ��ü ����
				
				Employee emp = new Employee();
				emp.setNo(12);

				String str = new String("abc");
				str.toUpperCase();

				"abc".toUpperCase();	// �̷��Ե� �ȴ�.
		*/

		String str = "�ڹ� ���α׷��� ����";
		

		// ���ڿ��� ���̸� ��ȯ�ϴ� �޼ҵ�: int length()
		int len = str.length();
		System.out.println("���ڿ��� ����:" +len);	// ���� ��� ���� ���� �̻� �Է��ϸ� �����޼����� ��� �� ����.

		// ���ڿ��� ����ִ��� ���θ� ��ȯ�ϴ� �޼ҵ�: boolean isEmpty()
		boolean empty = str.isEmpty();
		System.out.println("�� ���ڿ��ΰ�? "+empty);	// ���� ��� �Է¹޾ƾ� �� �κ��� ��������� �޼����� ��� �� ����.

		// ���ڿ��� �ǹ̾��� ������ ������ ���ο� ���ڿ��� ��ȯ�ϴ� �޼ҵ�: String trim() (���ڿ��� �յڸ� ���ش�.)
		String str2 = "      ȫ �浿       ";
		str2.trim();
		String str3 = str2.trim();
		System.out.println("str2["+str2+"]");	// str2�� �ٲ��� ����(str2�� �����ؼ� str3�� ���� �����.
		System.out.println("str3["+str3+"]");

		// ���ڿ��� ������ �ٱ��ؼ� ������ ������ ���� ���ڿ����� ���θ� ��ȯ�ϴ� �޼ҵ� : boolean equals(Object str)
		String str4 = "����";
		String str5 = "����";
		boolean equal = str4.equals(str5);
		System.out.println("������ ���ڿ��ΰ�? " + equal);

		String str6 = "apple";
		String str7 = "Apple";

		// ��ҹ��� ���� ���� ���� ���ڿ����� ��
		boolean equal2 = str6.equalsIgnoreCase(str7);
		System.out.println("��ҹ��� ���о��� ������ �� ������ ���ڿ��ΰ�? " + equal2);

		// ���ڿ��� ������ ���ڿ��� �����ϰ� �ִ��� ���θ� ��ȯ�ϴ� �޼ҵ�: boolean contains(String s)
		String str8 = "�ڹ� ���α׷��� - �ڹ� ���� �� ����";
		boolean contains = str8.contains("�ڹ�");
		System.out.println("[�ڹ�]��� ���ڿ��� �����ϰ� �ִ°�? " + contains);

		// ���ڿ����� ������ ��ġ�� ����(char)�� ��ȯ�ϴ� �޼ҵ� : char charAt(int index);
		char ch = str8.charAt(1);
		System.out.println("1��° ���ڴ�? "+ ch);

		// ���ڿ����� ������ ���ڿ��� ó������ �����ϴ� ��ġ�� ��ȯ�ϴ� �޼ҵ�: int indexOf(String str)
		int indexOf = str8.indexOf("���α׷���");
		System.out.println("���ڿ�����[���α׷���]�̶�� ���ڰ� ó������ �����ϴ� ��ġ "+ indexOf);	// ������ -1���

		// ���ڿ��� ������ ������ ���ڿ��� ��ü�� ���ο� ���ڿ��� ��ȯ�ϴ� �޼ҵ� : String replace(String target, String str)
		String str9 = str8.replace("�ڹ�", "���̽�");
		System.out.println("str8 [" + str8+"]");
		System.out.println("str9 [" + str9+"]");

		// ���ڿ����� ������ ��ġ���� ������ ���ڿ��� �߶� ��ȯ�ϴ� �޼ҵ� : String substring(int beginIndex)
		String str10 = "abcdefghijklmn";
		String sub1 = str10.substring(5);
		System.out.println("5��°���� �߶� ���ڿ�: "+sub1);

		// ���ڿ����� ������ ������ ���ڿ��� �߶� ��ȯ�ϴ� �޼ҵ� : String substring(int begin, int end) ���� ��ġ�� ����, �� ��ġ�� �������� ����
		String sub2 = str10.substring(0, 4);
		System.out.println("0������ 4�� �ձ��� �߶� ���ڿ�: " + sub2);

		String name = "ȫ�浿";
		String familyName = name.substring(0,1);
		System.out.println("�� : "+familyName);

		// ���ڿ��� ������ �����ڸ� �������� �߶� �迭�� ��ȯ�ϴ� �޼ҵ�: String[] split(String delim)
		String text = "����,���,��õ,����,�λ�,����,���,�뱸";
		String[] area = text.split(",");
		System.out.println(area[0]);
		System.out.println(area[2]);
		
		// ���ڿ��� �ҹ���/�빮�ڷ� ��ȯ�� ���ο� ���ڿ��� ��ȯ�ϴ� �޼ҵ� : String toUpperCase(), String toLowerCase();
		String str11 = "sony";
		String str12 = str11.toUpperCase();
		System.out.println("str11 ["+ str11+ "]");
		System.out.println("str12 ["+ str12+ "]");
		//String str13 = str12.toLowerCase();
		//System.out.println("str13 ["+ str13+ "]");

		// ����, �Ǽ�, �Ҹ���, ��Ÿ ���� ������ ������ ���ڿ��� ��ȯ�ؼ� ��ȯ�ϴ� ���� �޼ҵ� : String valueOf(int ��),String valueOf(boolean value)
		int number = 1234;
		// ���� 123�� ���ڿ� "123"���� ��ȯ�ؼ� ��ȯ�Ѵ�.
		String str13 = String.valueOf(number);
		System.out.println(str13);
		System.out.println("���� �ڸ���: "+str13.substring(str13.length()-1));

		//String str14 = 1234 + "";



	}
}