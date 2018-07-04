package inheritance;

public class Magician extends Role  {
	
	@Override//檢查下列method是否繼承父類別
	public void fight() {
		System.out.println("魔法攻擊!!!!!");
	}
    public void cure() {
        System.out.println("魔法治療~~");
    }
	public String toString() {
		return String.format("魔術師: %s",super.toString());
	}

	//JDK >= 5 起，多型可以回傳與父類別不同的返回型態
	public Magician getClassNum() {
		return new Magician();
	}
	//不屬於多型，static屬於Class所擁有，不為Object所有，所以此方法上的定義為，專屬於當前Class，不是父類別的多型
	static public void staticMethod() {
		System.out.println("Method of Magician");
	}
}
