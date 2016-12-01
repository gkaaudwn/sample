import java.util.Random;
import java.util.Scanner;
public class ForDemo15{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		Random random = new Random();
		//두 주사위의 합이 6이 되면 무인도.
		//무인도에 갇힌 경우 같은 숫자 조합일 때만 무인도에서 탈출
		//무인도에 갇힌 경우 주사위를 3번 굴렸다면 무인도에서 탈출
		//무인도에 갇히지 않은 경우에는 주사위의 합만큼 칸을 이동.
		boolean island = false; //0이면 자유 1이면 무인도.
		int count = 3;
		int distance=0;
		
		for(;;){
		System.out.println("------------------------------------");
		System.out.println("1.주사위 굴리기  0.종료");
		System.out.println("------------------------------------");
		System.out.print("선택하세요:");
		int sel=sc.nextInt();
		if(sel==1){


		int first=random.nextInt(5)+1;
		int second=random.nextInt(5)+1;
		
		if(!island){ //무인도에 갇혀있지 않는 경우
		if(first+second == 7){//두 주사위의 합이 7인경우
				island=true; //무인도행
				count =3;	//탈출까지 3회남음.
				System.out.println("@@@무인도로 가기@@@");
		}else{				//두 주사위의 합이 7이 아닌경우
			distance += (first +second); //이동거리 증가
			if(distance >100){			 // 이동거리가 100을 넘으면 목적지 도착.
				System.out.println("### 목적지 도착 ###");
				break;
			}

		}

		}else{//무인도에 갇혀있는경우
			if(first == second){ //주사위 숫자가 같은 경우
					island = false ; //무인도 탈출
					System.out.println("###무인도 탈출###");
			}else{				 //주사위 숫자가 다른 경우
					count --;		//남은 횟수를 1감소시킨다.
					if(count == 0){ //남은 횟수가 0이면
						island = false; //무인도 탈출
						System.out.println("###3회를 섞어서 무인도 탈출 ###");
					}else{
					System.out.println("탈출까지 ["+count+"]회 남았습니다.");
					}
			}

		}
		}
		else if(sel==0){
			System.out.println("프로그램 종료");
			break;
		}
	}
}}
