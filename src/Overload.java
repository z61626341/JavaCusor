
public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Some s = new Some();

		s.someMethod(168);
		s.someMethod(new Integer(999));
	}

}
class Some {
	void someMethod(int num) {
		System.out.println("Call Method with an int Parameter");
	}
	void someMethod(Integer num) {
		System.out.println("Call Method with an Integer Parameter");
	}
	void someMethod(int... num) {//因為Overload匹配之順序規則，較為後面，所以此範例並不會執行此Method
		System.out.println("Call Method with an int... Parameter");
	}
	
	
	/*Overload重載順序
	 * 尋找未封裝前，引數個數與型態相同的Method
	 * 尋找封裝後，引數個數與型態相同的Method
	 * 嘗試找尋動態引數個數與型態相同的Method
	 * 以上皆找不到，則報編譯錯誤
	*/
}
