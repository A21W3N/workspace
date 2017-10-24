package hu.ttk;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import hu.ttk.data.Chivava;
import hu.ttk.data.Dog;
import hu.ttk.data.Puli;
import hu.ttk.data.Torzskonyv;

public class Start {

	public static void main(String[] args) {
		Puli p1 = new Puli("Bl�kki", 4, "N�ger");
		Puli p2 = new Puli("Gonosz", 4, "Bantu");
		Puli p3 = new Puli("Medve �l�", 4, "K�nai");
		
		Chivava c1= new Chivava("Darotti", "Chi", 3, "Barn�s", new Date());
		Chivava c2= new Chivava("Nincs", "Vha", 5, "K�k", new Date());
		Chivava c3= new Chivava("Fant�zi�m", "Vhua", 3, "Z�ld", new Date());
		
		ArrayList arr = new ArrayList();
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		arr.add(c1);
		arr.add(c2);
		arr.add(c3);
		for(int i=0; i<arr.size();i++){
			Dog d=(Dog)arr.get(i);
			if(d instanceof Torzskonyv){
				Torzskonyv t=(Torzskonyv)d; ///////////////TH�EPUSOSO�ETH�S
				
				Date inspdate=t.getInspectionDate();
				SimpleDateFormat sdf = new SimpleDateFormat("YYYY.MM.dd");
				String sDate=sdf.format(inspdate);
				
				System.out.println("Csal�d neve"+t.getFamilyName()+"vizsg�lati d�tuma: "+sDate);
			}
			System.out.println(d);
		}

	}

}
