package shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyShop implements IShop {

    private String title;
    // 고객 5명 저장 가능한 배열 생성
    // private User[] users = new User[5];
    private List<User> users = new ArrayList<>();

    // 제품 10개 저장 가능한 배열 생성
    // Product[] products = new Product[10];
    private List<Product> products = new ArrayList<>();

    // cart (제품 저장 가능한 배열)
    // Product[] cart = new Product[10];
    List<Product> cart = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    private String selUser;

    @Override
    public void setTitle(String title) {
        this.title = title;

    }

    @Override
    public void genUser() {
        // 2명 생성
        users.add(new User("홍길동", PayType.CARD));
        users.add(new User("성춘향", PayType.CASH));
    }

    @Override
    public void genProduct() {
        products.add(new TV("삼성 QLEd", 4500000, "4K"));
        products.add(new TV("LG 울트라 HD", 3000000, "4K"));
        products.add(new CellPhone("Iphone 15", 1000000, "SKT"));
        products.add(new CellPhone("갤럭시 S25", 1200000, "U+"));
        products.add(new CellPhone("IPhone 16", 1300000, "KT"));

    }

    @Override
    public void start() {
        System.out.println(title + " :  메인 화면 - 계정선택");
        System.out.println("=====================================");
        int i = 0;
        for (User User : users) {
            if (User != null) {
                System.out.printf("[%d]%s(%s)\n", i++, User.getName(), User.getPayType());
            }
        }
        System.out.println("[x] 종료");
        System.out.println("=====================================");
        System.out.print("선택   :   ");

        String input = scanner.nextLine();
        switch (input) {
            case "X":
            case "x":
                System.exit(0);
                break;
            case "0":
            case "1":
                // 사용자가 선택한 user 정보 담기(checkout)
                selUser = input;
                productList();
                break;
            default:
                System.out.println("입력을 확인해주세요");
                start();
                break;
        }
    }

    public void productList() {
        System.out.println(title + " :  상품목록 - 상품선택");
        System.out.println("======================================");
        int i = 0;
        for (Product product : products) {
            if (product != null) {
                System.out.printf("[%d]", i++);
                product.printDetail();
            }
        }
        System.out.println("[h] 메인화면");
        System.out.println("[c]체크아웃");
        System.out.println("======================================");
        System.out.println("선택 : ");

        String input = scanner.nextLine();

        switch (input) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
                cart.add(products.get(Integer.parseInt(input)));
                productList();
                break;
            case "h":
                start();
                break;
            case "c":
                checkout();
                break;
            default:
                break;
        }
    }

    public void checkout() {
        System.out.println(title + " : " + users.get(Integer.parseInt(selUser)).getName() + " - 체크아웃");
        System.out.println("=====================================");
        int i = 0, sum = 0;
        for (Product product : cart) {
            if (product != null) {
                System.out.printf("[%d] %s (%d)\n", i++, product.getPname(), product.getPrice());
                sum += product.getPrice();
            }
        }
        System.out.println("결제방법 : " + users.get(Integer.parseInt(selUser)).getPayType());
        System.out.println("합계 : " + sum);
        System.out.println("======================================");
        System.out.println("[p] 이전");
        System.out.println("[q] 종료");
        System.out.print("선택 : ");

    }
}
