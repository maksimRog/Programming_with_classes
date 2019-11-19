package task6;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;

	public Time(int hours, int minutes, int seconds) {
		super();
		if (hours < 0 || hours > 23) {
			this.hours = 0;
		} else {
			this.hours = hours;
		}
		if (minutes < 0 || minutes > 59) {
			this.minutes = 0;
		} else {
			this.minutes = minutes;
		}
		if (seconds < 0 || seconds > 59) {
			this.seconds = 0;
		} else {
			this.seconds = seconds;
		}
	}

	@Override
	public String toString() {
		return "Время: " + hours + ":" + minutes + ":" + seconds;
	}

	public void changeHours(int hours) {
		this.hours = this.hours + hours;

	}
	public void changeMinutes(int minutes) {
		this.minutes = this.minutes + minutes;

	}
	public void changeSeconds(int seconds) {
		this.seconds = this.seconds + seconds;

	}

}
