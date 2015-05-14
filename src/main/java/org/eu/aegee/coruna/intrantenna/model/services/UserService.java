package org.eu.aegee.coruna.intrantenna.model.services;

import org.eu.aegee.coruna.intrantenna.model.domain.user.User;
import org.eu.aegee.coruna.intrantenna.model.exceptions.DuplicateInstanceException;
import org.eu.aegee.coruna.intrantenna.model.exceptions.InstanceNotFoundException;

/**
 * @author Alberto Ayora Pais
 *
 */
public interface UserService {

	public User create(User user) throws DuplicateInstanceException;
	
	public User findByEmail(String email) throws InstanceNotFoundException;
	
	public User update(User user) throws InstanceNotFoundException;
	
}
