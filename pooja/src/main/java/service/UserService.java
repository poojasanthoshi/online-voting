package service;

import java.util.List;

import entities.User;

public interface UserService {
	User registerUser(int User);
	User updateUser(int User);
	int deleteUser(int userId);
	List<User>viewUserList();
	User findByUserId(int userId);

}
