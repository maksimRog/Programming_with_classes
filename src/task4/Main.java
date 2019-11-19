package task4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	// 4. Создайте класс Train, содержащий поля: название пункта назначения,
	// номер поезда, время отправления. Создайте данные в массив из пяти
	// элементов типа Train, добавьте возможность сортировки элементов массива
	// по номерам поездов. Добавьте возможность вывода информации о поезде,
	// номер которого введен пользователем. Добавьте возможность сортировки
	// массив по пункту назначения, причем поезда с одинаковыми пунктами
	// назначения должны быть упорядочены по времени отправления.
	public static void main(String[] args) {
		Train trains[] = new Train[5];
		trains[4] = new Train("Brest", 8758, 8.30);
		trains[1] = new Train("Gomel", 8734, 5.30);
		trains[2] = new Train("Berlin", 5734, 6.41);
		trains[3] = new Train("Berlin", 4734, 5.30);
		trains[0] = new Train("Warsaw", 3555, 5.30);
		System.out.println(Arrays.toString(trains));

		// Train.sortByNumber(trains);
		// System.out.println(Arrays.toString(trains));
		Train.sortByDestination(trains);
		System.out.println(Arrays.toString(trains));

		System.out.println("Введите номер поезда...");
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int number = Integer.parseInt(sc.nextLine());
			Train train = Train.findByNumber(number, trains);
			if (train == null) {
				System.out.println("Поезда с таким номером не существует.");
			} else {
				System.out.println(train.toString());

			}
		}

	}

}
