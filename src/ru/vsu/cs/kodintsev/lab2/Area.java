package ru.vsu.cs.kodintsev.lab2;

public class Area extends Location {
    private int fertile;
    private double areaSize;

    public Area(String name, String country, int fertile, double areaSize) {
        super(name, country);
        this.fertile = fertile;
        this.areaSize = areaSize;
    }

    public int getFertile() {
        return fertile;
    }

    public void setFertile(int fertile) {
        this.fertile = fertile;
    }

    public double getAreaSize() {
        return areaSize;
    }

    public void setAreaSize(double areaSize) {
        this.areaSize = areaSize;
    }

    public void increaseFertility(int addedFertility) {
        this.fertile += addedFertility;
        System.out.println("Плодородность территории " + getName() + " увеличена на " + addedFertility + ". Текущая плодородность: " + fertile);
    }

    public void decreaseFertility(int fertilityReduction) {
        this.fertile -= fertilityReduction;
        if (this.fertile < 0) {
            this.fertile = 0;
        }
        System.out.println("Плодородность территории " + getName() + " уменьшилась на " + fertilityReduction + ". Текущая плодородность: " + fertile);
    }

    public double calculateFertilityPerSquareKm() {
        if (areaSize > 0) {
            double fertilityPerKm = (double) fertile / areaSize;
            System.out.println("Плодородность на квадратный километр для " + getName() + ": " + fertilityPerKm);
            return fertilityPerKm;
        } else {
            System.out.println("Площадь территории должна быть больше 0.");
            return 0;
        }
    }

    public void compareFertilityWithOtherArea(Area otherArea) {
        if (this.fertile > otherArea.getFertile()) {
            System.out.println("Территория " + this.getName() + " более плодородна, чем " + otherArea.getName());
        } else if (this.fertile < otherArea.getFertile()) {
            System.out.println("Территория " + otherArea.getName() + " более плодородна, чем " + this.getName());
        } else {
            System.out.println("Территории " + this.getName() + " и " + otherArea.getName() + " имеют одинаковую плодородность.");
        }
    }

    public void showInfo() {
        System.out.println(getCountry() + ", " + getName() + ", Площадь: " + areaSize + " кв. км, Плодородность: " + fertile);
    }
}
