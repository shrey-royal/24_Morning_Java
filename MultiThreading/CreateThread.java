class Way1 extends Thread { //Custom thread class
    @Override
    public void run() {
        System.out.println("Thread(Way1) is running...");
        // System.out.println(Thread.currentThread().getState());
    }
}

class Way2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread(Way2) is running...");
    }

    public String getState() {
        return Thread.currentThread().getState().toString();
    }
    
}

public class CreateThread {
    public static void main(String[] args) {
        // Way1 one = new Way1();
        // System.out.println(one.getState());

        // one.start();
        // System.out.println(one.getState());

        // one.run();
        // one.interrupt();
        // System.out.println(one.getState());
        // System.out.println(one.isInterrupted());
        // System.out.println(one.getState());

        // Way2 two = new Way2();
        // System.out.println(two.getState());
        // two.run();
        // System.out.println(two.getState());

        Thread three = new Thread("MyThread");
        System.out.println(three.getState());   // NEW
        three.start();
        System.out.println(three.getState());   // RUNNABLE
        three.run();
        System.out.println(three.getState());   // RUNNABLE
        three.interrupt();
        System.out.println(three.getState());   // TERMINATED

        // System.out.println(three.getName());
    }
}
