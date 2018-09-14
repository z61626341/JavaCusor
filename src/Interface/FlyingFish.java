package Interface;

public class FlyingFish extends Fish implements Flyer{
	
	public FlyingFish(String name) {
		super(name);
	}

	
	public void fly() {
		System.out.println(name + " 飛魚游泳");
	}
	
	public void swim() {
		System.out.println(name + " 飛魚會飛");
	}

}
