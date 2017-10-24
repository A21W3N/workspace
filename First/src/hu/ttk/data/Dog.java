package hu.ttk.data;
/*Ez egy kutya osztály 
 *
 */

public class Dog extends Animal{

	
		public Dog(String name, String color, int legCount){
			this.name=name;
			this.color=color;
			this.legCount=legCount;
		}
		public String getColor(){
			return color;
		}
	

}
