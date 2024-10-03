package ru.vsu.cs.kodintsev.lab2;

public class OilWell extends Well {
    private double oilQuality;

    public OilWell(Area area, int depth, int reserves, String wellName, double oilQuality) {
        super(area, depth, reserves, wellName);
        this.oilQuality = oilQuality;
    }

    public double getOilQuality() {
        return oilQuality;
    }

    public void setOilQuality(double oilQuality) {
        this.oilQuality = oilQuality;
    }

    public double calculateProfit() {
        double profit = getReserves() * oilQuality * 100;
        System.out.println("Ожидаемая прибыль от " + getWellName() + ": " + profit);
        return (int) profit;
    }

    @Override
    public void showWellInfo() {
        super.showWellInfo();
        System.out.println("Качество нефти: " + oilQuality);
    }
}

