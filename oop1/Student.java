public class Student{
	
	int no;//학번
	String name;
	int kor;
	int eng;
	int math;
	
	// 기본 생성자
	public Student(){

	}
	// 모든 필드를 초기화하는 생성자
	public Student(int a,String b,int c,int d, int e){
	no=a;
	name=b;
	kor=c;
	eng=d;
	math=e;
	}
	// 총점을 반환하는 기능 -> 메소드명 total
	public int total(){
	int total=kor+eng+math;
	return total;
	}

	// 평균을 반환하는 기능 -> 메소드명 avg
	public double avg(){
	double avg=(kor+eng+math)/3.0;
	return avg;
	}
	// 학생 정보를 출력하는 기능(총점과 평균도 포함) -> 메소드명
	public void info(){
	System.out.println("학생 번호:"+no);
	System.out.println("학생 이름:"+name);
	System.out.println(name+"의 국어 점수:"+kor);
	System.out.println(name+"의 영어 점수:"+eng);
	System.out.println(name+"의 수학 점수:"+math);


	}
}