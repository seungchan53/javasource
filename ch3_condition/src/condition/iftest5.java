package condition;

public class iftest5 {
    public static void main(String[] args) {
        
    
// 주사위 1~6
        // 0.38708258521300754
        // 0.5221279373116221
        // 0.0 <= Math.random < 1.0
        


        // unm = (int)(Math.random() * 6) + 1;
        int unm = (int)(Math.random() * 6) + 1;

        // unm이 1이면 주사위 1번이 나왔습니다

        if (unm == 1) {
            System.out.println("주사위 1번이 나왔습니다");
        }
        else if (unm == 2) {
            System.out.println("주사위 2번이 나왔습니다");
        }
        else if (unm == 3) {
            System.out.println("주사위 3번이 나왔습니다"); 
        }
        else if (unm == 4) {
            System.out.println("주사위 4번이 나왔습니다");  
        }
        else if (unm == 5) {
            System.out.println("주사위 5번이 나왔습니다");
        }
        else {
            System.out.println("주사위 6번이 나왔습니다");
        }
    }     
}