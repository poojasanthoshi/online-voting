package repo;

import java.util.List;

public interface User {
	User registerUser(int User);
	User updateUser(int User);
	int deleteUser(int userId);
	List<User>viewUserList();
	User findByUserId(int userId);
 
}
