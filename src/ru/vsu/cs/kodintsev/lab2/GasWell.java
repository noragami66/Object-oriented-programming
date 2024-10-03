package ru.vsu.cs.kodintsev.lab2;

public class GasWell extends Well {
    private String gasType;

    public GasWell(Area area, int depth, int reserves, String wellName, String gasType) {
        super(area, depth, reserves, wellName);
        this.gasType = gasType;
    }

    public String getGasType() {
        return gasType;
    }

    public void setGasType(String gasType) {
        this.gasType = gasType;
    }

    public double calculateProfit() {
        int value = getReserves() * 50;
        System.out.println("Ценность газовой скважины " + getWellName() + ": " + value);
        return value;
    }

    @Override
    public void showWellInfo() {
        super.showWellInfo();
        System.out.println("Тип газа: " + gasType);
    }
}
