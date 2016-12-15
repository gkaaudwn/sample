package course;

import java.util.Scanner;

public class CourseApp {
	public static void main(String[] args) {

		Course course = new Course();
		CourseMGR mgr = new CourseMGR();
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("------------------------------------------------------");
			System.out.println("1. 회원가입	2. 로그인		0.종료");
			System.out.println("------------------------------------------------------");
			System.out.println("메뉴를 고르세요:");
			int num1 = Integer.parseInt(sc.nextLine());

			if(num1 == 1){
				System.out.println("------------------------------------------------------");
				System.out.println("1. 학생	2. 교수	0.종료");
				System.out.println("------------------------------------------------------");
				System.out.println("메뉴를 고르세요:");
				int num2 = Integer.parseInt(sc.nextLine());
				if(num2 == 1) {
					mgr.addStu();
				} else if(num2 == 2){
					mgr.addProf();
				} else if(num2 == 0){
					System.out.println("시스템을 종료합니다.");
					break;
				}
			}else if (num1 == 2){
				System.out.println("------------------------------------------------------");
				System.out.println("1. 학생	2. 교수	0.종료");
				System.out.println("------------------------------------------------------");
				System.out.println("메뉴를 고르세요:");
				int num2 = Integer.parseInt(sc.nextLine());
				
				if(num2 == 1) {
					boolean result = mgr.loginStu();
					if(result){
						System.out.println("------------------------------------------------------");
						System.out.println("1. 개설 과정 조회 	2. 수강신청	3. 수강신청 목록 조회	0.종료");
						System.out.println("------------------------------------------------------");
						System.out.println("메뉴를 고르세요:");
						int num3 = Integer.parseInt(sc.nextLine());
						if(num3 == 1) {
							mgr.allCourseInfo();
						} else if(num3 == 2){
							mgr.reqCourse();
						} else if(num3 == 3){

						} else if (num3 == 0){
							System.out.println("시스템을 종료합니다.");
							break;
						}
					}
					
					

				} else if(num2 == 2){
					boolean result = mgr.loginPro();
					if(result) {
						System.out.println("-------------------------------------------------------------");
						System.out.println("1. 과정등록 	2. 내가 등록한 과정 조회		3. 수강신청 학생 조회	0.종료");
						System.out.println("-------------------------------------------------------------");
						System.out.println("메뉴를 고르세요:");
						int num3 = Integer.parseInt(sc.nextLine());
						
						if(num3 == 1) {
							mgr.addCourse();
						} else if(num3 == 2){
							mgr.addCourseInfo();
						} else if(num3 == 3){

						} else if (num3 == 0){
							System.out.println("시스템을 종료합니다.");
							break;
						}
						
					} 
				

				} else if(num2 == 0){
					System.out.println("시스템을 종료합니다.");
					break;
				}

			}else if (num1 == 0){
				System.out.println("시스템을 종료합니다.");
				break;
			}



		}
	}
}
