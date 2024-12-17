package Advanced.Multithreading_Concurrency;

class SharedResource {
    synchronized void printNumbers(int n) {
        for(int i = 0; i < n; i++) {
            System.out.println(Thread.currentThread().getId() + " : " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SynchronizationExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread t1 = new Thread(() -> sharedResource.printNumbers(3), "Thread 1");
        Thread t2 = new Thread(() -> sharedResource.printNumbers(5), "Thread 2");
        Thread t3 = new Thread(() -> sharedResource.printNumbers(7), "Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
