package org.Eagle.services;

import org.Eagle.data.model.Shelf;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service

public interface ShelfServiceInter {
    Optional<Shelf> findBookBy(String title, String creator);

}
