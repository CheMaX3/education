package other;

import java.util.*;

public class ListInterfaceTasks {

    public static void main(String[] args) {

        List<Integer> listStringsArray = new ArrayList<>();
        List<Integer> listStringsLinked = new LinkedList<>();

        generateList(listStringsLinked);
        generateList(listStringsArray);

        addToMiddle(listStringsArray);
        addToMiddle(listStringsLinked);

//        System.out.println(listStringsLinked.size());
//        System.out.println(listStringsArray.size());
//
//        addToEnd(listStringsArray);
//        addToEnd(listStringsLinked);
    }

    private static void generateList(List<Integer> list) {
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
    }

    private static void addToMiddle(List<Integer> list) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Integer middle = list.size()/2;
            list.add(middle, 1);
        }
        System.out.println(System.currentTimeMillis() - time);
        System.out.println(list.getClass().toString());
    }

//    private static void addToStart(List<Integer> list) {
//        long time = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            Integer start = 0;
//            list.add(start, 1);
//        }
//        System.out.println(System.currentTimeMillis() - time);
//        System.out.println(list.getClass().toString());
//    }

//    private static void addToEnd(List<Integer> list) {
//        long time = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            Integer end = list.size() - 1;
//            list.add(end, 1);
//        }
//        System.out.println(System.currentTimeMillis() - time);
//        System.out.println(list.getClass().toString());
//    }

}
