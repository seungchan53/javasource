package loop;

// 반복문 - for, while, do~while
// 반복적으로 실행해야 하는 코드를 간단하게 처리

// 안녕하세요 10번 출력

public class ForEx2 {
    public static void main(String[] args) {

        // 반복문 중단: 강제 중단(break) or 조건이 false
        // 1) int i = 0;
        // 2) 조건검사 i < 5;
        // 3) 루프 안으로 진입 - 안녕하세요 출력
        // 4) 증감연산자 실행 i++ (i=1)
        // 5) 조건검사 ]
        // 6) 루프 안으로 진입 - 안녕하세요 출력
        // 7) 증감연산자 실행 i++ (i=2)
        // 8) 5) ~ 7) 반복
        // 증감연산자 실행 i++ (i=5)
        // 조건검사 5 < 5 루프 중단

        for (int i = 0; i < 10; i++) {
            System.out.print(i + "   ");
        }
        for (int i = 10; i > 0; i--) {
            System.out.print(i + "   ");
        }

        for (int i = 1; i < 11; i++) {
            System.out.print(i + "   ");
            if (i % 2 == 0) {
                System.out.print(i + "   ");
            }
        }

        int i = 0; // for,문 바깥쪽에 초기화 선언 가능 코드 안에서 ; 입력
        for (int j = 0, k = 1; i < args.length; i++) { // 초기화 선언은 여러개 선언 가능

        }

        // for (; ; ) {

        // }

    }
}
