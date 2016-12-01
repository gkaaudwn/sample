/*
score.txt ������ �о ���������� �о ȭ�鿡 ����ϴ� ���α׷�
	1. �л������� ��� Student Ŭ���� �����ϱ�
	2. StudentApp �����ϱ�
		- FileReader�� BufferedReader�� ����ؼ� ������ ���� �о����
		- �о�� ������ ,�� �������� �ڸ���
		- �߶� ������ Student��ü�� �����ؼ� �����ϱ�
		(������ ���ڷ� ��ȯ�ϱ�: int Integer.parseInt(����))
		- student��ü�� ����� ������ ȭ�鿡 ǥ���ϱ�
*/

import java.io.*;

public class StudentApp {
	public static void main (String[] args) throws Exception {

		Student stu = new Student();
		BufferedReader reader = new BufferedReader(new FileReader("Score.txt"));	// ������ �ֳ�
		String text = reader.readLine();											// ������ 0��° ���� �о�ͼ� text�� �־��
		//System.out.println("����: "+ text);
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