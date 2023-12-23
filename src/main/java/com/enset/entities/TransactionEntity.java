package com.enset.entities;

import com.enset.entities.enums.TransactionType;

import java.util.Date;

public class TransactionEntity {
    private String id;
    private Date date;
    private double amount;
    private TransactionType type;

    public TransactionEntity(String id, Date date, double amount, TransactionType type) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.type = type;
    }

    public TransactionEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TransactionEntity{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                ", type=" + type +
                '}';
    }
}
