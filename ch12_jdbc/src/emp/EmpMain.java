package emp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmpMain {
    public static void main(String[] args) {

        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        int empNo = 0, result = 0;
        EmpDAO eDao = new EmpDAO();
        EmpDTO eDto = null;

        while (run) {
            System.out.println("==================================");
            System.out.println("1.입력");
            System.out.println("2.수정");
            System.out.println("3.삭제");
            System.out.println("4.전체조회");
            System.out.println("5.특정사원조회");
            System.out.println("6.종료");
            System.out.println("==================================");

            System.out.print("메뉴 >> ");
            int meue = Integer.parseInt(scanner.nextLine());

            switch (meue) {
                case 1:
                    eDto = insertInfo(scanner);
                    result = eDao.insert(eDto);
                    System.out.println(result > 0 ? "입력성공" : "입력실패");
                    break;
                case 2:
                    eDto = updataInfo(scanner);
                    result = eDao.update(eDto);
                    System.out.println(result > 0 ? "수정성공" : "수정실패");
                    break;
                case 3:
                    empNo = delectInfo(scanner);
                    result = eDao.delect(empNo);
                    System.out.println(result > 0 ? "삭제성공" : "삭제실패");
                    break;
                case 4:
                    List<EmpDTO> list = eDao.selectAll();
                    empPrint(list);
                    break;
                case 5:
                    empNo = getRow(scanner);
                    eDto = eDao.select(empNo);
                    System.out.println(eDto);
                    break;
                case 6:
                    run = false;
                    break;
                default:
                    break;
            }
        }
    }

    public static void empPrint(List<EmpDTO> list) {
        System.out.println("=======================================================");
        System.out.println("사번    이름    직무 매니저번호 입사일 급여 수당 부서번호");
        System.out.println("=======================================================");
        for (EmpDTO empDTO : list) {
            System.out.print(empDTO.getEmpNo() + "\t");
            System.out.print(empDTO.getEname() + "\t");
            System.out.print(empDTO.getJob() + "\t");
            System.out.print(empDTO.getMgr() + "\t");
            System.out.print(empDTO.getHireDate() + "\t");
            System.out.print(empDTO.getSal() + "\t");
            System.out.print(empDTO.getComm() + "\t");
            System.out.print(empDTO.getDeptno() + "\n");
        }
    }

    public static int getRow(Scanner scanner) {
        // 조회할 empno 입력받은 후 리턴
        System.out.print("조회 대상 empNo >>");
        int empNo = Integer.parseInt(scanner.nextLine());
        return empNo;
    }

    public static int delectInfo(Scanner scanner) {
        // 삭제할 empNo 입력 받은 후 리턴
        System.out.print("삭제 대상 empNo >>");
        int empNo = Integer.parseInt(scanner.nextLine());
        return empNo;
    }

    public static EmpDTO updataInfo(Scanner scanner) {
        // 삭제할 empNo,sal 입력 받은 후 리턴
        System.out.print("수정 대상 empNo >>");
        int empNo = Integer.parseInt(scanner.nextLine());
        System.out.print("변경 급여 >>");
        int sal = Integer.parseInt(scanner.nextLine());

        EmpDTO eDto = EmpDTO.builder().empNo(empNo).sal(sal).build();

        return eDto;

    }

    public static EmpDTO insertInfo(Scanner scanner) {
        // 삭제할 empNo,sal 입력 받은 후 리턴
        System.out.print("사번 >>");
        int empNo = Integer.parseInt(scanner.nextLine());

        System.out.print("이름 >>");
        String Ename = scanner.nextLine();

        System.out.print("직무 >>");
        String Job = scanner.nextLine();

        System.out.print("매니저번호 >>");
        int Mgr = Integer.parseInt(scanner.nextLine());

        System.out.print("입사일 >>");
        String HireData = scanner.nextLine();

        System.out.print("급여 >>");
        int Sal = Integer.parseInt(scanner.nextLine());

        System.out.print("수당 >>");
        int Comm = Integer.parseInt(scanner.nextLine());

        System.out.print("부서번호 >>");
        int Deptno = Integer.parseInt(scanner.nextLine());

        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-mm-dd").parse(HireData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // EmpDTO eDto = EmpDTO.builder()
        // .empNo(empNo)
        // .ename(eNAME)
        // .job(job)
        // .mgr(mgr)
        // .hireDate(null)
        // .sal(sal)
        // .comm(comm)
        // .deptno(deptno)
        // .build();

        // return eDto;

        return new EmpDTO(empNo, Ename, Job, Mgr, HireData, Sal, Comm, Deptno);
    }
}
