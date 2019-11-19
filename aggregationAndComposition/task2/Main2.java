package task2;

public class Main2 {
	// 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
	// Методы: ехать, заправляться, менять колесо, вывести на консоль марку
	// автомобиля.
	public static void main(String[] args) {
		Car car = new Car("Reno", new Wheel("Fast"), new Engine("INLINE", 300));
		car.ride();
		car.changeWheel(new Wheel("Slow"));
		car.showBrand();
		System.out.println(car.toString());
	}

}
