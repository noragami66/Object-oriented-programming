package ru.vsu.cs.kodintsev.lab4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] firstPersonMarks = {4,4,4,4,4};
        int[] secondPersonMarks = {5,5,5,5,5};

        LocalDate firstPersonLastSeen = LocalDate.of(2024, 10, 1);
        LocalDate secondPersonLastSeen = LocalDate.of(2024, 10, 31);

        Student firstStudent = new Student(1,"Кодинцев","Алексей","Валерьевич",19,7,1,firstPersonMarks,firstPersonLastSeen);
        Student copyFirtsStudent = new Student(1,"Кодинцев","Алексей","Валерьевич",19,7,1,firstPersonMarks,firstPersonLastSeen);
        Student secondStudent = new Student(3,"Немченко","Марина","Евгеньевна",19,7,2,secondPersonMarks,secondPersonLastSeen);

//        copyFirtsStudent.changeMarks(secondPersonMarks); // поменять оценки
//        firstStudent.getNewMark(3);                      // получить новую оценку
//        firstStudent.updateLastSeen();                   // обновить вход
//
        System.out.println("Сравниваем студента один и его копию: " + firstStudent.equals(copyFirtsStudent));
        System.out.println("Сравниваем студента один и второго студента: " +firstStudent.equals(secondStudent));;
        System.out.println("Хешкод первого студента " + firstStudent.hashCode());
        System.out.println("Хешкод копии " +copyFirtsStudent.hashCode());

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(firstStudent);
        System.out.println("Содержит ли в себе список копию первого студента? - " + studentList.contains(copyFirtsStudent));
        System.out.println("Какой порядковый номер имеет копия? - " + studentList.indexOf(copyFirtsStudent));
        System.out.println("Попытка удалить копию - " + studentList.remove(copyFirtsStudent));
        System.out.println("Текущий размер массива - " + studentList.size());


        HashSet<Student> studentHashSet = new HashSet<>();
        studentHashSet.add(firstStudent);
        System.out.println("В хеш-таблицу добавлен первый студент " + firstStudent.getName() + " " + firstStudent.getSurname());
        studentHashSet.add(copyFirtsStudent);
        System.out.println("В хеш-таблицу добавлен второй студент-копия " + firstStudent.getName() + " " + firstStudent.getSurname());
        System.out.println("Текущий размер коллекции - " + studentHashSet.size());


        HashMap<Student, String> adressMap = new HashMap<>();
        System.out.println("Добавим в HashMap первого студента");
        adressMap.put(firstStudent, "Воронеж, университетская площадь 1");
        System.out.println("Изменим НЕзначимое поле для студента");
        firstStudent.setGroup(8);
        System.out.println("Попробуем получить адресс - " + adressMap.get(firstStudent));
        System.out.println("Изменим значимое поле для студента");
        firstStudent.changeMarks(secondPersonMarks);
        System.out.println("Попробуем получить адресс - " + adressMap.get(firstStudent));
        System.out.println("Попробуем получить адрес по старым значениям - " + adressMap.get(copyFirtsStudent));
    }
}