package ch6_oop.src.abstractclass;

public class PlayerEx {
    public static void main(String[] args) {
        // Cannot instantiate the type Player
        // 인스턴스 생성 불가
        // Player player = new Player();
        Player player = new CDPlayer();
        player.play();
        player = new AudeoPlayer();
        player.play();

    }
}
