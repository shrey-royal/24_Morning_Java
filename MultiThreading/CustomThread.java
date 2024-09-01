import java.util.Random;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        Random r = new Random();
        try {
            int sleepTime = r.nextInt(500) + 100;
            Thread.sleep(sleepTime);
            System.out.println(Thread.currentThread().getName() + " slept for " + sleepTime + "ms.");
        } catch (Exception e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted!");
        }
    }
}

public class CustomThread {
    public static void main(String[] args) {
        MyThread[] multipleThreads = new MyThread[10];
        Thread mainThread = Thread.currentThread();
        
        for (int i = 0; i < multipleThreads.length; i++) {
            multipleThreads[i] = new MyThread("24_Morning_Java " + i);
            multipleThreads[i].start();
            System.out.println(multipleThreads[i].getName() + " is started!");
        }

        System.out.println(mainThread.getName());

        // for (int i = 0; i < multipleThreads.length; i++) {
        //     multipleThreads[i].run();
        //     mainThread.interrupt();
        // }

        System.out.println("All threads have finished execution");
    }
}
