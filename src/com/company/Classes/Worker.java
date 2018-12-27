package com.company.Classes;

import com.company.GehaltZeit;

public class Worker implements GehaltZeit {
    private long ID;
    private double pay;
    private String name;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public double Calculate() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker(long ID) {
        this.ID = ID;
    }

    public Worker() {
    }

    public Worker(long ID, String name)
    {
        this.ID = ID;
        this.name = name;
    }

    public Worker(long ID, double pay, String name) {
        this.ID = ID;
        this.pay = pay;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Worker {" + "ID = " + getID() + ", Имя " + getName() + ", Зарплата = " + Calculate();
    }
}
