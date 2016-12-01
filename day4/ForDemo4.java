public class ForDemo4 {
	public static void main (String[] args) {
		
		for (int a=1; a<=5; a++) {
			System.out.println("실행");

			for(int b=1; b<=10; b++) {
				if ((a+b)%3==0){
				System.out.println("a의 값:"+a+"  b의 값:"+b);
				}
				
			}
		}

	}
}