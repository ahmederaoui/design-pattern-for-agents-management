package com.enset.entities;

public class TransactionEvent {
    private String agentName;
    private TransactionEntity transaction;

    public TransactionEvent(String agentName, TransactionEntity transaction) {
        this.agentName = agentName;
        this.transaction = transaction;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public TransactionEntity getTransaction() {
        return transaction;
    }

    public void setTransaction(TransactionEntity transaction) {
        this.transaction = transaction;
    }
}
