package com.enset.adapterpattern;

public class AdapterAfficheur implements HDMI{
    private VGAAfficheur vgaAfficheur;
    @Override
    public void afficher() {
        vgaAfficheur.afficherVGA();
    }
}
