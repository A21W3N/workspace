package hu.ttk;

import java.util.List;

public interface IUserDao {

	List<User> getAll();
	User getByID(int ID);
	void update(User user);
	void deleteByID(int ID); 
}
