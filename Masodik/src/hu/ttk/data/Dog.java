package hu.ttk.data;

public class Dog {
	
	private String name;
	private String type;
	private int legCount;
	private String color;
	
	public Dog(String name, String type, int legCount, String color) {
		super();
		this.name = name;
		this.type = type;
		this.legCount = legCount;
		this.color = color;
	}
	
	public String getName(){
		return name;
	}

	public String getType() {
		return type;
	}

	

	public int getLegCount() {
		return legCount;
	}

	public String getColor() {
		return color;
	}
	
	
	public String toString() {
		
		return "ez a kutya "+name+" akinek "+color+" színe van "+type + " fajú és lábai száma "+legCount ;
	}
}
