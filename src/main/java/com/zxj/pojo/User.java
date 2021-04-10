package com.zxj.pojo;

import java.math.BigDecimal;
import java.util.Objects;

public class User {
    private int userId;
    private String userName;
    private boolean sexy;
    private BigDecimal amount;
    private int count;
    private String password;

    public User() {
    }

    public User(int userId, String userName, boolean sexy, BigDecimal amount, int count,String password) {
        this.userId = userId;
        this.userName = userName;
        this.sexy = sexy;
        this.amount = amount;
        this.count = count;
        this.password = password;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isSexy() {
        return sexy;
    }

    public void setSexy(boolean sexy) {
        this.sexy = sexy;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sexy=" + sexy +
                ", amount=" + amount +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId &&
                sexy == user.sexy &&
                count == user.count &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(amount, user.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, sexy, amount, count);
    }
}
