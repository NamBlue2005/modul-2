package thread;

public class EvenThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("EvenThread: " + i);
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            System.out.println("EvenThread bị gián đoạn.");
        }
    }
}