import java.util.*;

public class StringTokenizerDemo {
	public static void main (String[] args) {
		
		String text = "(서울=연합뉴스) 이윤영 기자 = 28일 공개된                             국정 역사교과서                        현장 검토본에서 가장 큰 쟁점이 될 내용 중 하나는 바로 대한민국의 건국 시기와 관련한 것이다.";
/*
		StringTokenizer st = new StringTokenizer(text);

		int length = st.countTokens();
		System.out.println("단어 갯수:" + length);

		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			System.out.println("남은 토큰 갯수: "+st.countTokens());

		}
*/		
		String[] tokens = text.split(" ");
		System.out.println("단어 갯수: "+ tokens.length);
		/*
			StringTokenizer
				- 문자열을 구분자를 기준으로 잘라서 토큰으로 만든다.
				- new StringTokenizer(텍스트);			// 구분자가 지정하지 않으면 공백이 구분자가 된다.
				- new StringTokenizer(텍스트, 구분자);

				- boolean hasMoreTokens() : 다음번에 꺼낼 토큰(문자열)이 존재하면 true를 반환한다.
				- String nextToken()	  : 토큰(문자열)을 꺼낸다.
		*/
	}
}