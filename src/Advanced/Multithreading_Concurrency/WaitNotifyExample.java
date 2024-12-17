package Advanced.Multithreading_Concurrency;

class SharedData {
    private boolean ready = false;

    synchronized void produce() {
        System.out.println("Producer is running...");
        ready = true;
        notify();
    }

    synchronized void consume() {
        while (!ready) {
            try {
                System.out.println("Consumer is waiting...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumer consumed the data.");
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();

        Thread producer = new Thread(sharedData::produce, "Producer");
        Thread consumer = new Thread(sharedData::consume, "Consumer");

        consumer.start();
        producer.start();
    }
}
