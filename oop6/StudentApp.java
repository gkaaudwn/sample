public class StudentApp {
	public static void main(String[] args) {
		StudentService service = new StudentService();

		Student student1 = service.getStudentByNo(25);
		System.out.println(student1);

		Student student1 = service.getStudentsByGrade(2);


		Student student2 = new Student(28, 3, "ÀÌ¼ø½Å", "010-4444-5678");
		service.change(student2);
	}
}