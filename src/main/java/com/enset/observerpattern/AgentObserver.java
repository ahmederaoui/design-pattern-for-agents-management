package com.enset.observerpattern;

import com.enset.entities.Agent;
import com.enset.entities.TransactionEntity;

public interface AgentObserver {
    void subscribe(Agent agent);
    void unsubscribe(Agent agent);
    void notifyAgents(TransactionEntity transaction);
}
