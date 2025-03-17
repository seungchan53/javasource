package api.util;

import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
    public static void main(String[] args) {
        Set<Integer> lottol2 = new TreeSet<>();

        // 6개 숫자 무작위 추출
        for (int i = 0; lottol2.size() < 6; i++) {
            // 로또 번호 1 ~ 45
            int num = (int) (Math.random() * 45) + 1;
            // lottol1.add(num);
            lottol2.add(num);
        }
        // hashset : [16, 18, 4, 38, 41, 12]
        System.out.println(lottol2); // [4, 8, 11, 28, 40, 44]

    }

}
