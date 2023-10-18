package awto.mybatisdemo.service;

import java.util.List;

import awto.mybatisdemo.pojo.User;

public interface UserService {

	void createUser(User user);

	void updateUser(User user);

	List<User> listUsers();

}
