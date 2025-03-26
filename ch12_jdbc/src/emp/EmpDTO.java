package emp;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmpDTO {
    // 테이블에 한 행과 똑같은 구조로 생성
    private int empNo;
    private String ename;
    private String job;
    private int mgr;
    private String hireDate;
    private int sal;
    private int comm;
    private int deptno;

}
