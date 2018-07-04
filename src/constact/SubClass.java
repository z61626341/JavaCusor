package constact;

public class SubClass extends MainClass {
	SubClass(){
		super(123);//Default constructor就算不設置，也會預設呼叫super()
		System.out.println("Constract of SubClass");
	}
	static public void main(String[] arg) {
		new SubClass();
	}
}
