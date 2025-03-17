package exception;

public class NullEx {
    public static void main(String[] args) {

        String str = null;
        // System.out.println(str.length());

        Account accounts[] = new Account[5];
        // null 확인 후 처리하기 : NullPointerException 피하기
        for (Account account : accounts) {
            if (account != null) {
                System.out.println(account.getAno());
            }
        }

        // if를 사용하지 않는다면 NullPointerException
        try {
            for (Account account : accounts) {
                System.out.println(account.getAno()); // . 을 찍었을때 NullPointerException 뜨면 점 앞이 null
            }
        } catch (NullPointerException e) {
            // e.printStackTrace();
            // System.out.println(e.getMessage());
            System.out.println("입력을 확인해 주세요");

        }

    }
}
