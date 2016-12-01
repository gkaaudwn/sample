public class ScoreApp1 {
	public static void main(String[] args) {
		Score s = new Score();

		s.name = "È«±æµ¿";
		s.kor = 30;
		s.eng = 50;
		s.math = 60;

		int result1 = s.total();
		double result2 = s.average();

		System.out.println(s.name);
		System.out.println("ÃÑÁ¡:"+result1);
		System.out.println("Æò±Õ:"+result2);
	}
}