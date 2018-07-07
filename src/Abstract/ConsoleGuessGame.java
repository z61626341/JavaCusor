package Abstract;

import java.util.Scanner;

public class ConsoleGuessGame extends GuessGame {
	
	@SuppressWarnings("resource")
	@Override
	public int guess() {
		return new Scanner(System.in).nextInt();
	}
	@Override
	public void print(String guess) {
		System.out.println(guess);
		
	}

}
