public class ScoreApp{
	public static void main(String[] args){
		Score s = new Score();
		s.kor=90;
		s.eng=90;
		s.math=80;

		System.out.println("ÃÑÁ¡:"+s.total());
		System.out.println("Æò±Õ:"+s.average());

	}
}
