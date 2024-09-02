// class Table {   // Resource
//     void printTable(int n) {
//         synchronized(this /* resource */) {    //synchronized block
//             for (int i=1; i<=10; i++) {
//                 System.out.println(n + " * " + i + " = " + n*i);
//                 try {
//                     Thread.sleep(100);
//                 } catch (Exception e) {
//                     e.printStackTrace();
//                 }
//             }
//         }
//     }
// }

// class Table {   // Resource
//     synchronized void printTable(int n) {    // synchronized method
//         for (int i=1; i<=10; i++) {
//             System.out.println(n + " * " + i + " = " + n*i);
//             try {
//                 Thread.sleep(100);
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

class MyThread1 extends Thread {
    Table t;
    int n;

    MyThread1(Table t, int n) {
        this.t = t;
        this.n = n;
    }

    @Override
    public void run() {
        t.printTable(n);
    }
}

class MyThread2 extends Thread {
    Table t;
    int n;

    MyThread2(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(2);
    }
}

public class ThreadSync {
    public static void main(String[] args) {
        Table t = new Table();
        MyThread1 t1 = new MyThread1(t, 1);
        MyThread2 t2 = new MyThread2(t);

        t1.setName("MyThread1");
        t2.setName("MyThread2");

        t1.start();
        t2.start();
    }
}
