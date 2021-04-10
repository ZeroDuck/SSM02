package com.zxj.pojo;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

public class Record {

    private int rid;
    private int userId;
    private int bookId;
    private Date borrowTime;
    private Date returnTime;
    private BigDecimal cost;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return rid == record.rid &&
                userId == record.userId &&
                bookId == record.bookId &&
                borrowTime.equals(record.borrowTime) &&
                returnTime.equals(record.returnTime) &&
                cost.equals(record.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rid, userId, bookId, borrowTime, returnTime, cost);
    }

    @Override
    public String toString() {
        return "Record{" +
                "rid=" + rid +
                ", userId=" + userId +
                ", bookId=" + bookId +
                ", borrowTime=" + borrowTime +
                ", returnTime=" + returnTime +
                ", cost=" + cost +
                '}';
    }

    public Record() {
    }

    public Record(int rid, int userId, int bookId, Date borrowTime, Date returnTime, BigDecimal cost) {
        this.rid = rid;
        this.userId = userId;
        this.bookId = bookId;
        this.borrowTime = borrowTime;
        this.returnTime = returnTime;
        this.cost = cost;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public Date getBorrowTime() {
        return borrowTime;
    }

    public void setBorrowTime(Date borrowTime) {
        this.borrowTime = borrowTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}
