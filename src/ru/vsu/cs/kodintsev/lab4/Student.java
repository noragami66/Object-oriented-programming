package ru.vsu.cs.kodintsev.lab4;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Student {
    public final int ID;
    private final String surname;
    private final String name;
    private int[] marks;
    private String patronymic;
    private int age;
    private int group;
    private int subGroup;
    private LocalDate LastSeen;

    public Student(int ID,String surname,String name, String patronymic, int age,  int group, int subGroup,int[] marks, LocalDate LastSeen) {
        this.ID = ID;
        this.age = age;
        this.group = group;
        this.name = name;
        this.patronymic = patronymic;
        this.subGroup = subGroup;
        this.surname = surname;
        this.marks = marks;
        this.LastSeen = LastSeen;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void changeMarks(int[] marks){
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }

    public int[] getNewMark(int newMark) {
        int[] newMarks = Arrays.copyOf(this.marks, this.marks.length + 1);
        newMarks[newMarks.length - 1] = newMark;
        this.marks = newMarks;
        return this.marks;
    }

    public void updateLastSeen(){
        this.LastSeen = LocalDate.now();
    }

        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        if (this.hashCode() != student.hashCode()) return false;
        return ID == student.ID && Objects.equals(surname, student.surname) && Objects.equals(name, student.name) && Objects.deepEquals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        int result = ID;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(marks);
        return result;
    }
}
