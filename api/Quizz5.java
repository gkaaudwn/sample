public class Quizz5 {
	public static void main(String[] args) {
		
		String[] words = {"����", "��", "��", "����"};

		String text = "�ڱ��� ��";

		// ������ ������ ��Ģ� ���ԵǾ� �ִ��� ���� Ȯ���ϱ�
		boolean isContains = false;
		/*
		for(int i=0; i<words.length; i++) {
			if(text.contains(words[i]) == true) {
				System.out.println("����Ұ�");
				break;
			} 
			//System.out.println("���డ��");
		}
		*/
		for(String w : words) {
			boolean value = text.contains(w);
			if(value) {
				isContains = true;
			}
		}
		if
		

		
	}
}