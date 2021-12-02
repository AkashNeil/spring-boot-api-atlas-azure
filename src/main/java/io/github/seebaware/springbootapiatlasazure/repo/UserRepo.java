package io.github.seebaware.springbootapiatlasazure.repo;

import io.github.seebaware.springbootapiatlasazure.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, String> {

    User findUserByFirstName(String firstName);

    User findUserByLastName(String lastName);

}
