package api.util;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        // int
        List<Integer> list = new ArrayList<>();
        // arr[0] = 3;
        // 추가
        list.add(15);
        list.add(25);
        list.add(35);
        list.add(45);
        list.add(55);
        list.add(3, 75);

        System.out.println(list);

        // 조회
        // arr[3]
        System.out.println("특정 위치 요소 조회 " + list.get(3));
        System.out.println("특정 위치 요소 제거 " + list.remove(0));
        System.out.println("특정 위치 제거 " + list.remove(Integer.valueOf(35)));
        System.out.println(list);
    }
}
