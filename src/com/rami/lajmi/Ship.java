package com.rami.lajmi;

import sun.plugin.dom.core.CoreConstants;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    //variables
    // Nom
    String nom;
    //Coordonnée
    BoardPlot c;
    //Taille
    int n;
    //Direction
    Direction d;

    // Liste des coord
    List<BoardPlot> listCoord = new ArrayList<BoardPlot>();


    public Ship(String nom, BoardPlot c, int n, Direction d){
        this.nom = nom;
        this.c = c;
        this.n = n;
        this.d = d;
        listCoord.add(c);
    }

    public boolean isOnPlot(Plot p){
        return true;
    }

    // getNom
    public String getNom(){
        return nom;
    }
    // getTaille
    public int getTle()
    {
        return n;
    }

    // getCoordonnée
    public BoardPlot getCrd()
    {
        return c;
    }

    // method 3
    public Direction getDir()
    {
        return d;
    }

    @Override
    public String toString()
    {
        return("Bateau "+ this.getNom()+
                ".\n de Taille " +
                this.getTle()+", de Coordonnée " + this.getCrd()+
                " et dans la direction du "+ this.getDir()+" placé à votre service Général");
    }
}
