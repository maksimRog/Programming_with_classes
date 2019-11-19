package task8;

public class Main {
	/*
	 * 8. Создать класс Customer, спецификация которого приведена ниже.
	 * Определить конструкторы, set- и get- методы и метод toString(). Создать
	 * второй класс, агрегирующий массив типа Customer, с подходящими
	 * конструкторами и методами. Задать критерии выбора данных и вывести эти
	 * данные на консоль. Класс Customer: id, фамилия, имя, отчество, адрес,
	 * номер кредитной карточки, номер банковского счета. Найти и вывести: a)
	 * список покупателей в алфавитном порядке; b) список покупателей, у которых
	 * номер кредитной карточки находится в заданном интервале
	 */
	public static void main(String[] args) {
		Customer customers[] = new Customer[3];
		customers[0] = new Customer("Валерий", "vЖмишенко", "Аьбертович", 222, 4345353);
		customers[1] = new Customer("Николай", "aЖмишенко", "Николаевич", 345, 4345353);
		customers[2] = new Customer("Валерий", "bЖмишенко", "Аьбертович", 777, 4345353);
		System.out.println(customers[2].getId());
		Customer.showInInterval(customers, 100, 400);
		Customer.showInAlphabeticalOrder(customers);

	}

}
