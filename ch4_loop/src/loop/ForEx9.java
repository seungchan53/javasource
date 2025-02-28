package loop;

import java.util.Scanner;

// * 

// **
// ***
// ****
// *****

public class ForEx9 {
    public static void main(String[] args) {

        // * 을 출력할 라인의 수 입력 받기

        Scanner scanner = new Scanner(System.in);
        System.out.println("* 을 출력할 라인의 수 입력");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();

    }
}
