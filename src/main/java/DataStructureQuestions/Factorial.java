package DataStructureQuestions;

public class Factorial {
	
	
	static int Factroial(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return n * Factroial(n-1);
		}
	}

	public static void main(String[] args) {
		int result = Factroial(5);
		System.out.println("Factroial of 5 is: " + " " + result);

	}

}
