package com.enset.entities;

import com.enset.adapterpattern.HDMI;
import com.enset.adapterpattern.HDMIAfficheur;

import java.util.HashMap;
import java.util.Map;

public class Container {
    private static Container containerSingleton;
    private Map<String,Agent> agentMap=new HashMap<>();
    private HDMI hdmi=new HDMIAfficheur();
    private Container(){

    }
    static {
        containerSingleton=new Container();
    }
    public static Container getInstance(){
        return containerSingleton;
    }
    public void addAgent(Agent agent){
        agentMap.put(agent.getName(),agent);
    }
    public Agent removeAgent(String agentName){
        return agentMap.remove(agentName);
    }
    public Agent getAgent(String agentName){
        return agentMap.get(agentName);
    }

    public Map<String, Agent> getAgentMap() {
        return agentMap;
    }

    public HDMI getHdmi() {
        return hdmi;
    }

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }
}
