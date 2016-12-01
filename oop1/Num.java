public class  Num {

	int num[] = new int[3];
	int answer;
	boolean result;
	public boolean numbers () {
		for (int i=0; i< num.length; i++) {
			if (num[i]==answer) {
					result = true;
					break;
				} else {
					result = false;
				}
		}
	return result;
	}
}
