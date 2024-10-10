package ru.vsu.cs.kodintsev.lab3;

import static ru.vsu.cs.kodintsev.lab3.Main.ANSI_GREEN;
import static ru.vsu.cs.kodintsev.lab3.Main.RESET;

public class WellOnArea {
    private static int wellOnAreaCount = 0;
    private Well well;
    private Area area;

    static {
        System.out.println(ANSI_GREEN + "Инициализация класса WellOnArea. Статический блок" + RESET);
    }

    {
        System.out.println(ANSI_GREEN + "Нестатический блок WellOnArea" + RESET);
    }

    public WellOnArea(Well well, Area area) {
        this.well = well;
        this.area = area;
        System.out.println(ANSI_GREEN + "Создается объект класса WellOnArea: " + well.getWellName() + " в " + area.getName() + RESET + "\n");
        wellOnAreaCount++;
    }

    public Well getWell() {
        return well;
    }

    public void setWell(Well well) {
        this.well = well;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public void drillDeeper(int additionalDepth) {
        well.setDepth((int) (well.getDepth() + additionalDepth));
        System.out.println("Скважина " + well.getWellName() + " на территории " + area.getName() + " была углублена на " + additionalDepth + " метров.");
    }

    public double calculateEfficiency() {
        double efficiency = (well.getReserves() * well.getDepth()) / area.getAreaSize();
        System.out.println("Эффективность скважины " + well.getWellName() + " на территории " + area.getName() + ": " + (int) efficiency + " условных единиц");
        return efficiency;
    }

    public static int getWellOnAreaCount() {
        return wellOnAreaCount;
    }

    public void showInfo() {
        System.out.println("Скважина " + well.getWellName() + " расположена на территории " + area.getName() +
                " в стране " + area.getCountry());
    }
}
