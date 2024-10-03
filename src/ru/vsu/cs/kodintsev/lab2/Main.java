package ru.vsu.cs.kodintsev.lab2;

public class Main {
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        Area komi = new Area("Республика Коми", "Россия", 100, 50);
        System.out.println("Наследование от Well:");
        OilWell oilWell = new OilWell(komi, 500, 1000, "Нефтяная скважина 1", 0.8);
        oilWell.showWellInfo();
        oilWell.calculateProfit();
        oilWell.increaseReserves(10);

        System.out.println("\nДругое наследование от Well:");
        GasWell gasWell = new GasWell(komi, 300, 2000, "Газовая скважина 1", "Метан");
        gasWell.showWellInfo();
        gasWell.calculateProfit();

        System.out.println("\nНаследование от Location в Area:");
        komi.increaseFertility(50);
        komi.decreaseFertility(10);
        komi.calculateFertilityPerSquareKm();
        komi.showInfo();
        System.out.println(komi.getName());
    }
}
