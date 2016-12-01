	import java.util.Scanner;
		
	public class Student1App{
		public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		// 학생정보(번호,이름,국어,영어,수학점수) 입력받아서
		// Student객체에 저장하기
		Student1 student=new Student1();
		
		System.out.print("번호를 입력:");
		int no =sc.nextInt();
		student.setNo(no);
		
		System.out.print("이름을 입력:");
		
		String name=sc.next();
		student.setName(name);
		
		System.out.print("국어 점수 입력:");
		int kor=sc.nextInt();
		student.setKor(kor);

		System.out.print("영어 점수 입력:");
		int eng=sc.nextInt();
		student.setEng(eng);

		System.out.print("수학 점수 입력:");
		int math=sc.nextInt();
		student.setMath(math);
		
		System.out.println("학생 이름:"+student.getName());
		System.out.println("학생 번호:"+student.getNo());
		System.out.println(student.getName()+"의 국어점수:"+student.getKor());
		System.out.println(student.getName()+"의 영어점수:"+student.getEng());
		System.out.println(student.getName()+"의 수학점수:"+student.getMath());
		System.out.println(student.getName()+"의 점수 총합:"+student.getSum());
		System.out.println(student.getName()+"의 평균점수:"+student.getAvg());
		System.out.println("반올림한거:"+student.getAverageForRound());
		
		
		
		
		
		
	}	
}		
