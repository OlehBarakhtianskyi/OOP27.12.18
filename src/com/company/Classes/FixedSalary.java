package com.company.Classes;

import static com.company.GehaltZeit.minPayMonat;

public class FixedSalary extends Worker {
    private double typicalGehalt;
    public FixedSalary(String name) {
        this.setName(name);
    }
    public FixedSalary(double typicalGehalt){
        this.typicalGehalt = typicalGehalt;
    }
    @Override
    public double Calculate() {
        return this.typicalGehalt;
    }
    public FixedSalary (String name, double typicalGehalt){
        this.setName(name);
        this.setTypicalGehalt(typicalGehalt);
    }

    public double getTypicalGehalt() {
        return typicalGehalt;
    }

    public void setTypicalGehalt(double typicalGehalt) {
        this.typicalGehalt = (typicalGehalt < minPayMonat ? minPayMonat : typicalGehalt);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}