package repository;

import java.util.List;

public interface User {
	User addUser(User user);
	User updateUser(User user);
	int deleteUser(int userId);
	List<User>viewUserList();
	User findByUserId(int userId);
}
