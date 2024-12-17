package Advanced.Multithreading_Concurrency;

class MyThread extends Thread {
    int n;

    public MyThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
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

public class MultithreadingExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(3);
        MyThread t2 = new MyThread(5);
        MyThread t3 = new MyThread(7);

        t1.start();
        t2.start();
        t3.start();
    }
}
