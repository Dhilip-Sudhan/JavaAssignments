package assignmentweek1Day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String input = "changeme";
		char[] charact = input.toCharArray();
		
		for (int i = 0; i < charact.length; i++) {
			if (i%2 == 0)
			{
				System.out.println(charact[i]);
			}
			else
			{
				System.out.println("The Character in Upper Case : " +Character.toUpperCase(charact[i]));
				
			}
		}
	}
}
				