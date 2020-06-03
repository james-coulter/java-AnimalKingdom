package animalkingdom;

public class Mammals extends Animal {

	public Mammals(String name, int yearDiscovered) {
		super(name, yearDiscovered);
	}

	@Override
	public String move() {
		return "Walk";
	}

	@Override
	public String breathe() {
		return "Lungs";
	}

	@Override
	public String reproduce() {
		return "Live Birth";
	}
}