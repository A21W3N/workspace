package hu.ttk.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import hu.ttk.data.DataProvider;

public class UserDAO implements DataProvider {

	@Override
	public ArrayList getAll() throws Exception {
		
		ArrayList back=new ArrayList();

		FileReader reader = new FileReader("data.txt");
		BufferedReader buff =new BufferedReader(reader);
		
		String row=buff.readLine();//elsõ sor olvasása
		while(row!=null)
		{
			System.out.println(row);
			row.split(";");
			User usr= new User();
			row=buff.readLine();//olvasás amíg van mit
		}
		
		return null;
	}

	@Override
	public Long add(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Object obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean delete(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	
	

	
}
