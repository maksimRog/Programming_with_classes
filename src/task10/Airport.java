package task10;

import java.util.Calendar;
import java.util.Scanner;

public class Airport {
	private String name;
	private Airline[] airlines;

	public Airport(String name, Airline[] airlines) {
		super();
		this.name = name;
		this.airlines = airlines;
	}

	public void showForDayOfWeek(int dayOfWeek) {
		if (dayOfWeek > 7 || dayOfWeek < 1) {
			return;
		}
		System.out.println();

		System.out.println("Рейсы для дня недели:");
		for (int i = 0; i < airlines.length; i++) {
			int daysOfweek[] = airlines[i].getDaysOfWeek();
			for (int j = 0; j < daysOfweek.length; j++) {
				if (daysOfweek[j] == dayOfWeek) {
					System.out.println(airlines[i]);
					break;
				}

			}
		}
	}

	public void showByDayAndTime(int dayOfWeek, double givenTime) {
		if (dayOfWeek > 7 || dayOfWeek < 1) {
			return;
		}
		System.out.println();

		System.out.println("Рейсы для дня недели и больше заданного времени :");

		for (int i = 0; i < airlines.length; i++) {
			int daysOfweek[] = airlines[i].getDaysOfWeek();
			for (int j = 0; j < daysOfweek.length; j++) {
				if (daysOfweek[j] == dayOfWeek && Double.parseDouble(airlines[i].getDepartureTime()) > givenTime) {
					System.out.println(airlines[i]);
					break;
				}

			}
		}
	}

	public void showWithDestination() {
		System.out.println("Write number of Destination...");
		for (int i = 0; i < airlines.length; i++) {
			System.out.println(i + ". " + airlines[i].getDestination());
		}
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {

			int id = sc.nextInt();

			if (id < 0 || id >= airlines.length) {
				System.out.println("Wrong value!");
			} else {
				String dest = airlines[id].getDestination();
				for (int i = 0; i < airlines.length; i++) {
					if (airlines[i].getDestination().equals(dest)) {
						System.out.println(airlines[i]);
					}

				}
			}

		}
		sc.close();

	}
}
