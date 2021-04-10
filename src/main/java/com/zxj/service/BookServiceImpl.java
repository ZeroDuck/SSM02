package com.zxj.service;

import com.zxj.dao.BooksMapper;
import com.zxj.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BooksMapper booksMapper;
//    这个bookMapper接口是由谁来实现。
//    Spring能想到的是比你强大的多，你配置文件自动扫描制定位置的Mapper接口，然后自动生成代理类，实现接口内容。这样在调用接口的时候，实际上是通过代理类去调用mybatis的xml中的sql语句。

    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    @Override
    public int addBook(Books book) {
        return booksMapper.addBook(book);
    }

    @Override
    public int deleteBookById(int bookId) {
        return booksMapper.deleteBookById(bookId);
    }

    @Override
    public int updateBook(Books book) {
        return booksMapper.updateBook(book);
    }

    @Override
    public List<Books> queryAllBooks() {
        return booksMapper.queryAllBooks();
    }

    @Override
    public Books queryBookById(int bookId) {
        return booksMapper.queryBookById(bookId);
    }
}
