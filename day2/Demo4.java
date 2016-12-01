public class Demo4 {
	public static void main(String[] args) {
		// 문자 타입 - char 한 글자를저장하는 자료형

		char c1 = 'A';
		char c2 = 65;	//0041 = 0*16^3 + 0*16^2 + 4*16^1 + 1*16^0 = 65
		char c3 = '\u0041';

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		//char c4 = 'AB'; // 요류 (글자 두개를 저장할 수없다.)
	}
}