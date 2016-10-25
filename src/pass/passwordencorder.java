package pass;

import java.util.Scanner;

public class passwordencorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static String aa()
	{
		Scanner s1 = new Scanner(System.in);
		String word = null;
		word = s1.next();
		word = word.replace("a", "4");
		word = word.replace("A", "4");
		word = word.replace("E", "3");
		word = word.replace("e", "3");
		word = word.replace("I", "1");
		word = word.replace("i", "1");
		word = word.replace("o", "0");
		word = word.replace("O", "0");
		word = word.replace("T", "7");
		word = word.replace("t", "7");
		return word;
		

		
	}
}
