package ru.vsu.cs.kodintsev.lab3;

import static ru.vsu.cs.kodintsev.lab3.Main.ANSI_GREEN;
import static ru.vsu.cs.kodintsev.lab3.Main.RESET;

public class OilWell extends Well {
    private double oilQuality;
    public static final int PRICE = 100;

    static {
        System.out.println(ANSI_GREEN + "Инициализация класса OilWell. Статический блок" + RESET);
    }

    {
        System.out.println(ANSI_GREEN + "Нестатический блок OilWell" + RESET);
    }

    public OilWell(Area area, int depth, int reserves, String wellName, double oilQuality) {
        super(area, depth, reserves, wellName);
        this.oilQuality = oilQuality;
        System.out.println(ANSI_GREEN + "Создается объект класса OilWell с именем: " + wellName + RESET + "\n");
    }

    public double getOilQuality() {
        return oilQuality;
    }

    public void setOilQuality(double oilQuality) {
        this.oilQuality = oilQuality;
    }

    @Override
    public void calculatePotentitalProfit() {
        double profit = getReserves() * oilQuality * PRICE;
        System.out.println("Ожидаемая прибыль от " + getWellName() + ": " + profit + " условных единиц");
    }

    @Override
    public void showWellInfo() {
        super.showWellInfo();
        System.out.println("Качество нефти: " + oilQuality);
    }

    @Override
    public void extractMaterial(int amount) {
        if (getReserves() >= amount) {
            setReserves(getReserves() - amount);
            double profit = amount * oilQuality * PRICE;
            System.out.println("Из нефтяной скважины " + getWellName() + " добыто " + amount + " единиц нефти.");
            System.out.println("Прибыль от добычи: " + (int) profit + "\n");
        } else {
            System.out.println("Недостаточно запасов для добычи");
        }
    }
}
