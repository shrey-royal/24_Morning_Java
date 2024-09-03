// Deadlock problem: When a thread is waiting for an object lock, that is acquired by another thread and second thread is waiting for an object that is got by first thread.

/*
// DeadLock Problem
public class DeadLock {
    public static void main(String[] args) {
        final String headphone = "Airpodes MAX";
        final String laptop = "Dell Alienware";

        Thread shubham = new Thread("Shubham") {
            @Override
            public void run() {
                synchronized(headphone) {
                    System.out.println(Thread.currentThread().getName() + " got " + headphone);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    synchronized(laptop) {
                        System.out.println(Thread.currentThread().getName() + " got " + laptop);
                    }
                }
            }
        };

        Thread yug = new Thread("Yug") {
            @Override
            public void run() {
                synchronized(laptop) {
                    System.out.println(Thread.currentThread().getName() + " got " + laptop);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    synchronized(headphone) {
                        System.out.println(Thread.currentThread().getName() + " got " + headphone);
                    }
                }
            }
        };

        shubham.start();
        yug.start();
    }
}
*/

// Deadlock Solution
public class DeadLock {
    public static void main(String[] args) {
        final String headphone = "Airpodes MAX";
        final String laptop = "Dell Alienware";

        Thread shubham = new Thread("Shubham") {
            @Override
            public void run() {
                synchronized(laptop) {
                    System.out.println(Thread.currentThread().getName() + " got " + laptop);
                    try {
                        Thread.sleep(50000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    synchronized(headphone) {
                        System.out.println(Thread.currentThread().getName() + " got " + headphone);
                    }
                }
            }
        };

        Thread yug = new Thread("Yug") {
            @Override
            public void run() {
                synchronized(laptop) {
                    System.out.println(Thread.currentThread().getName() + " got " + laptop);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    synchronized(headphone) {
                        System.out.println(Thread.currentThread().getName() + " got " + headphone);
                    }
                }
            }
        };

        shubham.start();
        yug.start();
    }
}