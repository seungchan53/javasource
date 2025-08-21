package member;

import java.util.List;
import java.util.Scanner;

import emp.EmpDTO;
import oracle.net.aso.m;

public class ConsoleUtil {

    public void getNameList(List<MemberDTO> list) {
        System.out.println("=======================================================");
        System.out.println("번호    아이디   이름       주소\t    이메일\t\t나이");
        for (MemberDTO memberDTO : list) {
            System.out.printf(memberDTO.getNo() + "\t");
            System.out.printf(memberDTO.getId() + "\t");
            System.out.printf(memberDTO.getName() + "\t");
            System.out.printf(memberDTO.getAddr() + "\t");
            System.out.printf(memberDTO.getEmail() + "\t");
            System.out.printf(memberDTO.getAge() + "\t");
            System.out.println();

        }
    }

    public void memberAllPrint(List<MemberDTO> list) {
        System.out.println("=======================================================");
        System.out.println("번호    아이디   이름       주소\t    이메일\t\t나이");
        for (MemberDTO memberDTO : list) {
            System.out.printf(memberDTO.getNo() + "\t");
            System.out.printf(memberDTO.getId() + "\t");
            System.out.printf(memberDTO.getName() + "\t");
            System.out.printf(memberDTO.getAddr() + "\t");
            System.out.printf(memberDTO.getEmail() + "\t");
            System.out.printf(memberDTO.getAge() + "\t");
            System.out.println();

        }
    }

    // 조회
    public String memberGetInfo(Scanner sc) {
        // 조회할 회원 아이디 리턴
        // dto 출력
        System.out.println("=== 회원 조회 ===");
        System.out.println(" 아이디 조회 ");
        System.out.println(" 이름 조회 ");

        System.out.print("번호 >> ");
        int no = Integer.parseInt(sc.nextLine());

        String input = "";

        if (no == 1) {
            System.out.print("조회 회원 아이디 >> ");
            input = sc.nextLine();
        } else {
            System.out.print("조회 회원 이름 >> ");
            input = sc.nextLine();
        }
        // 입력받은 아이디 리턴
        return sc.nextLine();
    }

    // dto 출력메소드
    public void memberPrint(MemberDTO dto) {
        System.out.println("======== 조회한 회원 정보 ========");
        System.out.println("번호 : " + dto.getNo());
        System.out.println("아이디 : " + dto.getId());
        System.out.println("이름 : " + dto.getName());
        System.out.println("주소 : " + dto.getAddr());
        System.out.println("이메일 : " + dto.getEmail());
        System.out.println("나이 : " + dto.getAge());
        System.out.println("===================================");

    }

    public String memberDeleteInfo(Scanner sc) {
        System.out.println("=== 회원 삭제 ===");

        // 삭제할 회원 아이디 입력
        System.out.print("삭제 회원 아이디 >> ");
        // 입력받은 아이디 리턴
        String id = sc.nextLine();
        return id;
    }

    public MemberDTO memberInsertInfo(Scanner sc) {

        System.out.println();
        MemberDTO memberDTO = new MemberDTO();
        System.out.println("======= 회원정보 입력화면 ======");
        System.out.print("아이디 >> ");
        memberDTO.setId(sc.nextLine());
        System.out.print("이름 >> ");
        memberDTO.setName(sc.nextLine());
        System.out.print("주소 >> ");
        memberDTO.setAddr(sc.nextLine());
        System.out.print("이메일 >> ");
        memberDTO.setEmail(sc.nextLine());
        System.out.print("나이 >> ");
        memberDTO.setAge(Integer.parseInt(sc.nextLine()));

        return memberDTO;
    }

    // 성공시 출력 메소드
    public void printSuccessMessage(int result) {
        // result 값에 따라 입력 성공/ 입력 실패 출력
        System.out.println(result > 0 ? "입력성공" : "입력실패");
    }

    public void printDeleteSuccessMessage(int result) {
        // result 값에 따라 입력 성공/ 입력 실패 출력
        System.out.println(result > 0 ? "삭제성공" : "삭제실패");
    }

    // 업데이트시 출력 메소드
    public void printupdateSuccessMessage(int result, String id) {
        // result 값에 따라 입력 성공/ 입력 실패 출력
        System.out.println(result > 0 ? id + "님의 정보를 수정하였습니다" : id + "님의 정보 수정에 실패하였습니다");
    }

    public MemberDTO memberUpdateMenu(Scanner sc) {
        System.out.println("======== 회원 정보 수정 =========");
        System.out.println("1.주소 수정");
        System.out.println("2.이메일 수정");
        System.out.println("=================================");
        System.out.println("번호 >> ");
        int no = Integer.parseInt(sc.nextLine());

        if (no == 1) {
            // no == 1 memberUpdateAddr() 호출
            return memberUpdateAddr(sc);
        } else if (no == 2) {
            // no == 2 memberUpdateEmail() 호출
            return memberUpdateEmail(sc);
        }
        // 리턴 받은 DTO 를 리턴
        return null;
    }

    public MemberDTO memberUpdateAddr(Scanner sc) {
        // 수정할 값 입력(id,변경할 addr) => DTO 에 담은 후 리턴
        System.out.println("===== 수정 정보 입력 ======");
        System.out.print("아이디 >>");
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(sc.nextLine());
        System.out.print("변경 주소 >> ");
        memberDTO.setAddr(sc.nextLine());
        return memberDTO;
    }

    public MemberDTO memberUpdateEmail(Scanner sc) {
        // 수정할 값 입력(id, 변경할 email) => DTO 에 담은 후 리턴
        System.out.println("===== 수정 정보 입력 ======");
        System.out.print("아이디 >>");
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(sc.nextLine());
        System.out.print("변경 이메일 >> ");
        memberDTO.setEmail(sc.nextLine());
        return memberDTO;
    }
}
