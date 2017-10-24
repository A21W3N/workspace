package hu.ttk.data;

import java.util.ArrayList;

public interface DataProvider {
	
	public ArrayList getAll() throws Exception;
	
	public Long add(Object obj) throws Exception;
	
	public void update (Object obj)throws Exception;
	
	public boolean delete(Object obj)throws Exception;
	

}
