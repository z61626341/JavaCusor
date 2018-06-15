public class Encapsulation {
	public static void main(String[] arg) {
		CashCard cc = new CashCard("4100",1,9);
		System.out.println(cc.number + "		" + cc.balance + "		" + cc.bonus);

//		CashCard[] ccArg = {
//				new CashCard("4101",15,19),
//				new CashCard("4101",25,29),
//				new CashCard("4102",35,39),
//				new CashCard("4103",45,49)
//						   };
		CashCard[] ccArg = new CashCard[5];
		for (int i = 0; i < ccArg.length; i++) {
			ccArg[i] = new CashCard("4101",15 + i ,19 + i );
			System.out.println(ccArg[i].number + "		" + ccArg[i].balance + "		" + ccArg[i].bonus);	
		}
	}
}
class CashCard{
	String number;
	int balance;
	int bonus;
	CashCard(String num,int bal,int bon){
		this.number = num;
		this.balance = bal;
		this.bonus = bon;
				
	}
}