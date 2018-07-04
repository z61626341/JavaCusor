
public class UsingThisAndFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Other(168);
	}

}

class Other{
	
	{System.out.println("Default 物件初始區塊");}
	
	Other(){
		System.out.println("Constractor Other()");
	}
	Other(int i){
		this();
		System.out.println("Constractor Other(int i)");
	}
}
class Something{
	final int numSet = 0;
	final int numNull;
	//宣告為final之Parameter，在程式中不能再對該Parameter有設值的動作。
	Something(int i){
		this.numNull = i;//final若沒有預設值，則必須由Constractor指定值，否則會報錯誤(variable numNull might not have been initialized)。	
	}
	Something() {
		//預設Constractor建構元，自身並沒有為numNull指定預設值，但可以運用該Class之其他Constractor來指定值給numNull。
		
		this(168);
	}
	public void test(int i){
		//this.numNull = i;
		//因違反Final特性規則，所以會報錯誤(The final field Something.numNull cannot be assigned)。
	}
}