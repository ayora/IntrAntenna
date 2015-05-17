package org.eu.aegee.coruna.intrantenna.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.eu.aegee.coruna.intrantenna.model.domain.User;
import org.eu.aegee.coruna.intrantenna.model.exceptions.DuplicateInstanceException;
import org.eu.aegee.coruna.intrantenna.model.exceptions.InstanceNotFoundException;
import org.eu.aegee.coruna.intrantenna.model.repositories.user.UserRepository;

/**
 * @author Alberto Ayora Pais
 *
 */
@Service("userService")
public class UserServiceHandler implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User create(User user) throws DuplicateInstanceException {
		
		if (this.userRepository.findByEmail(user.getEmail()) != null) {
			
			throw new DuplicateInstanceException();
		}
		
		return userRepository.save(user);
	}

	public User findByEmail(String email) throws InstanceNotFoundException {
		
		return this.userRepository.findByEmail(email);
	}

	public User update(User user) {
		
		return this.userRepository.save(user);
	}

}
