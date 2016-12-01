public class Person{

int no;
String name;
String phone;
String department;
String position;
int salary;

public int salarycal(){


return salary*12;

}
public void information(){

System.out.println("사원 번호:"+no);
System.out.println("사원 이름:"+name);
System.out.println("사원 전화번호:"+phone);
System.out.println("사원 부서:"+department);
System.out.println("사원 직위:"+position);
System.out.println("급여:"+salary);

}
}
