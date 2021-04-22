package assignmentweek1Day2;

public class ToRemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] words = text.split(" ");
		int count = 0;
		
		for (int i = 0; i < words.length; i++) {
			for (int j = i+1; j < words.length; j++) {
				if (words[i].equals(words[j]))
				{
					words[j] = "";
				}
			}
			System.out.print(words[i] + " ");
		}
	}
}
				
