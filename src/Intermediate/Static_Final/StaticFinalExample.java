package Intermediate.Static_Final;

final class FinalClass {
    static int counter = 0;
    final int instanceID;

    FinalClass() {
        counter++;
        instanceID = counter;
    }

    final void display() {
        System.out.println("Instance ID: " + instanceID);
    }
}

public class StaticFinalExample {
    public static void main(String[] args) {
        FinalClass obj1 = new FinalClass();
        FinalClass obj2 = new FinalClass();

        obj1.display();
        obj2.display();

        System.out.println("Static Counter: "+ FinalClass.counter);
    }
}
