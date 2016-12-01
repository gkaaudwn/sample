import java.util.Random;
import java.util.Scanner;

public class BaseballMain {
	public static void main(String[] args) {
		
		int nBall        = 0 ; // �� 
		int nStrike      = 0 ;  //��Ʈ����ũ
		int nRepeat      = 10 ;  // �õ�
		int nArrRandom[] = new int[10] ; // ������  0~9
		int nArrOut[]    = new int[3] ; // �̰� ����
		int nArrInput[]  = new int[ 3] ; // �Է¼�
		String  sMsg;
		
		int nTemp        = 0 ;  //
		int nRan         = 0 ;  //
		int i , k , j ;
		
		Random ran = new Random();
		for( i = 0 ; i < 10 ; i++)  // 0 ~ 9 �Է�
			nArrRandom[i]= i;
		
		
		for( k = 0 ; k < 3 ; k++ )
		{			
			nTemp = ran.nextInt(3-k);			
			nRan = nArrRandom[nTemp];  // 10���� k��° ��÷		
			nArrOut[k] = nArrRandom[nRan];   // ��� ����
		
			for ( i = 0 ; i < 3-1 ; i++)
			{
				if( i >= nRan)
					nArrRandom[i] = nArrRandom[i+1];	// ������ �ں��� ��ĭ�� ������ �δ�			
			}
		}
	
//		for( i = 0 ; i < 3 ; i++)
//			System.out.printf(nArrOut[i]+ " ");
		
		System.out.println("������ �����մϴ� (Y / N) : ");
				
		Scanner scan    = new Scanner(System.in);
		String  sStart  = scan.nextLine();
		
		if ( ( sStart.equals("N") )  ||  ( sStart.equals("n") ) )
			return;
		
		for( j = 0 ; j < nRepeat ; j++)
		{
		
		System.out.printf("�� 10ȸ �õ� �� " + j + " ��° �õ�. 3���� ������ �Է��ϼ���  : ");
		sMsg = scan.nextLine();
		String sParse[] = sMsg.split(" ");
		
		nStrike = 0;
		for( i = 0 ; i < 3 ; i++)  // parse + ��Ʈ����ũ üũ
		{
			nArrInput[i] = Integer.parseInt(sParse[i]);
			if( nArrInput[i] == nArrOut[i] )
				nStrike++;			
		}
		nBall = 0;
		for( i = 0 ; i < 3 ; i++ )  // ������ ��
		{
			for( k = 0 ; k < 3 ; k++ )
			{
				if ( nArrInput[i] == nArrOut[k] )
					nBall++;
			}			
		}
		System.out.println("�� :" + nBall + "\t��Ʈ����ũ " + nStrike );
		if ( nBall == 3 && nStrike == 3)
		{
			System.out.println("�����ƿ�" );			
			break;
		}
		}
		if ( nBall != 3 || nStrike != 3)
		System.out.println("10ȸ ��� ����. game over!!!" );
				
	}

}
