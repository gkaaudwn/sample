import java.util.Scanner;

public class Homework2{
	
	public static boolean confirm(int b,int c[]){
	boolean result=false;
	for(int i=0;i<c.length;i++){
		if(b==c[i]){
			result=true;
		}
	}
	return result;
	}

	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	boolean success;
	int []a=new int[3];
	System.out.print("첫번째 배열숫자입력: ");
	 a[0]=sc.nextInt();
	System.out.print("두번째 배열 숫자 입력: ");
	 a[1]=sc.nextInt();
	System.out.print("세번째 배열 숫자입력: ");
	a[2]=sc.nextInt();
	System.out.println("["+a[0]+","+a[1]+","+a[2]+"]");

	System.out.print("아무 숫자 입력: ");
	int d=sc.nextInt();

	success=confirm(d,a);
	System.out.println(success);
	
	}
}
