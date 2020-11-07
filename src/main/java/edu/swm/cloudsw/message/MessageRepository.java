package edu.swm.cloudsw.message;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MessageRepository extends MongoRepository<Message, String> {
	

}
