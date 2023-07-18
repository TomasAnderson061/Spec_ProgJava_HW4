// 2. Реализуйте очередь с помощью LinkedList со следующими методами:
//     enqueue() - помещает элемент в конец очереди,
//     dequeue() - возвращает первый элемент из очереди и удаляет его,
//     first() - возвращает первый элемент из очереди, не удаляя.

package Sem_Java_Test.Sem4_HW;

import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(list, RndNum());
        }
        System.out.println("Исходный список: " + list);
        System.out.println(dequeue(list));
        System.out.println("Урезанный список: " + list);
        System.out.println(first(list));
        System.out.println("Список: " + list);
    }

    public static void enqueue(LinkedList<Integer> list, int e) {
        list.addLast(e);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int e0 = list.get(0);
        list.remove(0);
        return e0;
    }

    public static int first(LinkedList<Integer> list) {
        int e0 = list.get(0);
        return e0;
    }

    public static int RndNum() {
        int num = (int) (Math.random() * 100);
        return num;
    }
}
