package task5;

public class Main {
	// 5. Опишите класс, реализующий десятичный счетчик, который может
	// увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
	// Предусмотрите инициализацию счетчика значениями по умолчанию и
	// произвольными значениями. Счетчик имеет методы увеличения и уменьшения
	// состояния, и метод позволяющее получить его текущее состояние. Написать
	// код, демонстрирующий все возможности класса.
	public static void main(String[] args) {
		Counter counter = new Counter();
		System.out.println(counter.getCurrentValue());
		Counter.decreaseCounter(counter);
		for (int i = 0; i < 11; i++) {
			Counter.increaseCounter(counter);
			System.out.println(counter.getCurrentValue());
		}
		Counter customCounter = new Counter(20, 50, 30);
		System.out.println(customCounter);
	}

}
