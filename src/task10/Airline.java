package task10;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Airline {
private String destination;
private int number;
private String type;
private String departureTime;
private int[] daysOfWeek;
public Airline(String destination, int number, String type, String departureTime, int[] daysOfWeek) {
	super();
	this.destination = destination;
	this.number = number;
	this.type = type;
	this.departureTime = departureTime;
	this.daysOfWeek = daysOfWeek;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getDepartureTime() {
	return departureTime;
}
public void setDepartureTime(String departureTime) {
	this.departureTime = departureTime;
}
public int[] getDaysOfWeek() {
	return daysOfWeek;
}
public void setDaysOfWeek(int[] daysOfWeek) {
	this.daysOfWeek = daysOfWeek;
}
@Override
public String toString() {
	return "Destination: "+destination+", Departure time: "+departureTime;
}







}
