package run.runnable.readwritesplit.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import run.runnable.readwritesplit.entity.User;
import run.runnable.readwritesplit.mapper.UserMapper;
import run.runnable.readwritesplit.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public List<User> list() {
		// 强制路由主库
		//HintManager.getInstance().setMasterRouteOnly();
		return userMapper.list();
	}

	public Long add(User user) {
		return userMapper.addUser(user);
	}

}
