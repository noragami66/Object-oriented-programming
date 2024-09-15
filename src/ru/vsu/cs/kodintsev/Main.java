package ru.vsu.cs.kodintsev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        List<WellOnArea> listOfWellOnAreas = new ArrayList<>();

        WellOnArea area1 = new WellOnArea("Прадхо-Бей", "США",3, 90);
        WellOnArea area2 = new WellOnArea("Арланское", "Россия",2, 5);

        listOfWellOnAreas.add(area1);
        listOfWellOnAreas.add(area2);

        for (WellOnArea area: listOfWellOnAreas) {
            area.generateWell(area);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите область из списка:");
        for (int i = 0; i < listOfWellOnAreas.size(); i++) {
            WellOnArea area = listOfWellOnAreas.get(i);
            System.out.println((i + 1) + ". " + area.getAreaName() + ", " + area.getСountry());
        }

        System.out.print("Введите номер области: " + ANSI_GREEN);
        int choice = scanner.nextInt();

        if (choice > 0 && choice <= listOfWellOnAreas.size()) {
            WellOnArea selectedArea = listOfWellOnAreas.get(choice - 1);
            selectedArea.showChoosenWell(selectedArea);
        } else {
            System.out.println("Неверный номер");
        }
    }
}
