public class Homework1{

public static int max(int[]numbers){
	int maxNumber = 0;
	for(int num:numbers){
		if(num>maxNumber){
			maxNumber = num;
		}
	}
	return maxNumber;
}
public static boolean contains(int[] numbers,int num){
	boolean isExist = false;
	for(int i=0;i<numbers.length;i++){
if(num==numbers[i]){
isExist=true;
}
	}
	return isExist;

}

public static void main(String[] args){
		int [] arr1 = {1,4,2,56,7,23,9};
		int maxValue1 = max(arr1);
		System.out.println("최대값:"+maxValue1);

	boolean exist = contains(arr1,9); 
	System.out.println("포함하고 있나?"+exist);

}		
}
	