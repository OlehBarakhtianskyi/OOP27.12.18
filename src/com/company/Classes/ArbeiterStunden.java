package com.company.Classes;

import com.company.GehaltZeit;

    public class ArbeiterStunden extends Worker {
    private double typicalGehaltUmStunde;


    public double getTypicalGehalt() {
        return typicalGehaltUmStunde;
    }

    public void setTypicalGehalt(double typicalGehalt) {
        this.typicalGehaltUmStunde = typicalGehalt;
    }

    public ArbeiterStunden() {
        super();
        typicalGehaltUmStunde = minPayStunde;
    }

    public ArbeiterStunden(long ID) {
        super(ID);
        typicalGehaltUmStunde = minPayStunde;
    }

    public ArbeiterStunden(long ID, double typicalGehalt) {
        super(ID);
        this.setTypicalGehalt(typicalGehalt);
    }

    public ArbeiterStunden(long ID, String name, double typicalGehalt){
        super(ID, name);
        this.setTypicalGehalt(typicalGehalt);
    }

    @Override
    public double Calculate(){
        return minArbeitStunden * typicalsMonthsDays * typicalGehaltUmStunde;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
