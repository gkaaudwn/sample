public class ForDemo7{
	public static void main(String[] args) {
		
		// 1~100������ ���� ����ϱ�
		// ��, �հ谡 3000�� �Ѿ�� ������ ���ڸ� �˾Ƴ���
		int total=0;
		int num=0;
		for(int a=1; a<=100; a++) {
			total+=a;
			if(total>=3000){
			num=a;	//a�� �����ȿ��� ������Ƿ� num�� ����
			break;
			
			}
		}
		System.out.println(num);
	}
}