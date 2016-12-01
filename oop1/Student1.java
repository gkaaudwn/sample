import java.text.DecimalFormat;

public class Student1
	{
private int no;
private String name;
private int kor;
private int eng;
private int math;


	public void setNo(int no){
		this.no=no;
	}
	public int getNo(){
		return no;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setKor(int kor){
		this.kor=kor;
	}
	public int getKor(){
		return kor;
	}
	public void setEng(int eng){
		this.eng=eng;
	}
	public int getEng(){
		return eng;
	}
	public void setMath(int math){
		this.math=math;
	}
	public int getMath(){
		return math;
	}
	public int getSum(){

		return (kor+eng+math);
	}
	public double getAvg(){
		return (double)(kor+eng+math)/3.0;
	}
	
	public String getAverageForRound(){
		DecimalFormat df = new DecimalFormat("##.00");//<- 소수점 두자리만 나타내달라는 의미
		return df.format(getAvg());
	}
}
