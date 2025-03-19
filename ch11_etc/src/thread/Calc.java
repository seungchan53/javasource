package thread;

public class Calc {
    private int menory;

    public int getMemory() {
        return menory;
    }

    public synchronized void setMemory(int menory) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " : " + this.menory);
    }
}
