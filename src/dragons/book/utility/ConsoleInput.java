package dragons.book.utility;

import java.util.Scanner;

// we will Inhherit this class later.
public class ConsoleInput {

	// Hint: to get input we need Scanner
	private Scanner scanner;

	public ConsoleInput() {

	}

	// Create a mehtod to return a String input.
	public String getStringInput(String message) {
		ConsoleOutput.info(message);
		String input = scanner.next();
		return input;

	}

	// Creat a method to retrun int input
	public int getIntInput(String message) {
		ConsoleOutput.info(message);
		int input = scanner.nextInt();
		return input;

	}

	public void closeScanner() {
		if (this.scanner != null) {
			scanner.close();
		}
	}
}