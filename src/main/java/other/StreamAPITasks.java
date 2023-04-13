package other;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPITasks {
    public static void main(String[] args) {
 //       System.out.println(numbersAboveN(5));
//TODO:решить в 1 строку
    Stream.of(1, 2, 3, 4, 5).map(x -> x * 2).filter(x -> x > 5).forEach(System.out::println);
    }

    public static List<Integer> numbersAboveN (Integer n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            list.add(i*2);
        }
        return list.stream().filter(x -> x > n).toList();
    }
}
