package com.zxj.pojo;

import java.util.Objects;

public class Books {
    private int bookId;
    private String bookName;
    private String bookDescription;
    private boolean bookStatus;
    private int bookCount;


    public Books() {
    }

    public Books(int bookId, String bookName, String bookDescription, boolean bookStatus,int bookCount) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookDescription = bookDescription;
        this.bookStatus = bookStatus;
        this.bookCount = bookCount;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public boolean getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookDescription='" + bookDescription + '\'' +
                ", bookStatus=" + bookStatus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return bookId == books.bookId &&
                bookStatus == books.bookStatus &&
                Objects.equals(bookName, books.bookName) &&
                Objects.equals(bookDescription, books.bookDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, bookName, bookDescription, bookStatus);
    }
}
