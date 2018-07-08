package Interface;

public class Human implements Swimmer {
	private String name;
	
	public Human(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	@Override
	public void swim() {
		System.out.println("Human Swimming fastly!!");
	}

}
