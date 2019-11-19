package task9;

import java.util.Scanner;

public class Library {
	private Book[] books;
	private String name;
	private String adress;

	public Library(Book[] books, String name, String adress) {
		super();
		this.books = books;
		this.name = name;
		this.adress = adress;
	}

	public void showBooksAfterGivenYear() {
		System.out.println("Write year...");
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {

			int year = sc.nextInt();
			for (int i = 0; i < books.length; i++) {
				if(books[i].getYear()>year){
					System.out.println(books[i]);
				}
			}
			
			

		}
		sc.close();

	}

	public void showBooksByPublisher() {
		System.out.println("Write number of Publisher...");
		for (int i = 0; i < books.length; i++) {
			System.out.println(i + ". " + books[i].getPublisher());
		}
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {

			int id = sc.nextInt();

			if (id < 0 || id >= books.length) {
				System.out.println("Wrong value!");
			} else {
				String publisher = books[id].getPublisher();
				for (int i = 0; i < books.length; i++) {
					if (books[i].getPublisher().equals(publisher)) {
						System.out.println(books[i]);
					}

				}
			}

		}
		sc.close();

	}

	public void showBooksByAuthor() {
		System.out.println("Write number of author...");
		for (int i = 0; i < books.length; i++) {
			System.out.println(i + ". " + books[i].getAuthor());
		}
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {

			int id = sc.nextInt();

			if (id < 0 || id >= books.length) {
				System.out.println("Wrong value!");
			} else {
				String author = books[id].getAuthor();
				for (int i = 0; i < books.length; i++) {
					if (books[i].getAuthor().equals(author)) {
						System.out.println(books[i]);
					}

				}
			}

		}
		sc.close();

	}

}
