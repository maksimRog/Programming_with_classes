package task10;

import java.util.Calendar;

public class Main {
	/*
	 * 10. Создать класс Airline, спецификация которого приведена ниже.
	 * Определить конструкторы, set- и get- методы и метод toString(). Создать
	 * второй класс, агрегирующий массив типа Airline, с подходящими
	 * конструкторами и методами. Задать критерии выбора данных и вывести эти
	 * данные на консоль. Airline: пункт назначения, номер рейса, тип самолета,
	 * время вылета, дни недели. Найти и вывести: a) список рейсов для заданного
	 * пункта назначения; b) список рейсов для заданного дня недели; c) список
	 * рейсов для заданного дня недели, время вылета для которых больше
	 * заданного.
	 */
	public static void main(String[] args) {
		Airline airlineMoscow = new Airline("Moscow", 8899, "Jumbo Passenger", "8.40",
				new int[] { Calendar.MONDAY, Calendar.THURSDAY });
		Airline airlineWarsaw = new Airline("Warsaw", 8799, "Mid-Size Passenger", "15.00",
				new int[] { Calendar.THURSDAY, Calendar.FRIDAY });
		Airline airlineBerlin = new Airline("Berlin", 7799, "Mid-Size Passenger", "14.00",
				new int[] { Calendar.WEDNESDAY, Calendar.SUNDAY });
		Airport airport=new Airport("Jefferson airport", new Airline[]{airlineMoscow,airlineWarsaw,airlineBerlin});
	
	//airport.showWithDestination();
	airport.showForDayOfWeek(Calendar.WEDNESDAY);
	airport.showForDayOfWeek(Calendar.THURSDAY);
	airport.showByDayAndTime(Calendar.THURSDAY, 14);

	}

}
