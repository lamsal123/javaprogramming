package Javalevel1;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Welcome to the Java Programming";
		char[] characters = word.toCharArray();
		for (int i = 0; i < characters.length; i++) {
			char c = characters[i];

			for (int j = i + 1; j < characters.length; j++) {
				if (characters[j] == c) {
					characters[j] = '@';

				}
				String newValue = String.valueOf(characters);
				System.out.println(newValue);
				System.out.println(word);

				newValue = newValue.replace("@", " ");
				System.out.println(newValue);
			}
		}
	}
}