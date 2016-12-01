import java.text.DecimalFormat;

public class Student {
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;

	public Student() {}
	// Student
		// 번호, 이름, 국어, 영어, 수학
	public Student(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// 클래스 만들기
	
		// getter/setter 메소드 정의
	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}
		
	public void setNo(int no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}
	// 총점, 평균을 반환하는 getter 메소드 정의
	public int getTotal() {
		return kor+eng+math;
	}

	public double getAverage() {
		return getTotal()/3.0;
	}

	public String getAverageForRound() {
		DecimalFormat df = new DecimalFormat("##.00");
		return df.format(getAverage());
	}

}