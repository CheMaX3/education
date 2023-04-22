package tinkoff_edu;

import java.io.IOException;
import java.util.Scanner;

public class TestTask1 {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int result = 0;

        while (scan.hasNext()) {

            int A = scan.nextInt();
            int B = scan.nextInt();
            int C = scan.nextInt();
            int D = scan.nextInt();

            if (D <= B) {
                result = A;
            } else {
                result = A + (D - B) * C;
            }
            System.out.println(result);
        }
    }
}
