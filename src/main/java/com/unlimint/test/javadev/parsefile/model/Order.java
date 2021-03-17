package com.unlimint.test.javadev.parsefile.model;

import java.util.Currency;

public class Order {
    Integer id;
    Double amount;
    Currency currency;
    String comment;

    public Order(Double amount, Currency currency, String comment) {
        this(null, amount, currency, comment);
    }

    public Order(Integer id, Double amount, Currency currency, String comment) {
        this.id = id;
        this.amount = amount;
        this.currency = currency;
        this.comment = comment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", amount=" + amount +
                ", currency=" + currency +
                ", comment='" + comment + '\'' +
                '}';
    }
}
