package br.com.bruno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bruno.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {}