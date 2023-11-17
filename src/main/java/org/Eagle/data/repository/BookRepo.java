package org.Eagle.data.repository;
import org.Eagle.data.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends MongoRepository<Book, String> {

}
