import java.util.Scanner;

public class Quizz4 {
	public static void main (String [] args) {
		// 임의의 두자리 숫자를 입력받아서 그 숫자에 해당하는 한글로 변환하기
		// 예) 23 -> 이십삼
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int num = sc.nextInt();
		String hangul="";
		int sip= num/10;
		int il= num-sip*10;

		if(sip==1){
			hangul="일십";
		}else if(sip==2){
			hangul="이십";
		}else if(sip==3){
			hangul="삼십";
		}else if(sip==4){
			hangul="사십";
		}else if(sip==5){
			hangul="오십";
		}else if(sip==6){
			hangul="육십";
		}else if(sip==7){
			hangul="칠십";
		}else if(sip==8){
			hangul="팔십";
		}else if(sip==9){
			hangul="구십";
		}
		if (il==1){
			hangul+="일";
		}else if(il==2){
			hangul+="이";
		}else if(il==3){
			hangul+="삼";
		}else if(il==4){
			hangul+="사";
		}else if(il==5){
			hangul+="오";
		}else if(il==6){
			hangul+="육";
		}else if(il==7){
			hangul+="칠";
		}else if(il==8){
			hangul+="팔";
		}else if(il==9){
			hangul+="구";
		}
		System.out.println(hangul);

	}
}