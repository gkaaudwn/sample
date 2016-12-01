import java.util.Scanner;
import java.util.regex.Pattern;


public class Quizz4 {

	public static void main(String[] args) {
	
		// 아이디를입력받아서 올바른 아이디인지 검사하기
		// 아이디 작성 규칙(길이가 6글자 이상, 영어소문자)

		// 97 122
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];

		System.out.print("아이디를 입력해: ");
		String userId = sc.next();

		
		// 검사하기
		

		// 아이디가 6글자 이상인지 검사하기
		if (userId.length() < 6) {
			System.out.println("6글자 이상 입력해라");
			return;
		}

		// 아이디가 영어 소문자로 구성되었는지 검사하기 - boolean
		boolean valid = false;		//Flag변수 : 로직 수행의 특정 상태를 저장하는 변수
		/*
		String regExp = "^[a-z]{6,}$";
		valid = Pattern.matches(regExp, userId);
*/
		if(!valid) {
			System.out.println("유효하지 않음");
		}
	}
	 
}