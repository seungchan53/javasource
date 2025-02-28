package loop;

public class ForEx10 {
    public static void main(String[] args) {

        for (int j = 5; j > 0; j--) {
            if (j > 1) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        for (int j = 5; j > 0; j--) {
            if (j > 2) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        for (int j = 5; j > 0; j--) {
            if (j > 3) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        for (int j = 5; j > 0; j--) {
            if (j > 4) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        for (int j = 5; j > 0; j--) {
            if (j > 5) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }

        System.out.println("\n\n");

        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > 0; j--) {
                // if (j > i) {
                // System.out.print(" ");
                // } else {
                // System.out.print("+");
                // }
                System.out.println(j > i ? " " : "*");
            }
            System.out.println();
        }

    }
}
