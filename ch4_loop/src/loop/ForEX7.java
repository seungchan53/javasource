package loop;

import java.util.Scanner;

// 중첩 for

// ********
// ********
// ********
// ********
// ********

public class ForEX7 {
    public static void main(String[] args) {

        // 별 * 10 출력
        // for (int i = 0; i < 10; i++) {
        // System.out.print("*");
        // }

        // for (int i = 0; i < 10; i++) {
        // System.out.print("*");
        // }

        // for (int i = 0; i < 10; i++) {
        // System.out.print("*");
        // }

        // for (int i = 0; i < 10; i++) {
        // System.out.print("*");
        // }

        // for (int i = 0; i < 10; i++) {
        // System.out.print("*");
        // }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int j = 0; j < args.length; j++) {
            for (int i = 0; j < 3; j++) {
                System.out.println(j + "\t");
            }
            System.out.println();
        }

    }
}
