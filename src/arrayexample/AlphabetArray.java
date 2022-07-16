package arrayexample;

public class AlphabetArray {
	public static void main(String[] args) {
		char[][] alphabet = new char[13][13];
		int a = 97;
		for(int j = 0; j < 2; j++) {
			for(int i = 0; i < 13; i++) {
				alphabet[i][j] = (char)a;
				a++;
				System.out.print(alphabet[i][j] + " ");
			}
			System.out.println();
		}
	}
}
