    package condition;

import java.util.Scanner;

public class iftest7 {
        public static void main(String[] args) {
            // unm1 이라는 변수 선언 후 임의의 값음 담기]
            // int unm1 = 42;

            // 사용자로부터 입력을 받아 unm1 이라는 변수에 담고 
            Scanner scanner = new Scanner(System.in);
            System.out.println("정수 입력");
            String input = scanner.nextLine();
            int unm1 = Integer.parseInt(input);


            // unm1 이 짝수, 홀수인지 출력하기
            // unm1 % 2 == 0;
    
        if (unm1 % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }
}
