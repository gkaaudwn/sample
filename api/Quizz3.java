public class Quizz3 {

	public static void main(String[] args) {
		String text = "The string tokenizer class allows an application to break a string into tokens. The tokenization method is much simpler than the one used by the StreamTokenizer class. The StringTokenizer methods do not distinguish among identifiers, numbers, and quoted strings, nor do they recognize and skip comments.";
		String text1 = text.toLowerCase();

	
		int[] arr = new int[26];

		for(int i=0; i<text1.length(); i++) {
			int ch = text1.charAt(i)-97;
			// System.out.println(ch);
			if(ch>=0) {
				arr[ch]++;
			}
		}

		// System.out.println(java.util.Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) {
			System.out.println((char) (i+97) +": "+ arr[i]);
		}
	}
}