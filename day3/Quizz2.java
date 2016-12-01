import java.util.*;
public class Quizz2 {
	public static void main(String[] args) {
		// 3자리의 정수를 입력받아서
		// 100의 자리 숫자
		// 10의 자리 숫자
		// 1의 자리 숫자를 각각 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int number = sc.nextInt();
		int num100 = number/100;
		int num10 = (number-num100*100)/10;
		int num1 = number-(num100*100)-(num10*10);
		System.out.print("백의 자리: " + num100);
		System.out.print("십의 자리: " + num10);
		System.out.print("일의 자리: " + num1); 
	}
}