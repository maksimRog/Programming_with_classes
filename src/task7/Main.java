package task7;

public class Main {
	// 7. Описать класс, представляющий треугольник. Предусмотреть методы для
	// создания объектов, вычисления площади, периметра и точки пересечения
	// медиан.
	public static void main(String[] args) {
		Triangle triangle = new Triangle(new Dot(0, 0), new Dot(10, 10), new Dot(5, 0));
		System.out.println("Периметр:" + triangle.countPerimeter());
		System.out.println("Площадь:" + triangle.countSquare());
		System.out.println("Точка пересеченияя медиан: " + triangle.findMedianDot());

	}

}
