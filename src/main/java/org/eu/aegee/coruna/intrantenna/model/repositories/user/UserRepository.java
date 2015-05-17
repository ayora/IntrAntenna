package org.eu.aegee.coruna.intrantenna.model.repositories.user;

import org.bson.types.ObjectId;
import org.eu.aegee.coruna.intrantenna.model.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends MongoRepository<User, ObjectId>, UserRepositoryCustom {

}


