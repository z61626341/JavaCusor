package Object;

import static java.lang.System.out;
import java.util.Scanner;

public class Guest {

	public static void main(String[] args) {
		ArrayList names = new ArrayList();
		collectNameTo(names);
		out.println("訪客名單：");
		printUpperCase(names);
	}
	
	static void collectNameTo(ArrayList names) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String name;
		while(true) {
			out.print("請輸入客戶姓名 :\n");
			name = scanner.nextLine();
			if(name.equals("quit")) break;
			names.add(name);
		}
		
	}
	
	static void printUpperCase(ArrayList names) {
		for (int i = 0; i < names.size(); i++) {
			String name = (String)names.get(i);
			out.println(name.toUpperCase());
			
		}
	}

}
