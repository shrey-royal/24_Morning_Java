class MyThread extends Thread {
    public MyThread() {
        super();
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + ": " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Joining_Thread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("One");
        MyThread t2 = new MyThread("Two");
        MyThread t3 = new MyThread("Three");

        t1.start();
        try {
            t1.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            t2.join(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();
    }
}
