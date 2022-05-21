package DataStructureQuestions;

public class palindromeString {
	
	static boolean Palindrome(String str) {

		int i = 0;
		int j = str.length()-1;
		while(i!=j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			} 
			i++;
			j--;
		}	
		
		return true;
	}

	public static void main(String[] args) {
		boolean result = Palindrome("madam");
		System.out.println(result);
		System.out.println("madam".length());

	}

}
