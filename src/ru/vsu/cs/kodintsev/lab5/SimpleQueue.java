package ru.vsu.cs.kodintsev.lab5;

class SimpleQueue<T> extends SimpleList<T> implements Queue<T> {

    @Override
    public void enqueue(T element) {
        add(element);
    }

    @Override
    public T dequeue() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.remove(0);
    }
}
