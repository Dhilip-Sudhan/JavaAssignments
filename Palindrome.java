package assignmentweek1Day2;

public class Palindrome {

	public static void main(String[] args) {
		String val1 = "madam";
		char[] charact = val1.toCharArray();
		String rev = "";
		
		for (int i = val1.length()-1; i>=0; i--) {
			rev = rev + charact[i];
			if (val1.equals(rev))
			{
				System.out.println("The entered string is Palindrome");
			}
			else
			{
				System.out.println("The entered string is not Palindrome");
			}
		}
			
	}

}

