package api.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {

        List<Integer> lottol1 = new ArrayList<>();
        Set<Integer> lottol2 = new HashSet<>();

        // 6개 숫자 무작위 추출
        for (int i = 0; lottol2.size() < 6; i++) {
            // 로또 번호 1 ~ 45
            int num = (int) (Math.random() * 45) + 1;
            // lottol1.add(num);
            lottol2.add(num);
        }

        System.out.println(lottol2);

        // Set => List 변경
        List<Integer> list = new ArrayList<>(lottol2);
        // list.sort(Comparator.reverseOrder());
        // list.sort(Comparator.naturalOrder());
        System.out.println(list);

    }
}
