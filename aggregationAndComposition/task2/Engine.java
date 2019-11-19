package task2;

public class Engine {
private String typeOfEngine;
private int enginePower;
public String getTypeOfEngine() {
	return typeOfEngine;
}
@Override
public String toString() {
	return typeOfEngine;
}
public void setTypeOfEngine(String typeOfEngine) {
	this.typeOfEngine = typeOfEngine;
}
public int getEnginePower() {
	return enginePower;
}
public void setEnginePower(int enginePower) {
	this.enginePower = enginePower;
}
public Engine(String typeOfEngine, int enginePower) {
	super();
	this.typeOfEngine = typeOfEngine;
	this.enginePower = enginePower;
}

}
