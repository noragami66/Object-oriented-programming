package ru.vsu.cs.kodintsev.lab2;

public class Well {

    private String wellName;
    private int reserves;
    private int depth;
    private Area area;

    public Well(Area area, int depth, int reserves, String wellName) {
        this.area = area;
        this.depth = depth;
        this.reserves = reserves;
        this.wellName = wellName;
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

    public double calculatePotential() {
        int potential = depth * reserves;
        System.out.println("Потенциал добычи на месторождении " + wellName + ": " + potential);
        return potential;
    }

    public void showWellInfo() {
        System.out.println("Название месторождения: " + getWellName() + ", Запасы: " + getReserves() +
                ", Глубина: " + getDepth() + ", Местоположение: " + getArea().getName());
    }
}