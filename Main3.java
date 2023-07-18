// 3. Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
package Sem_Java_Test.Sem4_HW;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i <= 5; i++) {
            list.add(RndNum());
        }
        System.out.println("Список: " + list);
        System.out.println("Сумма: " + sum(list));
        System.out.println("Список: " + list);
    }

    public static <T extends Number> double sum(List<T> list) {
        Iterator<T> it = list.iterator();
        double sum = 0;
        while (it.hasNext())
            sum += it.next().doubleValue();
        return sum;
    }

    public static int RndNum() {
        int num = (int) (Math.random() * 10);
        return num;
    }

}