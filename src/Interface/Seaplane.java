package Interface;

public class Seaplane extends Airplane implements Swimmer{
	
	public Seaplane(String name) {
		super(name);
	}
	public void  fly() {
		System.out.printf("%s 海上\n",name);
		super.fly();
	}
	public void swim() {
		System.out.printf("海上飛機 %s 航行海面%n",name);
		
	}
}
