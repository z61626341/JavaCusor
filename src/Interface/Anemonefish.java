package Interface;

public class Anemonefish extends Fish {

	public Anemonefish(String name) {
		super(name);
	}
	public String getName() {
		return this.name;
	}

	@Override
	public void swim() {
		System.out.println(name + " Anemonefish Swimming slowly~~~");
	}
	

}
