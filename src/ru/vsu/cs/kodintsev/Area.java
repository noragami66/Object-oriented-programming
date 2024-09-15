package ru.vsu.cs.kodintsev;

public class Area {

    private String areaName;
    private String areaCountry;
    private int fertile;
    private int percent;


    public Area(String name, String country,int fertile, int percent) {
        this.areaName = name;
        this.areaCountry = country;
        this.fertile = fertile;
        this.percent = percent;
    }

    public String getAreaName() {
        return areaName;
    }

    public int getPercent() {
        return percent;
    }

    public int getFertile() {
        return fertile;
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

    public void showInfo(){
        System.out.println(getСountry() + ", " + getAreaName());
    }
}
