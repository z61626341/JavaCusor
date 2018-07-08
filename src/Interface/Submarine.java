package Interface;

public class Submarine implements Swimmer {
	private String name;
	
	public Submarine(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	@Override
	public void swim() {
		System.out.println("Submarine Swimming incredible!!!");
	}

}
