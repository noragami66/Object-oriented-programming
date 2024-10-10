package ru.vsu.cs.kodintsev.lab3;

import static ru.vsu.cs.kodintsev.lab3.Main.ANSI_GREEN;
import static ru.vsu.cs.kodintsev.lab3.Main.RESET;

public abstract class Well {
    private static int wellCount = 0;
    private String wellName;
    private int reserves;
    private int depth;
    private Area area;

    static {
        System.out.println(ANSI_GREEN + "Инициализация класса Well. Статический блок" + RESET);
    }

    {
        System.out.println(ANSI_GREEN + "Нестатический блок Well" + RESET);
    }

    public Well(Area area, int depth, int reserves, String wellName) {
        this.area = area;
        this.depth = depth;
        this.reserves = reserves;
        this.wellName = wellName;
        System.out.println(ANSI_GREEN + "Создается объект класса Well с именем: " + wellName + RESET + "\n");
        wellCount++;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getReserves() {
        return reserves;
    }

    public void setReserves(int reserves) {
        this.reserves = reserves;
    }

    public String getWellName() {
        return wellName;
    }

    public void setWellName(String wellName) {
        this.wellName = wellName;
    }

    public void increaseReserves(int addedReserves) {
        this.reserves += addedReserves;
        System.out.println("Запасы на месторождении " + wellName + " увеличены на " + addedReserves);
    }

    public void decreaseReserves(int reservesReduction) {
        this.reserves -= reservesReduction;
        System.out.println("Запасы на месторождении " + wellName + " уменьшились на " + reservesReduction);
    }

    public static int getWellCount() {
        return wellCount;
    }

    public void showWellInfo() {
        System.out.println("Название месторождения: " + getWellName() + ", Запасы: " + getReserves() +
                ", Глубина: " + getDepth() + ", Местоположение: " + getArea().getName());
    }

    public abstract void extractMaterial(int amount);

    public abstract void calculatePotentitalProfit();
}