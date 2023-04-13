package my_array_list_tests;

import java.util.ArrayList;
import java.util.List;

public class Service {
    public static void main(String[] args) {

        System.out.println("Тест MyArrayList");
        List<Integer> list = new MyArrayList<>();
        for (int i = 0; i < 17; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }



        System.out.println("Контрольный ArrayList");
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 17; i++) {
            list1.add(i);
        }
        list1.forEach(System.out::println);

    }
}