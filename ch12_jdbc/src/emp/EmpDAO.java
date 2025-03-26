package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    // static : 인스턴스변수, 인스턴스메서드 앞에 붙으면 공유(생성되는 모든 인스턴스가 같은 걸 사용)
    // 로드 시점이 가장 처음에 로드됨

    static {
        // 드라이버 로드
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "tiger";
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public void close(Connection con, PreparedStatement pstmt) {
        try {
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
        try {
            rs.close();
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // select,insert,update,delect 처리 메소드
    public int insert(EmpDTO eDto) {

        con = getConnection();
        int result = 0;
        try {
            String sql = "insert into emp_temp(EMPNO, ENAME, job, mgr, HIREDATE, sal, comm, DEPTNO) ";
            sql += "values(?,?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(sql);
            // ? 해결
            pstmt.setInt(1, eDto.getEmpNo());
            pstmt.setString(2, eDto.getEname());
            pstmt.setString(3, eDto.getJob());
            pstmt.setInt(4, eDto.getMgr());
            pstmt.setString(5, eDto.getHireDate());
            pstmt.setInt(6, eDto.getSal());
            pstmt.setInt(7, eDto.getComm());
            pstmt.setInt(8, eDto.getDeptno());

            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    public int update(EmpDTO eDto) {
        con = getConnection();
        int result = 0;
        try {
            String sql = "UPDATE emp_temp SET sal = ? WHERE empno=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, eDto.getSal());
            pstmt.setInt(2, eDto.getEmpNo());

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    public int delect(int empNo) {
        con = getConnection();

        String sql = "delete from emp_temp where empno=?";
        int result = 0;
        try {
            pstmt = con.prepareStatement(sql);
            // 물음표 해결
            pstmt.setInt(1, empNo);
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }

        return result;

    }
}
