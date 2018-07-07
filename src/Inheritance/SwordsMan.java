package Inheritance;

public class SwordsMan extends Role {
	//因為父類別為abstract class，所以必須實作父類別之抽象方法
	public void fight() {
		System.out.println("揮劍攻擊!!!!");
	}
	public String toString() {
		return String.format("劍士: %s",super.toString());
	}
	//JDK >= 5 起，多型可以回傳與父類別不同的返回型態
	public SwordsMan getClassNum() {
		return new SwordsMan();
	}
	//不屬於多型，static屬於Class所擁有，不為Object所有，所以此方法上的定義為，專屬於當前Class，不是父類別的多型
	static public void staticMethod() {
		System.out.println("Method of SwordsMan");
	}
	
}
