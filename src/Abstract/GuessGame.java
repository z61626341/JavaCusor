package Abstract;

import java.util.Scanner;

public abstract class GuessGame {
	static public void main(String[] args) {
		new ConsoleGuessGame().go();
	}

	public void go() {
		while(true) {
			
			int ansNum = (int)(Math.random()*10);
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("歡迎來到猜數字，請輸入數字  : ");
			
			if(guess() == ansNum) {
				print("Win.");
				break;
			}else
				print("Lose.");
		}
	}
	public abstract void print(String guess);
	public abstract int guess();
}
