package org.eu.aegee.coruna.intrantenna.model.repositories.user;

import org.eu.aegee.coruna.intrantenna.model.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;

public class UserRepositoryImpl implements UserRepositoryCustom {

	@Autowired
	private MongoOperations operations;

	public User findByEmail(String email) {
		
		return null;
	}

}
