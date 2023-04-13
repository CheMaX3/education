package other_tasks;

public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        swap(a, b);
    }

    public static void swap(int a, int b) {
        System.out.println("a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void swap_v1(int a, int b) {
     //TODO:Умножение/деление без использования 3 переменной
    }
}
