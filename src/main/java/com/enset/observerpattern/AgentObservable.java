package com.enset.observerpattern;

import com.enset.entities.TransactionEvent;

public interface AgentObservable {
    void update(TransactionEvent transactionEvent);
}
