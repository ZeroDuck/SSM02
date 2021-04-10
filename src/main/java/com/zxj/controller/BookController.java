package com.zxj.controller;

import com.zxj.pojo.Books;
import com.zxj.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookServiceImpl bookService;

    public void setBookService(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/addBook")
    public String addBook(Books books) {
        System.out.println(books);
        bookService.addBook(books);


        return "redirect:toAddBook";
    }

    @RequestMapping("/toAddBook")
    public String toAdd() {
        return "toAddBook";
    }

    @RequestMapping("/queryAllBook")
    public String queryAllBook(Model model) {
        List<Books> booksList = bookService.queryAllBooks();
        model.addAttribute("booksList", booksList);
        return "allBook";
    }
}
