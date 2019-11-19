package task5;

import java.util.Arrays;

public class TravelAgency {
	private String name;
	private Voucher[] vouchers;

	public TravelAgency(String name, Voucher[] vouchers) {
		super();
		this.name = name;
		this.vouchers = vouchers;
	}

	public void sortByPriceAndPrint() {
		Arrays.sort(vouchers);
		for (int i = 0; i < vouchers.length; i++) {
			System.out.println(vouchers[i]);
		}
	}
}
