package com.enset.strategyPattern;

import com.enset.entities.TransactionEvent;

public interface NotificationProcessingStrategy {
    void processNotification(TransactionEvent transactionEvent);
}
