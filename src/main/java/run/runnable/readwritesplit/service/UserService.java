package run.runnable.readwritesplit.service;


import run.runnable.readwritesplit.entity.User;

import java.util.List;

public interface UserService {

	List<User> list();
	
	Long add(User user);
	
}
