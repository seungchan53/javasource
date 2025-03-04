package arroy;

public class ArrayEx8 {
    public static void main(String[] args) {
        int[] score = { 75, 88, 91, 33, 100, 55, 95 };

        // 배열에 저장된 값 중에서 최대값과 최소값 구하기
        // max 라는 변수를 잡고 min도 변수를 잡는다
        // for문을 돌려서 1번부터 돌린다

        int max = score[0], min = score[0];

        for (int i = 1; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            } else if (min > score[i]) {
                min = score[i];
            }
        }

    }
}
