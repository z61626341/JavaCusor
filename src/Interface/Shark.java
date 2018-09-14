package Interface;

public class Shark extends Fish {

	public Shark(String name) {
		super(name);
	}
	public String getName() {
		return this.name;
	}

	@Override
	public void swim() {
		System.out.println(name + " Shark Swimming Fast!!!~~~");
	}

}
