package com.rami.lajmi;

public class BoardPlot implements Plot {
    int ab;
    int crd;

    public BoardPlot(){

    }
    public BoardPlot(int ab, int crd){
        this.ab = ab;
        this.crd = crd;
    }

    public int getAb(){
        return ab;
    };

    public int getCrd() {
        return crd;
    }

    public Plot getPlotTo(Direction d) {
        return null;
    }
}
