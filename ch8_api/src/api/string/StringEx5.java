package api.string;

public class StringEx5 {
    public static void main(String[] args) {
        System.out.println("AB 문자열 횟수 : " + count("12345AB12Ab345Ab", "AB"));
        System.out.println("AB 문자열 횟수 : " + count("12345", " Ab"));
    }

    public static int count(String src, String target) {
        // indexOf
        int count = 0, pos = 0;

        while ((pos = src.indexOf(target, pos)) != -1) {
            count++;
            pos += target.length();
        }
        return count;
    }
}
