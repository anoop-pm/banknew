package com.bank.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
	
	@Autowired
    private UserRepository repo;
     

    public void saveuser(User user) {
        repo.save(user);
    }


}
