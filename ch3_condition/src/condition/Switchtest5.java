package condition;

import java.util.Scanner;

public class Switchtest5 {
    public static void main(String[] args) {
        // 점수는 (0~100)이렵받은 후 점수에 따라 등급 출력
        // 90 이상이면 A, 80 B, 70 C, F

        // 90 / 10 = 9, 100 / 10 = 10  

        Scanner scanner = new Scanner(System.in);
        System.out.println("가위(1),바위(2),보(3) 중에서 하나 입력");
        String input = scanner.nextLine();
        int jumsu = Integer.parseInt(input);

        switch ( jumsu / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;


        }








    }
}
