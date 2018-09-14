package Interface;

public class Submarine extends Boat implements Diver {
	
	public Submarine(String name) {
		super(name);
	}
	public void dive() {
		System.out.println(name + " O o 。釋放空氣 ~~潛水中~~");
	}

}
