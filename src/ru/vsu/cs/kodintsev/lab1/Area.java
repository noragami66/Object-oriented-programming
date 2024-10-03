package ru.vsu.cs.kodintsev.lab1;

public class Area {

    private String areaName;
    private String areaCountry;
    private int fertile;
    private double areaSize;

    public Area(String name, String country, int fertile, double areaSize) {
        this.areaName = name;
        this.areaCountry = country;
        this.fertile = fertile;
        this.areaSize = areaSize;
    }

    public String getAreaName() {
        return areaName;
    }

    public int getFertile() {
        return fertile;
    }

    public double getAreaSize() {
        return areaSize;
    }

    public void setAreaSize(double areaSize) {
        this.areaSize = areaSize;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getСountry() {
        return areaCountry;
    }

    public void setAreaCountry(String areaCountry) {
        this.areaCountry = areaCountry;
    }


    public void increaseFertility(int addedFertility) {
        this.fertile += addedFertility;
        System.out.println("Плодородность территории " + areaName + " увеличена на " + addedFertility);
    }

    public void decreaseFertility(int fertilityReduction) {
        this.fertile -= fertilityReduction;
        if (this.fertile < 0) {
            this.fertile = 0;
        }
        System.out.println("Плодородность территории " + areaName + " уменьшилась на " + fertilityReduction);
    }

    public double calculateFertilityPerSquareKm() {
        if (areaSize > 0) {
            double fertilityPerKm = (double) fertile / areaSize;
            System.out.println("Плодородность на квадратный километр: " + fertilityPerKm);
            return fertilityPerKm;
        } else {
            System.out.println("Площадь территории должна быть больше 0.");
            return 0;
        }
    }

    public void compareFertilityWithOtherArea(Area otherArea) {
        if (this.fertile > otherArea.getFertile()) {
            System.out.println("Территория " + this.getAreaName() + " более плодородна, чем " + otherArea.getAreaName());
        } else if (this.fertile < otherArea.getFertile()) {
            System.out.println("Территория " + otherArea.getAreaName() + " более плодородна, чем " + this.getAreaName());
        } else {
            System.out.println("Территории " + this.getAreaName() + " и " + otherArea.getAreaName() + " имеют одинаковую плодородность.");
        }
    }

    public void showInfo(){
        System.out.println(getСountry() + ", " + getAreaName() + ", Площадь: " + areaSize + " у.е." + ", Плодоротность " + fertile);
    }
}
