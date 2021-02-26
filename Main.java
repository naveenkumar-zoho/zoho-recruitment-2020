import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int middle = (str.length() / 2) + 1;

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length() - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				if (j < middle)
					System.out.print(str.charAt(middle - 1 + j));
				else
					System.out.print(str.charAt(j - middle));
			}
			System.out.println();
		}
	}
}
