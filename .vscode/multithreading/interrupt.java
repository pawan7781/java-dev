package multithreading;

class ex implements Runnable {
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

public class interrupt {
    public static void main(String[] args) throws Exception {
        ex x = new ex();
        Thread td = new Thread(x);
        td.start();
        td.interrupt();
    }
}
