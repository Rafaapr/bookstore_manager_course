package com.rafa.bockstoremanager.repository;

import com.rafa.bockstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
