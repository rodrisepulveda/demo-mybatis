package awto.mybatisdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import awto.mybatisdemo.mapper.UserMapper;
import awto.mybatisdemo.pojo.User;
import awto.mybatisdemo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public void createUser(User user) {

		userMapper.createUser(user);

	}

	@Override
	public void updateUser(User user) {

		userMapper.updateUser(user);

	}

	@Override
	public List<User> listUsers() {
		return userMapper.listUsers();
	}

}
