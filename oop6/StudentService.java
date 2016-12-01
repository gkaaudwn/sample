/*
	StudentService는 학생정보를 저장/조회/삭제/변경하는 기능을 제공하는 클래스다
*/
//import java.util.Scanner;

public class StudentService {

	//Scanner sc = new Scanner(System.in);

	private Student[] db = new Student[5];
	
	public StudentService() {
		db[0] = new Student(23, 3, "홍길동", "010-1111-1111");
		db[1] = new Student(25, 1, "김유신", "010-2222-2222");
		db[2] = new Student(27, 2, "강감찬", "010-3333-3333");
		db[3] = new Student(28, 3, "이순신", "010-4444-4444");
		db[4] = new Student(30, 4, "권률", "010-5555-5555");
	}
	// 학번을 전달받아서 그 학번에 해당하는 학생정보를 반환하는 메소드
	public Student getStudentByNo(int no) {
		
		Student result = null;
		//int num = sc.nextInt();
		for (Student s:db) {
			if (s.getNo() == no) {
				result = s;
				System.out.printf("%d %d %s %s\n",s.getNo(), s.getGrade(), s.getName(), s.getPhone());
				break;
				
			}
		}

		return result;


	}

	// 학년을 잔달받아서 그 학년에 해당하는 학생정보를 반환하는 메소드
	public Student[] getStudentsByGrade(int grade) {
		Student[] result = null;
		int position = 0;
		Student[] temp = new Student[db.length];
		for (Student s : db) {
			if(s.getGrade() == grade) {
				temp[position] = s;
				position++;
			}
		}

		result = new Student[position];
		for (int i=0; i<position; i++) {
			result[i] = temp[i];
		}
		return result;
	}

	// 학생정보를 잔달받아서 그 학번에 해당하는 학생정보를 변경하는 메소드
	public void change(Student student) {
		for (int i=0; i<db.length; i++) {
			Student s = db[i];
			if(s.getNo() == student.getNo()) {
				db[i] = student;
			}
		}
	}
}