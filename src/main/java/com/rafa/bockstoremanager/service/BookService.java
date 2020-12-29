package com.rafa.bockstoremanager.service;

import com.rafa.bockstoremanager.dto.MessageResponseDTO;
import com.rafa.bockstoremanager.entity.Book;
import com.rafa.bockstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public MessageResponseDTO create (Book book){
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder()
                .message("Book created with ID" + savedBook.getId ())
                .build();
    }
}
