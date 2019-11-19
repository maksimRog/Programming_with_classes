package task3;

public class Region {
private String name;
private City regionCenter;
public Region(String name, City regionCenter) {
	super();
	this.name = name;
	this.regionCenter = regionCenter;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public City getRegionCenter() {
	return regionCenter;
}
public void setRegionCenter(City regionCenter) {
	this.regionCenter = regionCenter;
}


}
