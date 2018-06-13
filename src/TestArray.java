import java.util.Arrays;
import java.util.Scanner;
public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numStr = {4,112,68,23,54};
		for(int i =0 ; i < 5 ; i++) {
			System.out.print(numStr[i]+"\n");
		}
		Arrays.fill(numStr,3);
		for(int tempInt : numStr) {
			System.out.printf("%s%n",tempInt);
		}
		int[] numStr2 = numStr;
		String s = "";
		System.out.println(numStr2== numStr ? s + "YES": s + "NO");
	}

}
