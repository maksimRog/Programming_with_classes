package task2;

public class Car {
	private String carBrand;
	private Wheel wheel;
	private Engine engine;

	public void ride() {
		System.out.println("We're riding!");
	}

	public void getGus() {
		System.out.println("We're getting gus!");
	}

	public void changeWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public void showBrand() {
		System.out.println((carBrand));
	}

	@Override
	public String toString() {
		return "Car [carBrand=" + carBrand + ", wheel=" + wheel + ", engine=" + engine + "]";
	}

	public Car(String carBrand, Wheel wheel, Engine engine) {
		super();
		this.carBrand = carBrand;
		this.wheel = wheel;
		this.engine = engine;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
