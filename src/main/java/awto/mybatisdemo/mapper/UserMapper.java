package awto.mybatisdemo.mapper;

import java.util.List;

import awto.mybatisdemo.pojo.User;

public interface UserMapper {

	void createUser(User user);

	void updateUser(User user);

	List<User> listUsers();

}
