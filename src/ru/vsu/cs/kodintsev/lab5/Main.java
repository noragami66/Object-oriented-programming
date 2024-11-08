package ru.vsu.cs.kodintsev.lab5;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Тестирование SimpleList ===");
        SimpleList<String> simpleList = new SimpleList<>();
        simpleList.add("Яблоко");
        simpleList.add("Банан");
        simpleList.add("Вишня");
        System.out.println("Список после добавления элементов: " + simpleList);

        simpleList.remove("Банан");
        System.out.println("Список после удаления 'Банан': " + simpleList);
        System.out.println("Содержит 'Яблоко': " + simpleList.contains("Яблоко"));
        System.out.println("Элемент по индексу 1: " + simpleList.get(1));

        System.out.println("\n=== Тестирование SimpleQueue ===");
        SimpleQueue<Integer> simpleQueue = new SimpleQueue<>();
        simpleQueue.enqueue(10);
        simpleQueue.enqueue(20);
        simpleQueue.enqueue(30);
        System.out.println("Очередь после добавления элементов: " + simpleQueue);

        System.out.println("Извлечённый элемент: " + simpleQueue.dequeue());
        System.out.println("Очередь после удаления элемента: " + simpleQueue);

        simpleQueue.enqueue(40);
        System.out.println("Очередь после добавления 40: " + simpleQueue);
    }
}
