package Sem_Java_Test.Sem4_HW;

import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        System.out.println("Исходный список: " + list1);
        System.out.println("Перевернутый список: " + revOffList(list1));
    }

    public static LinkedList<String> revOffList(LinkedList<String> list) {
        LinkedList<String> revList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            revList.add(list.get(i));
        }

        return revList;

    }

}
