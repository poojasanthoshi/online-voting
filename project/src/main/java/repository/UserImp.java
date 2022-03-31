package repository;

import java.util.List;
import util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class UserImp implements User{
	EntityManager entityManager;
	

	public UserImp() {
		entityManager=JPAUtil.getEntityManager();
	}
	@Override

	public User addUser(User user) {
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		entityManager.merge(user);
		return user;
			}

	@Override
	public User viewUser(int userId) {
		return  entityManager.find(User.class,userId);
	}

	@Override
	public void deleteUser(int userId) {
		entityManager.delete(userId);

	}

	@Override
	public List<User> viewUserList() {
		String str="SELECT User FROM User user ";
		TypedQuery<User> query=entityManager.createQuery(str, User.class);
		return query.getResultList();

}
