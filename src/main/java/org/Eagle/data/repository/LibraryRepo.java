package org.Eagle.data.repository;
import org.Eagle.data.model.Library;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface LibraryRepo extends MongoRepository<Library, String> {

}
