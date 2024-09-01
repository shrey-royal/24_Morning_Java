public class DaemonThread {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon Thread is running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        daemonThread.setDaemon(true);

        daemonThread.start();

        System.out.println(daemonThread.isDaemon());

        System.out.println("Main Thread is finished.");
    }
}
