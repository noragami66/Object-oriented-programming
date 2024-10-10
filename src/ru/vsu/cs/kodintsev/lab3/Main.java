package ru.vsu.cs.kodintsev.lab3;

import static ru.vsu.cs.kodintsev.lab3.Area.getAreaCount;
import static ru.vsu.cs.kodintsev.lab3.Well.getWellCount;
import static ru.vsu.cs.kodintsev.lab3.WellOnArea.getWellOnAreaCount;

public class Main {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";


    public static void main(String[] args) {
        Area komi = new Area("Республика Коми", "Россия", 100, 50);

        OilWell oilWell = new OilWell(komi, 500, 1000000, "Нефтяная скважина 1", 0.8);

        GasWell gasWell = new GasWell(komi, 300, 2000000, "Газовая скважина 1", "Метан");

        WellOnArea wellOnArea1 = new WellOnArea(oilWell,komi);

        gasWell.extractMaterial(100);

        gasWell.calculatePotentitalProfit();

        System.out.println("Cтатический метод для количества Area: " + getAreaCount());
        System.out.println("Cтатический метод для количества Well: " + getWellCount());
        System.out.println("Cтатический метод для количества WellOnArea: " + getWellOnAreaCount());
    }
}
