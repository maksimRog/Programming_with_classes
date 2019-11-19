package task3;

public class Main2 {
	// 3. Создать объект класса Государство, используя классы Область, Район,
	// Город. Методы: вывести на консоль столицу, количество областей, площадь,
	// областные центры.
	public static void main(String[] args) {
		City minsk = new City("Minsk", 2000000);
		Region minskii = new Region("Minskii", minsk);
		Region brestskii = new Region("Brestskii", new City("Brest", 1000000));
		Region gomelskii = new Region("Gomelskii", new City("Gomel", 800000));
		State belarus = new State("Belarus", minsk,
				new District[] { new District("Pyhovichskii"), new District("Bobryiskii"), new District("Jlobinskii") },
				new Region[] { minskii, gomelskii, brestskii });
		belarus.showCapital();
		belarus.countRegions();
		belarus.showRegionCenters();
	}

}
