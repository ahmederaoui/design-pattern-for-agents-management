package com.enset.strategyPattern;

import com.enset.entities.TransactionEvent;

public class ScoringStrategy implements NotificationProcessingStrategy{

    @Override
    public void processNotification(TransactionEvent transactionEvent) {
        System.out.println(transactionEvent.getAgentName()+" -> The amount of "+
                transactionEvent.getTransaction().getType()+" is "+transactionEvent.getTransaction().getAmount());
    }
}
