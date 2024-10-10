package ru.vsu.cs.kodintsev.lab3;

import static ru.vsu.cs.kodintsev.lab3.Main.ANSI_GREEN;
import static ru.vsu.cs.kodintsev.lab3.Main.RESET;

public class GasWell extends Well {
    private String gasType;
    public static final int PRICE = 50;

    static {
        System.out.println(ANSI_GREEN + "Инициализация класса GasWell. Статический блок" + RESET);
    }

    {
        System.out.println(ANSI_GREEN + "Нестатический блок GasWell" + RESET);
    }

    public GasWell(Area area, int depth, int reserves, String wellName, String gasType) {
        super(area, depth, reserves, wellName);
        this.gasType = gasType;
        System.out.println(ANSI_GREEN + "Создается объект класса GasWell с именем: " + wellName + RESET + "\n");
    }

    public String getGasType() {
        return gasType;
    }

    public void setGasType(String gasType) {
        this.gasType = gasType;
    }

    @Override
    public void calculatePotentitalProfit() {
        int value = getReserves() * PRICE;
        System.out.println("Ожидаемая прибыль от " + getWellName() + ": " + value + " условных единиц");
    }

    @Override
    public void showWellInfo() {
        super.showWellInfo();
        System.out.println("Тип газа: " + gasType);
    }

    @Override
    public void extractMaterial(int amount) {
        if (getReserves() >= amount) {
            setReserves(getReserves() - amount);
            int profit = amount * PRICE;
            System.out.println("Из газовой скважины " + getWellName() + " добыто " + amount + " единиц газа.");
            System.out.println("Прибыль от добычи: " + profit + "\n");
        } else {
            System.out.println("Недостаточно запасов для добычи");
        }
    }
}
