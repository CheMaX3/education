package tinkoff_edu;

import java.util.Scanner;

public class TestTask2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int result = 0;

        while (scan.hasNext()) {
            int N = scan.nextInt();
            if ((N < 1) || (N > (2 * Math.pow(10, 9)))) {
                continue;
            } else if (N == 1) {
                result = 0;
            } else if ((N % 2) == 0) {
                result = N / 2;
            } else {
                result = (N + 1) / 2;
            }
            System.out.println(result);
        }
    }
}

