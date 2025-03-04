package arroy;

public class ArrayEx14 {
    public static void main(String[] args) {
        // 2차원 배열
        // 타입[][] 배열명 = new 타입[3][3];

        // 값을 알고 있는 경우
        int score[][] = {
                { 100, 78, 68 },
                { 55, 45, 80 },
                { 37, 45, 40 },
                { 89, 78, 65 },
                { 100, 100, 100 },
        };

        int Kortotal = 0;
        int engtotal = 0;
        int mathtotal = 0;

        System.out.println("번호 국어 영어 수학 총점 평균");
        System.out.println("=================================");

        for (int i = 0; i < score.length; i++) {
            System.out.printf("%3d", i + 1);

            int sum = 0;
            float avg = 0.0f;

            Kortotal += score[i][0];
            engtotal += score[i][1];
            mathtotal += score[i][2];

            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                // 개인별 점수 출력
                System.out.printf("%5d", score[i][j]);
            }

            // 개인별 평균 계산 후 출력
            avg = sum / (float) score[i].length;
            System.out.printf("%5d %5.1f\n", sum, avg);

        }

        System.out.println("=================================");
        System.out.printf("총점 : %3d %3d %3d\n", Kortotal, engtotal, mathtotal);
    }
}
