package task4;

public class Main2 {
	// 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать
	// возможность блокировки/разблокировки счета. Реализовать поиск и
	// сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
	// всем счетам, имеющим положительный и отрицательный балансы отдельно.
	public static void main(String[] args) {
		Client client1 = new Client("Мясников В.А.",
				new Account[] { new Account(9999, 500, false), new Account(2444, -500, true) });
		Client client2 = new Client("Мартыненко В.А.", new Account[] { new Account(3333, -333, false),
				new Account(7777, -687, false), new Account(3445, 687, false), new Account(5555, 1000, false) });
		Bank bank = new Bank("National bank of America", new Client[] { client1, client2 });
		// Поиск счета по номеру
		System.out.println(bank.findAccount(9999));
		// Возращает счета отсортированные по номеру по возрастанию
		System.out.println(bank.getAllAccounts(bank));
		System.out.println("Общая сумма на счетах: " + Bank.countTotalAmount(client2));
		System.out.println("Сумма по счетам с отрицательным балансом: " + Bank.countNegativeAmount(client2));
		System.out.println("Сумма по счетам с положительным балансом: " + Bank.countPositiveAmount(client2));

	}

}
