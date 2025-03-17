package ch6_oop.src.abstractclass;

public abstract class Player { // 추상메서드를 가지고 있으면 추상 클래스로 가야함

   boolean pause;
   int currentPos;

   Player() {
      pause = false;
      currentPos = 0;
   }

   // 추상메서드
   abstract void play();

   void pause() {

   }
}

class CDPlayer extends Player {

   @Override
   void play() {
      System.out.println("CD플레이어");
   }
}

class AudeoPlayer extends Player {

   @Override
   void play() {
      System.out.println("Audio플레이어");
   }
}
