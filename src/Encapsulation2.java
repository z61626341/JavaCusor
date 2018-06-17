import java.util.Scanner;

public class Encapsulation2 {
//儲值卡封裝練習(method封裝)
//1.儲值滿千送1點紅利點數
//2.扣款金額小於餘額，通知使用者餘額不足
//3.兌換紅利點數
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CashCard2[] cc2 = {
				new CashCard2("Jimmy",4260,15),
				new CashCard2("Jax",-500,3),
				new CashCard2("Andy",-0,0)
		};
		Scanner sc = new Scanner(System.in);
		for (CashCard2 cashCard2 : cc2) {
			System.out.println("CashCard 使用者 : " + cashCard2.getNumber() + " , 餘額 : " + cashCard2.getBalance() + " , 剩餘紅利 : " + cashCard2.getBonus());
			cashCard2.store(sc.nextInt());
			System.out.println("此次異動者 : " + cashCard2.getNumber() + " , 餘額 : " + cashCard2.getBalance() + " , 剩餘紅利 : " + cashCard2.getBonus() + "\n");
			
		}
	}

}
class CashCard2{

	private String number;
	private int balance;
	private int bonus;
	
	CashCard2(String number,int balance,int bonus){
		this.number = number;
		this.balance = balance;
		this.bonus = bonus;
	}
	//儲值
	void store(int money) {
		if(money > 0) {
			this.balance += money;
			if(money > 1000) {
				this.bonus += money / 1000;
			}
		}else if(money == 0) {
			System.out.println("無效輸入，請重新輸入金額。");
		}else {
			System.out.println("儲值金額不可小於0 !!!! (你是駭客齁>''<)");
		}
	}
	//扣款
	void charge(int money) {
		if(money > 0) {
			if(balance - money >= 0) {
				this.balance -= money;
			}else {
				System.out.println("餘額不足，請自行加值。");
			}
		}else if(money == 0){
			System.out.println("無效輸入，請重新輸入金額。");
		}else {
			System.out.println("判定您為駭客，請自行向警方自首!! 感謝您^^");
		}
	}
	//紅利兌換
	int exchange(int bonus) {
		if(bonus > 0) {
			if(this.bonus - bonus >= 0) {
				this.bonus -= bonus;
			}
		}else if(bonus == 0) {
			System.out.println("無效輸入，請重新輸入紅利點數。");
		}else {
			System.out.println("您好，已判定為非法使用，已通報檢調單位。\n5分鐘內會有警方到場。\n並且此卡片將於59秒後爆炸 感謝您^^");
		}
		return this.bonus;
	}
	public int getBalance() {
		return balance;
	}
	public String getNumber() {
		return number;
	}
	public int getBonus() {
		return bonus;
	}
	
}