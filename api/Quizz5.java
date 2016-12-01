public class Quizz5 {
	public static void main(String[] args) {
		
		String[] words = {"새끼", "놈", "년", "병신"};

		String text = "박근혜 썅";

		// 위에서 나열한 금칙어가 포함되어 있는지 여부 확인하기
		boolean isContains = false;
		/*
		for(int i=0; i<words.length; i++) {
			if(text.contains(words[i]) == true) {
				System.out.println("실행불가");
				break;
			} 
			//System.out.println("실행가능");
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