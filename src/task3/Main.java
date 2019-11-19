package task3;

public class Main {
	// 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
	// номер группы, успеваемость (массив из пяти элементов). Создайте массив из
	// десяти элементов такого типа. Добавьте возможность вывода фамилий и
	// номеров групп студентов, имеющих оценки, равные только 9 или 10.
	public static void main(String[] args) {

		Student student1 = new Student("Vasilii", "01022", new int[] { 1, 2, 3, 4, 5 });
		Student student2 = new Student("Genadii", "01033", new int[] { 9, 9, 9, 9, 9 });
		Student student3 = new Student("Anatolii", "01033", new int[] { 9, 10, 9, 9, 9 });
		Student student4 = new Student("Vladimir", "01022", new int[] { 1, 2, 3, 4, 5 });
		Student[] students = { student1, student2, student3, student4 };
		Student.sout(students);
	}

}
