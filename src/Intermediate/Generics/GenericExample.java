package Intermediate.Generics;

class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class GenericExample {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setItem("Hello World");
        System.out.println(box.getItem());

        Box<Integer> box2 = new Box<>();
        box2.setItem(123);
        System.out.println(box2.getItem());
    }
}
