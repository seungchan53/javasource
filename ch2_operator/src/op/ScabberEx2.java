package op;

import java.util.Scanner;

public class ScabberEx2 {
    public static void main(String[] args) {
        // 키보드 입력받기
        // Systemm.in 키보드, System.out : 화면
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 입력 >> "); // 옆으로 받아드리고 싶으면 ln 빼기
        // 입력밧은 숫자
        int input = scanner.nextInt();
        System.out.println(input);

        scanner.close();

        // 실행 후 Exception 발생시 중단
    }
}
