public class ForDemo7{
	public static void main(String[] args) {
		
		// 1~100까지의 합을 계산하기
		// 단, 합계가 3000을 넘어서는 순간의 숫자를 알아내기
		int total=0;
		int num=0;
		for(int a=1; a<=100; a++) {
			total+=a;
			if(total>=3000){
			num=a;	//a는 포문안에서 사라지므로 num에 대입
			break;
			
			}
		}
		System.out.println(num);
	}
}