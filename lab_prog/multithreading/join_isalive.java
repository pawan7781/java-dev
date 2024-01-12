package multithreading;

class printing implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("focus is the key of successs");
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            System.out.println("error found!");

        }

    }
}

public class join_isalive {
    public static void main(String[] args) throws Exception {
        System.out.println("main thread started");
        printing p1 = new printing();
        Thread t = new Thread(p1);
        System.out.println(t.isAlive());
        t.start();
        System.out.println(t.isAlive());
        t.join();
        System.out.println("main thread finished");
    }

}
