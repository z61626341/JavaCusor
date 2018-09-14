package Interview;

public class ErrorTest {
	static int test = 0;
	public static void main(String[] args) {
		System.out.println(factorial(6));
	}

	public static int factorial(int value) {
		test ++;
		if(value == 1) {
			return value;
		}else {
			return value * factorial(value - 1);
		}
	}
}
