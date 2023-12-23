package com.enset.entities;

import com.enset.observerpattern.AgentObservable;
import com.enset.observerpattern.AgentObserver;
import com.enset.strategyPattern.NotificationProcessingStrategy;
import com.enset.strategyPattern.ScoringStrategy;

import java.util.ArrayList;
import java.util.List;

public class Agent implements AgentObserver, AgentObservable {
    private int id;
    private String name;
    private List<TransactionEntity> transactions=new ArrayList<>();
    private List<AgentObservable> agentObservables=new ArrayList<>();
    private NotificationProcessingStrategy notificationProcessingStrategy=new ScoringStrategy();

    public Agent(int id, String name, List<TransactionEntity> transactions) {
        this.id = id;
        this.name = name;
        this.transactions = transactions;
    }

    public Agent() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "id=" + id +
                ", name='" + name  +
                '}';
    }

    public NotificationProcessingStrategy getNotificationProcessingStrategy() {
        return notificationProcessingStrategy;
    }

    public void setNotificationProcessingStrategy(NotificationProcessingStrategy notificationProcessingStrategy) {
        this.notificationProcessingStrategy = notificationProcessingStrategy;
    }

    public void addTransaction(TransactionEntity transaction){
        transactions.add(transaction);
        notifyAgents(transaction);
    }

    public List<TransactionEntity> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionEntity> transactions) {
        this.transactions = transactions;
    }
    public static AgentBuilder clientBuilder(){
        return new AgentBuilder();
    }

    @Override
    public void subscribe(Agent agent) {
        this.agentObservables.add(agent);
    }

    @Override
    public void unsubscribe(Agent agent) {
        this.agentObservables.remove(agent);
    }

    @Override
    public void notifyAgents(TransactionEntity transaction) {
        agentObservables.forEach(agentObservable -> agentObservable.update(new TransactionEvent(this.name,transaction)));
    }

    @Override
    public void update(TransactionEvent transactionEvent) {
        notificationProcessingStrategy.processNotification(transactionEvent);
    }

    public static  class AgentBuilder{
        private  Agent agent;
        public AgentBuilder(){
            agent=new Agent();
        }
        public  AgentBuilder id(int id){
            agent.setId(id);
            return this;
        }
        public  AgentBuilder name(String firstname){
            agent.setName(firstname);
            return this;
        }
        public Agent build(){
            return agent;
        }
    }
}
