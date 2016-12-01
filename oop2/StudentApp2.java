public class StudentApp2 {
	public static void main(String[] args) {
		
		// 학생들을 여러명 저장하는 배열 만들기
		// Student객체 5개 담을 수 있는 배열을 생성해서 students 변수에 담았다.
		Student[] students = new Student[3];

		students[0] = new Student(1, "유신", 50, 70, 80);
		students[1] = new Student(2, "순신", 60, 80, 90);
		students[2] = new Student(3, "감찬", 70, 90, 100);

		//students[0].info();
		//students[1].info();
		//students[2].info();

		/*
		for (int i=0; i<students.length; i++) {
			Student s = students[i];
			s.info();
		}
		*/

		System.out.println("이름 국어 영어 수학 총점 평균");
		for (Student s: students) {
			System.out.printf("%s %4d %4d %4d %2.2f\n",
				s.name, s.kor, s.eng, s.total(), s.avg());
		}

	}
}