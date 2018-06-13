import java.util.Scanner;

public class TestString {
	public static void main(String[] arg) {
		IOSum ioSum = new IOSum();
		//ioSum.IOsum();
		IOArverage ioArverage = new IOArverage();
		ioArverage.IOarverage(arg);
	}
}

class IOSum{
	public long sum = 0;
	public long inputNum = 0;

	@SuppressWarnings("resource")
	public void IOsum() {
		Scanner myScanner = new Scanner(System.in);
		do {
			System.out.printf("請輸入數字 : %n");
			inputNum = Long.parseLong(myScanner.nextLine());
			sum += inputNum;
		}while(inputNum != 0);//為0則停止
		System.out.printf("總和為 : %s%n",sum);
		
	}
}
class IOArverage{
	public long sum = 0;
	public long inputNum = 0;

	@SuppressWarnings("resource")
	public void IOarverage(String[] strarray) {
		Scanner myScanner = new Scanner(System.in);
		for (String string : strarray) {
			sum += Long.parseLong(string);
		}
		System.out.printf("平均為 : %s%n",(float) sum / strarray.length);
		
	}
}