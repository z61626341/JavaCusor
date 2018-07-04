
public class Modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OtherClass oC = new OtherClass();
		
		oC.publicNum = 999;
		
		//System.out.println("privateNum:" + oC.privateNum);
		//屬於checked Exception，未編譯就會抱錯，
		//原因出在privateNum屬於Private 在其他Class以外皆無法直接存取
		
		System.out.println("publicNum:" + oC.publicNum);
		
	}

}
class OtherClass{
	private int privateNum = 20;
	public int publicNum = 100;
	
}
