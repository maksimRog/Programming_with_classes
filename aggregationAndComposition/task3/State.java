package task3;

public class State {
	private String name;

	private City capital;
	private District[] districts;
	private Region[] regions;

	public State(String name, City capital, District[] districts, Region[] regions) {
		super();
		this.name = name;
		this.capital = capital;
		this.districts = districts;
		this.regions = regions;
	}
	public void countRegions(){
		System.out.println("Кол-во областей: "+regions.length);
	}
	public void showRegionCenters(){
		System.out.print("Областные центры: ");
		for (int i = 0; i < regions.length; i++) {
			System.out.print(regions[i].getRegionCenter().getName()+" ");
			
		}
	}
	
	public void showCapital(){
		System.out.println("Столица: "+capital.getName());
	}

}
