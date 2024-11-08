package ru.vsu.cs.kodintsev.lab5;

import java.util.ArrayList;

class SimpleList<T> implements List<T> {
    protected java.util.List<T> list;

    public SimpleList() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(T element) {
        list.add(element);
    }

    @Override
    public void remove(T element) {
        list.remove(element);
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index < list.size()) {
            return list.get(index);
        }
        throw new IndexOutOfBoundsException("Индекс за пределами допустимых значенйи");
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean contains(T element) {
        return list.contains(element);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}