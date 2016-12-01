/*
score.txt 파일을 읽어서 성적정보를 읽어서 화면에 출력하는 프로그램
	1. 학생정보를 담는 Student 클래스 정의하기
	2. StudentApp 정의하기
		- FileReader와 BufferedReader를 사용해서 파일의 내용 읽어오기
		- 읽어온 내용을 ,를 기준으로 자르기
		- 잘라낸 내용을 Student객체를 생성해서 저장하기
		(점수는 숫자로 변환하기: int Integer.parseInt(글자))
		- student객체에 저장된 내용을 화면에 표시하기
*/

import java.io.*;

public class StudentApp {
	public static void main (String[] args) throws Exception {

		Student stu = new Student();
		BufferedReader reader = new BufferedReader(new FileReader("Score.txt"));	// 파일이 있냐
		String text = reader.readLine();											// 파일의 0번째 줄을 읽어와서 text에 넣어라
		//System.out.println("내용: "+ text);
		String[] arr = text.split(",");

		//System.out.println(arr[0]);
		//System.out.println(arr[1]);
		//System.out.println(arr[2]);
		//System.out.println(arr[3]);
		//System.out.println(arr[4]);

		//int Integer.parseInt(arr[2]);
		//int Integer.parseInt(arr[3]);
		//int Integer.parseInt(arr[4]);
		stu.setName(arr[0]);
		stu.setGrade(arr[1]);
		stu.setKor(Integer.parseInt(arr[2]));
		stu.setEng(Integer.parseInt(arr[3]));
		stu.setMath(Integer.parseInt(arr[4]));

		System.out.println(stu.getName());
		System.out.println(stu.getGrade());
		System.out.println(stu.getKor());
		System.out.println(stu.getEng());
		System.out.println(stu.getMath());


	}
}