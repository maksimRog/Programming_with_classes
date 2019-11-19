package task9;

public class Main {
	/*
	 * 9. Создать класс Book, спецификация которого приведена ниже. Определить
	 * конструкторы, set- и get- методы и метод toString(). Создать второй
	 * класс, агрегирующий массив типа Book, с подходящими конструкторами и
	 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
	 * Book: id, название, автор(ы), издательство, год издания, количество
	 * страниц, цена, тип переплета. Найти и вывести: a) список книг заданного
	 * автора; b) список книг, выпущенных заданным издательством; c) список
	 * книг, выпущенных после заданного года.
	 */
	public static void main(String[] args) {
		Book book1 = new Book("The Abysmal Brute", "Jack London", "The Century Company", 1913, 100, 200, "hardcover");
		Book book2 = new Book("The Game (London novel)", "Jack London", "Macmillan", 1905, 39, 100, "hardcover");
		Book book3 = new Book("The Gift of the Magi", "O. Henry", "The Four Million", 1905, 150, 20, "hardcover");
		Library library = new Library(new Book[] { book1, book2, book3 }, "jeffersonLibrary", "Minsk");
		//library.showBooksByAuthor();
		//library.showBooksByPublisher();
		library.showBooksAfterGivenYear();
		
	}

}
