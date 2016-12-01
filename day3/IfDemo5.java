import java.util.Scanner;

public class IfDemo5{
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("1:커피(1500원) 2:과일쥬스(2000원) 3:이온음료(1000원)");
		System.out.print("금액을 입력하세요:");
		int money = sc.nextInt();
		System.out.print("음료를 고르세요:");
		int no = sc.nextInt(); 

		int returnCoin =0;

		if (no == 1) {
			if(money>=1500){
				System.out.println("커피를 받아가세요");
				returnCoin = money - 1500;
				
			} else {
				System.out.println("돈 없으면 가라");
			}
			
		} else if (no == 2) {
			if(money>=2000){
				System.out.println("과일쥬스를 받아가세요");
				returnCoin = money - 2000;
				
			} else {
				System.out.println("돈 없으면 가라");
			}
		} else if (no == 3) {
			if(money>=1500){
				System.out.println("이온음료를 받아가세요");
				returnCoin = money - 1000;
				
			} else {
				System.out.println("돈 없으면 가라");
			}
			
		} else {
			System.out.println("잘못입력하였습니다.");
		}
		int ft=returnCoin/5000;
		int ot=(returnCoin-ft*1000)/1000;
		int fh=(returnCoin-ot*1000)/500;
		int oh=(returnCoin-ot*1000-fh*500)/100;
		System.out.println("거스름돈: " + returnCoin + "원");
		System.out.println("오천원:"+ft+"천원:"+ot+"오백원:"+fh+"백원:"+oh);
	}
}