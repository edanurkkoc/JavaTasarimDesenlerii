package ders11;

import java.util.List;
import java.util.concurrent.CountDownLatch;

//import org.w3c.dom.UserDataHandler;

//import org.w3c.dom.UserDataHandler;

public class Adapter implements DB {

}
public interface DB{
	public String  selectUserById(int id);
	public void insertUser(User user);
}
public class Oracle implements DB{
	private final List<User>userList;
	private int idCounter;
	public Oracle() {
		idCounter=0;
		userList=new ArrayList<>();
	}
	public UserDataHandler selectUserById(int id) {
		for(UserDataHandler user:userList) {
			if(user.getId()==id)
				return user;
		}
		return null;
	}
	public void insterUser(User user) {
		count();
		user.setId0idCounter();
		userList.add(user);
	}
	private void count() {
		idCounter=idCounter +1;
	}
}










