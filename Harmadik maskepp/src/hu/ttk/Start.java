package hu.ttk;
//DAO = DATA ACCES OBJECT
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Start {
	
	public static void main(String[] args){
		
		try {
			FileReader reader = new FileReader("data.txt");
			BufferedReader buff =new BufferedReader(reader);
			String row=buff.readLine();//elsõ sor olvasása
			while(row!=null)
			{
				System.out.println(row);
				row=buff.readLine();//olvasás amíg van mit
			}
		} catch (FileNotFoundException e1) {
			//ha nincs fájl akkor ez vagyon
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
