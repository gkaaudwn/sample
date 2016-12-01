public class PersonApp{
	public static void main(String[] args){

Person p=new Person();

int a;
p.no=2;
p.name="이동민";
p.phone="010-2475-3514";
p.department="소프트웨어팀";
p.position="사원";
p.salary=2800;

	a=p.salarycal();
	System.out.println(a);
	p.information();

	}
}
