package com.zxj.service;

import com.zxj.dao.BooksMapper;
import com.zxj.pojo.Books;

import java.util.List;

public interface BookService {

    int addBook(Books book);

    int deleteBookById(int bookId);

    int updateBook(Books book);

    List<Books> queryAllBooks();

    Books queryBookById(int bookId);



}
