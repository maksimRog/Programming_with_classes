package task5;

public class Counter {
	private int minValue;
	private int maxValue;
	private int currentValue;

	public Counter(int minValue, int maxValue, int currentValue) {
		super();
		this.minValue = minValue;
		this.maxValue = maxValue;
		this.currentValue = currentValue;
	}

	@Override
	public String toString() {
		return "Нижняя граница: "+minValue
				+"\nТекущее значение: "+currentValue
				+"\nВерхняя граница: "+maxValue;
	}

	public Counter() {
		super();
		this.minValue = 0;
		this.maxValue = 10;
		this.currentValue = 0;
	}

	public int getMinValue() {
		return minValue;
	}

	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public int getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}

	public static void decreaseCounter(Counter counter) {
		if (counter.getCurrentValue() == counter.getMinValue()) {
			System.out.println("Счетчик достиг минимального значения и не может быть уменьшен.");

		} else {
			counter.setCurrentValue(counter.getCurrentValue() - 1);
		}
	}

	public static void increaseCounter(Counter counter) {
		if (counter.getCurrentValue() == counter.getMaxValue()) {
			System.out.println("Счетчик достиг максимального значения и не может быть увеличен.");

		} else {
			counter.setCurrentValue(counter.getCurrentValue() + 1);
		}
	}

}
