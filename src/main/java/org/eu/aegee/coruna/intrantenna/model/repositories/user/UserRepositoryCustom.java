package org.eu.aegee.coruna.intrantenna.model.repositories.user;

import org.eu.aegee.coruna.intrantenna.model.domain.User;

public interface UserRepositoryCustom {

	public User findByEmail(String email);
	
}
