package ch6_oop.src.oop;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@NoArgsConstructor
@RequiredArgsConstructor // NonNull (+ final) 이 들어간 변수
@AllArgsConstructor
@Getter
@ToString
public class Person2 {
    @Setter // 해당하는 멤버변수의 setter 메소드만 생성
    private String pno;
    @NonNull
    private String name;
    private String tel;
}
