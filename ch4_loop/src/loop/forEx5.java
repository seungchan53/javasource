package loop;

        // 1 ~ 100 수중에서 
        // 1) 3의 배수의 합 출력



        // 2) 3의 배수 더하고 9의 배수는 뺀 합 출력


        // 3) 3의 배수와  5의 배수 총합 출력


    public class forEx5 {
    public static void main(String[] args) {
    
        int sum = 0;

        for (int i = 0; i < 101 ; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("10~100 사이의 3 배수의 총합"+sum);

        // 2) 3의 배수 더하고 9의 배수는 뺀 합 출력
        sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 9 != 0 ) {
                sum += i;
            }
        }
            System.out.println("1~100 사이의 3 배수이지만 9의 배수는 아닌수의 총합"+sum);

         // 2) 3의 배수 더하고 9의 배수는 뺀 합 출력
            sum = 0;
            for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 || i % 5 == 0 ) {
             sum += i;
     }
 }
            System.out.println("1~100 사이의 3 또는 5의 배수 총합"+sum);
    }
}
