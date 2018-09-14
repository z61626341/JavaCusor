package Interface;

public class Ocean {
	public static void main(String[] arg) {
		doSwim(new Anemonefish("尼莫"));
		doSwim(new Shark("蘭尼"));
		doSwim(new Submarine("黃色一號"));
        doSwim(new Seaplane("空軍零號"));
        doSwim(new FlyingFish("甚平"));
        doFly(new FlyingFish("甚平"));
        doFly(new Seaplane("空軍零號"));
        doDive(new Submarine("黃色一號"));
	}
	static void doSwim(Swimmer swimmer) {
		swimmer.swim();
	}
	static void doFly(Flyer flyer) {
		flyer.fly();
	}
	static void doDive(Diver diver) {
		diver.dive();
	}
}
