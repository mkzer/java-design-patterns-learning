public class TestThreadedLog {
    public static void main(String[] args) {
        Runnable task = () -> {
            Logger logger = Logger.getInstance();
            logger.log("Message from " + Thread.currentThread().getName());
        };

        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");
        Thread t3 = new Thread(task, "T3");

        t1.start();
        t2.start();
        t3.start();
    }
}
