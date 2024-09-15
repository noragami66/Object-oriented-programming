package ru.vsu.cs.kodintsev;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WellOnArea extends Area{
    private List<Well> wells;

    public WellOnArea(String AreaName, String country, int fertile, int percent) {
        super(AreaName, country, fertile, percent);
        this.wells = new ArrayList<>();
    }

    public void generateWell(WellOnArea area) {
        Random random = new Random();
        int fertile = area.getFertile();
        int percent = area.getPercent();
        if (percent >= 80){
            for (int i = 0; i < fertile; i++) {
                int randomNumber = random.nextInt(1000);
                Well high = new Well("#" + randomNumber,"Много");
                wells.add(high);
            }
        } else if (percent > 40 && percent < 80) {
            for (int i = 0; i < fertile; i++) {
                int randomNumber = random.nextInt(1000);
                Well normal = new Well("#" + randomNumber,"Умеренно");
                wells.add(normal);
            }
        } else {
            for (int i = 0; i < fertile; i++) {
                int randomNumber = random.nextInt(1000);
                Well low = new Well("#" + randomNumber,"Мало");
                wells.add(low);
            }
        }
    }

    public void removeWell(Well well) {
        wells.remove(well);
    }

    public List<Well> getWells() {
        return wells;
    }

    public void showAllWellsInfo() {
        System.out.println("Область: " + getAreaName() + ", Страна: " + getСountry());
        System.out.println("Информация об источниках:");
        for (Well well : wells) {
            well.showWellInfo();
        }
    }
    public void showChoosenWell(WellOnArea area) {
        System.out.println("Информация о источниках:");
        for (Well well : area.getWells()) {
            well.showWellInfo();
        }
    }
}
