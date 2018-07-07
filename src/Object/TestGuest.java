package Object;

import static java.lang.System.out;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class TestGuest extends TestCase {
	public String testStr;
	public Guest guest;
	@Test
	void test() {
		testSetUp();
		testCall();
	}
	public void testSetUp() {
		guest = new Guest();
	}
	public void testTearDown() {
		guest = null;
	}
	public void testCall() {
		ArrayList names = new ArrayList();
		collectNameTo(names);
		out.println("訪客名單：");
		printUpperCase(names);
	}
	public void collectNameTo(ArrayList names) {
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
	public void printUpperCase(ArrayList names) {
		for (int i = 0; i < names.size(); i++) {
			String name = (String)names.get(i);
			out.print(name.toUpperCase());
			assertEquals(testStr,name.toUpperCase());
		}
	}
}
