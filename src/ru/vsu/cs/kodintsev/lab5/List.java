package ru.vsu.cs.kodintsev.lab5;

interface List<T> {
    void add(T element);
    void remove(T element);
    T get(int index);
    int size();
    boolean contains(T element);
}