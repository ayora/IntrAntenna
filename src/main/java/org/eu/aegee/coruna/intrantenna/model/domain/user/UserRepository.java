package org.eu.aegee.coruna.intrantenna.model.domain.user;

import org.bson.types.ObjectId;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Alberto Ayora
 * 
 */

@Repository("userRepository")
public interface UserRepository extends PagingAndSortingRepository<User, ObjectId> {

	/**
	 * @param email
	 * @return User instance
	 */
	public User findByEmail(String email);
	
}
