package arroy;

import java.util.Arrays;

// 배열
// 같은 타입의 여러 변수를 하나의 묶음으로 다루는 개념(다른 공간(heap을 사용) 기본적인 저장 공간은 (stack)
// 배열은 연속적인 공간 활용
// 배열의 크기는 변경 불가 : 변경을 할땐 새로운 공간을 만들어서 기존 배열을 옴기고 새로 추가
public class ArrayEx2 {
    public static void main(String[] args) {

        // 정수 타입의 배열 선언
        // 길이가 10인 int형 배열 생성
        int[] arr = new int[10]; // int[] arr = new int[10]; =>

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10 + 10;

        }

        // 배열 요소의 값 확인
        // 1) for 문 사용 : 원하는 형태로 출력이 가능하다
        // 2) 향상된 for 문 : 1) 번과 같음
        // 3) Arrays.toString(배열명) : [배열요소 출력] => 확인용

        System.out.println(Arrays.toString(arr)); // [10,20,30,40,50,60,70,80,90,100]

        for (int i : arr) {
            System.out.println(i + "\t");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "\t");

        }

    }
}
