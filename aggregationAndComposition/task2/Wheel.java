package task2;

public class Wheel {
private String typeOfWheel;

public String getTypeOfWheel() {
	return typeOfWheel;
}

@Override
public String toString() {
	return typeOfWheel;
}

public void setTypeOfWheel(String typeOfWheel) {
	this.typeOfWheel = typeOfWheel;
}

public Wheel(String typeOfWheel) {
	super();
	this.typeOfWheel = typeOfWheel;
}
}
