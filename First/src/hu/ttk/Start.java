package hu.ttk;

import java.util.ArrayList;

import hu.ttk.data.Animal;
import hu.ttk.data.Cat;
import hu.ttk.data.Dog;

public class Start {

	public static void main(String[] args) {
		
		ArrayList arr=new ArrayList();
		Dog dog1= new Dog("Kutyika", "Kék", 3);
		Dog dog2= new Dog("Valami", "Zöld", 3);
		Dog dog3= new Dog("Attila", "Kecske", 4);
		
		arr.add(dog1);
		arr.add(dog2);
		arr.add(dog3);
		
		for(int i=0; i<arr.size(); i++)
		{
			//Cast-oljuk a változóba "típusosítjuk"
			Animal anim=(Animal)arr.get(i);
			System.out.println("name: " +anim.name);
			
			if(anim instanceof Dog){
				Dog d=(Dog)anim;
				System.out.println("Ez egy kutya ami " +d.getColor()+ " színû");
			}
		}
		
	}
	
}
