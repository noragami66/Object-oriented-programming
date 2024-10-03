package ru.vsu.cs.kodintsev.lab1;

public class Main {
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        Area komi = new Area("Республика Коми", "Россия", 100, 50);
        Area texas = new Area("Техас", "США", 200, 70);

        System.out.println(ANSI_GREEN + "Информация о территории Коми:");
        komi.increaseFertility(100);
        komi.decreaseFertility(20);
        komi.calculateFertilityPerSquareKm();
        komi.showInfo();

        System.out.println("\nИнформация о территории Техас:");
        texas.increaseFertility(50);
        texas.calculateFertilityPerSquareKm();
        texas.showInfo();

        System.out.println("\nСравнение плодородности Коми и Техаса:");
        komi.compareFertilityWithOtherArea(texas);

        Well well1 = new Well(komi, 500, 100, "Глубокая");
        Well well2 = new Well(texas, 600, 150, "Техасская");

        System.out.println("\nИнформация о скважине 'Глубокая' на территории Коми:");
        well1.increaseReserves(100);
        well1.decreaseReserves(15);
        well1.calculatePotential();
        well1.showWellInfo();

        System.out.println("\nИнформация о скважине 'Техасская' на территории Техаса:");
        well2.increaseReserves(200);
        well2.decreaseReserves(50);
        well2.calculatePotential();
        well2.showWellInfo();

        WellOnArea first = new WellOnArea(well1, komi);
        WellOnArea second = new WellOnArea(well2, texas);

        System.out.println("\nРабота с WellOnArea для скважины 'Глубокая' на территории Коми:");
        first.drillDeeper(100);
        first.calculateEfficiency();
        first.showInfo();

        System.out.println("\nРабота с WellOnArea для скважины 'Техасская' на территории Техаса:");
        second.drillDeeper(50);
        second.calculateEfficiency();
        second.showInfo();
    }
}
