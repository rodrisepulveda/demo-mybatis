package awto.mybatisdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import awto.mybatisdemo.mapper.UserMapper;
import awto.mybatisdemo.pojo.User;
import awto.mybatisdemo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, transactionManager = "demo-tm")
	public void createUser(User user) {
		userMapper.createUser(user);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, transactionManager = "demo-tm")
	public void updateUser(User user) {
		userMapper.updateUser(user);
	}

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED, transactionManager = "demo-tm")
	public List<User> listUsers() {
		List<User> listOfUsers = userMapper.listUsers();
		return listOfUsers;
	}

}
