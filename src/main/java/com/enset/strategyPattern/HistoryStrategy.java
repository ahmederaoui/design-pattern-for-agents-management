package com.enset.strategyPattern;

import com.enset.entities.TransactionEntity;
import com.enset.entities.TransactionEvent;

import java.util.ArrayList;
import java.util.List;

public class HistoryStrategy implements NotificationProcessingStrategy {
    private List<TransactionEntity> transactions=new ArrayList<>();

    @Override
    public void processNotification(TransactionEvent transactionEvent) {
        transactions.add(transactionEvent.getTransaction());
    }

    public List<TransactionEntity> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionEntity> transactions) {
        this.transactions = transactions;
    }
}
