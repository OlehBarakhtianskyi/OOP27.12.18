package com.company;

import com.company.Classes.ArbeiterStunden;
import com.company.Classes.FixedSalary;
import com.company.Classes.Worker;

public class Main {

    public static void main(String[] args) {
        Worker Firma[] = new Worker[5];

        String speciaity = "Программная инженерия";
int a = 45678;
long b = a;
        Firma[0] = new ArbeiterStunden(112731274L,"Алексей", 123);//Ввод зарплаты за час
        Firma[1] = new FixedSalary("Даниил", 13000);
        Firma[2] = new FixedSalary("Мирослав", 3300);
        Firma[3] = new ArbeiterStunden(1102930462, "Дмитрий", 19);//Ввод зарплаты за час
        Firma[4] = new ArbeiterStunden(1082736478,"Олег", 30);//Ввод зарплаты за час

        for (Worker worker: Firma) {
            System.out.println(worker.toString());
        }

    }
}
