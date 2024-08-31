class MyThread extends Thread {
    MyThread() {
        super();
    }

    MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + ": " + i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 extends Thread {
    MyThread1() {
        super();
    }

    MyThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + ": " + i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class Thread_Scheduler {
    public static void main(String[] args) {
        Thread t1 = new MyThread("t1");
        Thread t2 = new MyThread1("t2");

        t1.setPriority(1);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

    }
}
