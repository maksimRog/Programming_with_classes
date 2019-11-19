package task5;

public class Voucher implements Comparable<Voucher> {
	private String typeOf;
	private boolean isTransportIncluded;
	private boolean isMealIncluded;
	private int numberOfdays;
	private int price;

	public String getTypeOf() {
		return typeOf;
	}

	public void setTypeOf(String typeOf) {
		this.typeOf = typeOf;
	}

	public boolean isTransportIncluded() {
		return isTransportIncluded;
	}

	public void setTransportIncluded(boolean isTransportIncluded) {
		this.isTransportIncluded = isTransportIncluded;
	}

	public boolean isMealIncluded() {
		return isMealIncluded;
	}

	public void setMealIncluded(boolean isMealIncluded) {
		this.isMealIncluded = isMealIncluded;
	}

	public int getNumberOfdays() {
		return numberOfdays;
	}

	public void setNumberOfdays(int numberOfdays) {
		this.numberOfdays = numberOfdays;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Тип путевки: " + typeOf + ", Цена: " + price + ", Кол-во дней: " + numberOfdays;
	}

	public Voucher(String typeOf, boolean isTransportIncluded, boolean isMealIncluded, int numberOfdays, int price) {
		super();
		this.typeOf = typeOf;
		this.isTransportIncluded = isTransportIncluded;
		this.isMealIncluded = isMealIncluded;
		this.numberOfdays = numberOfdays;
		this.price = price;
	}

	@Override
	public int compareTo(Voucher voucher) {
		if (this.getPrice() > voucher.getPrice()) {
			return 1;

		} else if (this.getPrice() < voucher.getPrice()) {
			return -1;

		} else
			return 0;
	}

}
