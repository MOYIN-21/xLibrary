package org.Eagle.data.repository;

import org.Eagle.data.model.Creator;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreatorRepo extends MongoRepository<Creator, String> {
}
