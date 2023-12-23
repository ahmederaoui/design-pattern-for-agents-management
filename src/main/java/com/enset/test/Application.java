package com.enset.test;

import com.enset.adapterpattern.AdapterAfficheur;
import com.enset.entities.Agent;
import com.enset.entities.Container;
import com.enset.entities.TransactionEntity;
import com.enset.entities.enums.TransactionType;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        TransactionEntity transactionEntity=new TransactionEntity();
        transactionEntity.setId("t1");
        transactionEntity.setDate(new Date());
        transactionEntity.setAmount(1000);
        transactionEntity.setType(TransactionType.PURCHASE);
        System.out.println(transactionEntity);
        Agent agent1 = Agent.clientBuilder()
                .id(1)
                .name("eraoui")
                .build();
        //System.out.println(agent1);
        Agent agent2 = Agent.clientBuilder()
                .id(2)
                .name("Ahmed")
                .build();
        agent1.subscribe(agent2);
        agent1.addTransaction(transactionEntity);
        //System.out.println(agent2);
        Container container1 =Container.getInstance();
        Container container2 =Container.getInstance();
        container1.addAgent(agent1);
        container2.addAgent(agent2);
        System.out.println("------Container1------------");
        container1.getAgentMap().forEach((s, agent) -> System.out.println(s));
        System.out.println("------Container2------------");
        container2.getAgentMap().forEach((s, agent) -> System.out.println(s));
        container1.getHdmi().afficher();
    }
}