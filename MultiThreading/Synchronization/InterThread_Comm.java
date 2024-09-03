class Customer {
    int amount = 10000;

    synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + ": going to withdraw...");

        if(this.amount < amount) {
            System.out.println(Thread.currentThread().getName() + ": Less balance; waiting to deposit...");
            try {
                wait();     // will put the method in wait
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        this.amount -= amount;
        System.out.println(Thread.currentThread().getName() + ": withdraw completed...");
        notify();   // convert a waiting thread into in active state
    }

    synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + ": going to deposit...");
        this.amount += amount;
        System.out.println(Thread.currentThread().getName() + ": deposit completed...");
        notify();
    }
}

public class InterThread_Comm {
    public static void main(String[] args) {
        final Customer c = new Customer();
        new Thread("Son") {
            public void run() {
                c.withdraw(15000);
            }
        }.start();

        new Thread("Father") {
            public void run() {
                c.deposit(10000);
            }
        }.start();
    }
}
