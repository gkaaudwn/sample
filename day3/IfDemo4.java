import java.util.Scanner;

public class IfDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1:커피(1500원) 2:과일쥬스(2000원) 3:이온음료(1000원)");
		System.out.print("금액을 입력하세요:");
		int money = sc.nextInt();

		
		
		System.out.print("음료를 고르세요:");
		int no = sc.nextInt();
		
		int returnCoin = 0;

		if (no == 1) {
			System.out.println("음료를 받아가세요");
			//System.out.println("거스름돈은"+(money-1500)+"원입니다");
			returnCoin = money - 1500;
		}
		if (no == 2) {
			System.out.println("음료를 받아가세요");
			//System.out.println("거스름돈은"+(money-2000)+"원입니다");
			returnCoin = money - 2000;
		}
		if (no == 3) {
			System.out.println("음료를 받아가세요");
			//System.out.println("거스름돈은"+(money-1000)+"원입니다");
			returnCoin = money - 1500;
		}

		System.out.println("거스름돈은"+returnCoin+"원입니다");
	}
}