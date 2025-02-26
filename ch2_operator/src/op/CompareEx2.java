package op;

// 비교연산자
// 대소비교 <, >, <=, >=
// 등가비교 : ==(equal), !=(not equal)

// \t (tab)
// 두 변수의 타입이 다른 경우 타입을 맞춘 후 비교 
public class CompareEx2 {
    public static void main(String[] args) {
        float f1 = 0.1f;
        double d1 = 0.1f;
        double d2 = (double)f1;

        System.out.printf("10.0 == 10.0f %b\n" , 10.0==10.f);
        System.out.printf("0.1 == 0.1f %b\n", 0.1==0.1f);
        System.out.printf("f1 = %19.17f\n", f1);
        System.out.printf("f1 = %19.17f\n", d1);
        System.out.printf("f1 = %19.17f\n", d2);
        System.out.printf("f1 == d1 %b\n", f1 == d1);
        System.out.printf("d1 == d2 %b\n", d1 == d2);
        System.out.printf("d2 == f1 %b\n", d2 == f1);
        System.out.printf("(float)d1 == f1 %b\n", (float)d1 == f1);
        
        





    }
}
