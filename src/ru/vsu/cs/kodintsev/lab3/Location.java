package ru.vsu.cs.kodintsev.lab3;

import static ru.vsu.cs.kodintsev.lab3.Main.ANSI_GREEN;
import static ru.vsu.cs.kodintsev.lab3.Main.RESET;

public class Location {
    protected String name;
    protected String country;

    static {
        System.out.println(ANSI_GREEN + "Инициализация класса Location. Статический блок" + RESET);
    }

    {
        System.out.println(ANSI_GREEN + "Нестатический блок Location" + RESET);
    }

    public Location(String name, String country) {
        this.name = name;
        this.country = country;
        System.out.println(ANSI_GREEN + "Создается объект класса Location с именем: " + name + RESET + "\n");
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
