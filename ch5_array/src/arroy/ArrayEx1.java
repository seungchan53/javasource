package arroy;

// 배열
// 같은 타입의 여러 변수를 하나의 묶음으로 다루는 개념(다른 공간(heap을 사용) 기본적인 저장 공간은 (stack)
// 배열은 연속적인 공간 활용
// 배열의 크기는 변경 불가 : 변경을 할땐 새로운 공간을 만들어서 기존 배열을 옴기고 새로 추가
public class ArrayEx1 {
    public static void main(String[] args) {
        // 학생 100명의 점수를 입력
        // int [] 배열명 = new int[100]; 배열선언, 생성

        int[] scores = new int[5];

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        int[] scores2 = { 85, 65, 95, 75, 100 }; // 점수를 알고 있는 경우 {}
        // 세 번째 학생 점수 출력
        System.out.println("세번째 학생: " + scores2[2]);
        System.out.println("배열 길이: " + scores2.length); // 배열 길이 확인이 필요한 경우 length

        // 다섯번째 학생 점수 수정
        scores2[4] = 98;
        System.out.println("다섯번째 학생: " + scores2[4]);
        // ArrayIndexOutOfBoundsException (지정 index 번호가 없다는 오류)

        System.out.println(scores[5]);
    }
}
