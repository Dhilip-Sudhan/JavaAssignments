package assignmentweek1Day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String text = "I am a software tester";
		String[] words = text.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (i%2 != 0)
			{
				char[] charct = words[i].toCharArray();
				for (int j = charct.length-1; j >=0; j--) {
					System.out.print(charct[j]);	
				}
				System.out.print(" ");
			}
			else
			{
				System.out.print(words[i] + " ");
			}
		}
				
	}
}
