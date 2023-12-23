package com.enset.adapterpattern;

public class HDMIAfficheur implements HDMI{
    @Override
    public void afficher() {
        System.out.println("afficheur HDMI");
    }
}
