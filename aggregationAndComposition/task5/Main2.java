package task5;

public class Main2 {
	// 5. Туристические путевки. Сформировать набор предложений клиенту по
	// выбору туристической путевки различного типа (отдых, экскурсии, лечение,
	// шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность
	// выбора транспорта, питания и числа дней. Реализовать выбор и сортировку
	// путевок.
	public static void main(String[] args) {
		Voucher voucher1 = new Voucher("excursion", true, false, 1, 100);
		Voucher voucher2 = new Voucher("treatment", true, true, 14, 200);
		Voucher voucher3 = new Voucher("shopping", true, false, 1, 50);
		Voucher voucher4 = new Voucher("cruise", true, true, 28, 1000);

		TravelAgency travelAgency = new TravelAgency("Fresh air",
				new Voucher[] { voucher1, voucher2, voucher3, voucher4 });
		travelAgency.sortByPriceAndPrint();

	}

}
