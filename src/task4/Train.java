package task4;

import java.text.DecimalFormat;

public class Train {
	private String destination;
	private int number;
	private double departureTime;

	public Train(String destination, int number, double departureTime) {
		super();
		this.destination = destination;
		this.number = number;
		this.departureTime = departureTime;
	}

	@Override
	public String toString() {
		return "Train [destination=" + destination + ", number=" + number + ", departureTime=" + new DecimalFormat("#0.00").format(departureTime) + "]";
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(double departureTime) {
		this.departureTime = departureTime;
	}

	public static Train findByNumber(int number, Train trains[]) {
		Train train = null;
		for (int i = 0; i < trains.length; i++) {
			if (number == trains[i].getNumber()) {
				train = trains[i];
			}
		}
		return train;
	}

	public static Train[] sortByNumber(Train[] trains) {
		for (int j = 0; j < trains.length; j++) {
			for (int i = 0; i < trains.length - 1 - j; i++) {
				if (trains[i].getNumber() > trains[i + 1].getNumber()) {
					Train buffer = trains[i];
					trains[i] = trains[i + 1];
					trains[i + 1] = buffer;
				}
			}
		}

		return trains;

	}
	public static Train[] sortByDestination(Train[] trains) {
		for (int j = 0; j < trains.length; j++) {
			for (int i = 0; i < trains.length - 1 - j; i++) {
				if (trains[i].getDestination().trim().charAt(0) > trains[i + 1].getDestination().trim().charAt(0)) {
					Train buffer = trains[i];
					trains[i] = trains[i + 1];
					trains[i + 1] = buffer;
				}else if((trains[i].getDestination()).equals(trains[i+1].getDestination())){
					if(trains[i].getDepartureTime()>trains[i+1].getDepartureTime()){
						Train buffer = trains[i];
						trains[i] = trains[i + 1];
						trains[i + 1] = buffer;
					}
				}
			}
		}

		return trains;

	}
}
