package op;

import java.util.Scanner;

public class ScabberEx1 {
    public static void main(String[] args) {
        // 키보드 입력받기
        // Systemm.in 키보드, System.out : 화면
        Scanner scanner = new Scanner(System.in);
        
        // Scanner scanner = new Scanner(System.in);
        // 키보드에서 무언가를 받는 코드

        System.out.println("두자리 정수 입력");
        // 사용자가 입력한 값을 input 변수에 담기
        // nextLine() : 문자열로 받아옴
        String input = scanner.nextLine();

        // "45" == 45 
        // Integer.parseInt 문자열 숫자를 정수로
        int unm = Integer.parseInt(input);
        System.out.println("입력값 : "+unm);

        scanner.close();
    }
}
