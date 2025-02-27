package condition;

import java.util.Scanner;

public class iftest10 {
    public static void main(String[] args) {
        // 세 개 의 숫자를 입력받아 입력받은 수 중 가장 큰 수와 가장 작은 수 출력
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 수 입력");
        String input = scanner.nextLine();
        int unm1 = Integer.parseInt(input);

        System.out.println("두번째 수 입력");
        input = scanner.nextLine();
        int unm2 = Integer.parseInt(input);

        System.out.println("세번째 수 입력");
        input = scanner.nextLine();
        int unm3 = Integer.parseInt(input);

        int min = unm1;
        if (min > unm2) {
            min = unm2;
        }
           if (min > unm3) {
               min = unm3;             
           }
           
        int max = unm1;
        if (max < unm2) {
            max = unm2;
        }
           if (max < unm3) {
               max = unm3;           
        }

        System.out.printf("가장 큰수 %d, 가장 작은수 %d", max,min);
    
    }
}

 


