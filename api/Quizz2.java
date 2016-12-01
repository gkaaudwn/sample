public class Quizz2 {
	public static void main(String[] args) {
		
		String text = "<hong@naver.com>,<kim@naver.com>,<kang@naver.com>,<yusin@naver.com>";
		String[] str1 = text.split(",");
		/*
		for(String s: str1) {
			
			System.out.println(s.substring(1,s.length()-1));
		}
		*/
		/*
		for(String mail : str1) {
			int beginIndex = mail.indexOf("<");
			int endIndex = mail.indexOf("<");

			mail = mail.substring(beginIndex+1, endIndex);
			System.out.println(mail);
		}
		*/

		for (String mail : str1) {
			mail = mail.replace("<","").replace(">","");
			System.out.println(mail);
		}

	}
}