package course;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class CourseMGR {
	
	ArrayList<Student> students = new ArrayList<>();
	ArrayList<Professor> professor = new ArrayList<>();
	ArrayList<Course> course = new ArrayList<>();
	
	Professor loginedProfessor = null;	// !!
	Student loginedStudent = null;		// !!
	
	Scanner sc = new Scanner(System.in);
	
	// 교수 아이디 동일 체크
	public boolean proIdCheck(String id){
		for(Professor p : professor){
			if(id.equals(p.getProId())){
				return true;
			}
		}
		return false;
	}
	// 학생 아이디 동일 체크
	public boolean stuIdCheck(String id) {
		for(Student s : students) {
			if(id.equals(s.getStuId())) {
				return true;
			}
		}
		return false;
	}
	// 교수 가입
	public void addProf () {
		Professor prof = new Professor();
		String id;
		
		System.out.println("사용하실 아이디를 입력하세요:");
		id = sc.nextLine();
		boolean result = proIdCheck(id);
		while(result){
			System.out.println("중복된 아이디입니다.");
			System.out.println("사용하실 아이디를 입력하세요:");
			id = sc.nextLine();
			result = proIdCheck(id);
			
		}
		prof.setProId(id);
		
		
		System.out.println("비밀번호를 입력하세요");
		prof.setProPw(sc.nextLine());
		System.out.println("이름을 입력하세요:");
		prof.setName(sc.nextLine());
		System.out.println("학과를 입력하세요");
		prof.setPromajor(sc.nextLine());
		professor.add(prof);
		
	}
	
	// 교수 로그인
	public boolean loginPro() {			
		System.out.println("아이디를 입력하세요:");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요:");
		String pw = sc.nextLine();
		for(Professor p : professor){
			if(p.getProId().equals(id) && p.getProPw().equals(pw)){
				System.out.println("로그인되었습니다.");
				loginedProfessor = p;
				return true;
			}
		}
		System.out.println("아이디 혹은 비밀번호가 일치하지 않습니다.");
		return false;
	}
	
	// 과정등록하기
	public void addCourse () {	
		Course cou = new Course();
		System.out.println("과목명을 입력하세요:");
		cou.setName(sc.nextLine());
		System.out.println("과목 정원을 입력하세요:");
		cou.setLimit(Integer.parseInt(sc.nextLine()));
		cou.setProf(loginedProfessor);
		int codeNum = 1;
		cou.setCode(codeNum++);
		course.add(cou);
		
	}
	
	// 내가 등록한 과정 조회
	public void addCourseInfo() {	
		for(Course c : course) {
			if(c.getProf().equals(loginedProfessor)) {
				System.out.println(c.getCode() + c.getName() + c.getStudents().size() + "/" + c.getLimit());
				for(Student s : c.getStudents()) {
					System.out.println(s.getStuNum() + s.getName() + s.getStuMajor() + s.getGrade());
				}
				
			}
		}
	}
	
	// 내가 등록한 과정에 수강신청한 학생 조회
	public void courseStu () {
		
	}
	
	// 학생으로 가입
	public void addStu () {
		Student stu = new Student();
		String id;
		System.out.println("아이디를 입력하세요:");
		id = sc.nextLine();
		boolean result = stuIdCheck(id);
		while(result){
			System.out.println("중복된 아이디입니다.");
			System.out.println("사용하실 아이디를 입력하세요:");
			id = sc.nextLine();
			result = stuIdCheck(id);
		}
		stu.setStuId(id);
		
		System.out.println("비밀번호를 입력하세요");
		stu.setStuPw(sc.nextLine());
		System.out.println("이름을 입력하세요: ");
		stu.setName(sc.nextLine());
		System.out.println("학과를 입력하세요: ");
		stu.setStuMajor(sc.nextLine());
		System.out.println("학년을 입력하세요:");
		stu.setGrade(Integer.parseInt(sc.nextLine()));
		Date now = new Date();
		//String nowDate1 = now.toString();
		SimpleDateFormat sd = new SimpleDateFormat("yy");
		String nowDate2 = sd.format(now);
		
		Random r = new Random();
		stu.setStuNum(Integer.parseInt(nowDate2)+r.hashCode());
		students.add(stu);
	}
	
	// 학생으로 로그인
	public boolean loginStu(){
		System.out.println("아이디를 입력하세요:");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요:");
		String pw = sc.nextLine();
		for(Student s : students) {
			if(s.getStuId().equals(id) && s.getStuPw().equals(pw)) {
				System.out.println("로그인 되었습니다");
				loginedStudent = s;
				return true;
			}
		}
		System.out.println("아이디 혹은 비밀번호가 일치하지 않습니다.");
		return false;
	}
	
	// 전체 개설 과정 조회하기
	public void allCourseInfo() {
		for(Course c : course){
			System.out.println(c.getCode() + c.getName() + c.getLimit()+ c.getProf().getName());
			
		}
	}
	
	// 개설된 과정 중 하나에 수강신청하기
	public void reqCourse() {
		System.out.println("신청할 과목의 과목명을 입력하세요:");
		String couName = sc.nextLine();
		boolean result = true;
		for (Course c : course) {
			
			if (c.getName().equals(couName) && c.getLimit() != 0) {
				for(Course t : loginedStudent.getCourse()){
					if(c.getCode()==t.getCode()){
						System.out.println("이미 수강신청한 과목입니다.");
						return;
					}
				}
			}
				
			if (c.getName().equals(couName) && c.getLimit() == 0) {
				System.out.println("수강인원이 꽉 찼습니다.");
				return;
			}
			if (c.getName().equals(couName) && c.getLimit() != 0) {
				result = false;							// result가 false면 수강신청 가능
				c.getStudents().add(loginedStudent);	// course의 students(arrayList)를 불러와서 거기에.add(현재로그인한 사람)를 한다.
				//students
				System.out.println("수강신청이 완료되었습니다");
				c.setLimit(c.getLimit()-1);				// 현재 저장되어 있는 수강제한 인원에 -1을 해주고 그것을 setLimit에 넣는다.
			}
		}
		if(result){
			System.out.println("해당 과목이 개설되지 않았습니다.");
			return;
		}
		
	}
	
	// 자신이 수강신청한 과정 조회하기
	public void reqCourseInfo() {
		
	}
}
