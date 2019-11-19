package task1;

public class Main {
	// 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран
	// и методы изменения этих переменных. Добавьте метод, который находит сумму
	// значений этих переменных, и метод, который находит наибольшее значение из
	// этих двух переменных.

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.setA(3);
		test1.setB(4);
		System.out.println(test1.countSum());
	}

}
