package task9;

public class Book {
	private static int counter=0;
private int id;
private String name;
private String author;
private String publisher;
private int year;
private int numberOfPages;
private int price;
private String typeOfCover;


public Book( String name, String author, String publisher, int year, int numberOfPages, int price,
		String typeOfCover) {
	super();
	counter++;
	this.id = counter;
	this.name = name;
	this.author = author;
	this.publisher = publisher;
	this.year = year;
	this.numberOfPages = numberOfPages;
	this.price = price;
	this.typeOfCover = typeOfCover;
}


@Override
public String toString() {
	return name+", Author: "+author+", Price: "+price+" $";
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getNumberOfPages() {
	return numberOfPages;
}
public void setNumberOfPages(int numberOfPages) {
	this.numberOfPages = numberOfPages;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getTypeOfCover() {
	return typeOfCover;
}
public void setTypeOfCover(String typeOfCover) {
	this.typeOfCover = typeOfCover;
}





}
