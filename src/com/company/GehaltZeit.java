package com.company;

public interface GehaltZeit {
    double minPayMonat = 3700.0;
    double minPayStunde = 22.0;
    double minArbeitStunden = 8;
    double typicalsMonthsDays = 20.8;

    double Calculate();

    String getName();
}
