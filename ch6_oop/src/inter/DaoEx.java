package ch6_oop.src.inter;

// DataAccessObject 인터페이스, OracleDao, MySqlDao 클래스 구현
interface DataAccessObject {
    void select();

    void insert();

    void update();

    void delete();
}

class OracleDao implements DataAccessObject {

    @Override
    public void select() {

    }

    @Override
    public void insert() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

}

class MySqlDao implements DataAccessObject {

    @Override
    public void select() {

    }

    @Override
    public void insert() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

}

public class DaoEx {
    public static void main(String[] args) {
        dbwork(new OracleDao());
        dbwork(new MySqlDao());
    }

    static void dbwork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

}
