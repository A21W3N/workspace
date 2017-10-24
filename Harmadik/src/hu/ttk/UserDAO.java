package hu.ttk;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements IUserDao {
	private List<User> users;
	
	public UserDAO() {
		initDatasource();
	}
	
	private void initDatasource()
	{
		ArrayList<User> users=new ArrayList<>();
		
		File fileName = new File("C:\\Users\\Vincze Benjámin\\Desktop\\pls.text");
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName)))
				{
					String line;
					while((line = br.readLine()) != null){
						String[] tomb = line.split(";");
						User entity =new User();
						entity.setId(Integer.parseInt(tomb[0]));
						entity.setUsername(tomb[1]);
						entity.setPassword(tomb[2]);
						entity.setEmail(tomb[3]);
						
						users.add(entity);
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByID(int ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByID(int ID) {
		// TODO Auto-generated method stub
		
	}
	
	

}
