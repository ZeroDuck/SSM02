package com.zxj.dao;

import com.zxj.pojo.Books;

import java.util.List;

public interface BooksMapper {


//    添加图书；
    int addBook(Books book);


    int deleteBookById(int bookId);


    int updateBook(Books book);


    List<Books> queryAllBooks();

    Books queryBookById(int bookId);



}
