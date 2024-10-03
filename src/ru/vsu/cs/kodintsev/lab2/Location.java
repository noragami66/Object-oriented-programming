package ru.vsu.cs.kodintsev.lab2;

public class Location {
    protected String name;
    protected String country;

    public Location(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void showInfo() {
        System.out.println("Название: " + name + ", Страна: " + country);
    }
}
