public class  maxNumber {

	int num[] = new int[3];
	public int maxNum () {
		//int num[] = new int[3];
		int result=0;
		for (int i=0; i< num.length; i++) {
			
			if (result < num[i]) {
				result = num[i];
			} 
			//System.out.println("가장큰수:"+result);
		}
	return result;
	}
}

