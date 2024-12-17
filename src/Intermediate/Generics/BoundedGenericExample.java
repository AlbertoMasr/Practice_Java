package Intermediate.Generics;

class BoundedBox<T extends Number> {
    private T value;

    public BoundedBox(T value) {
        this.value = value;
    }

    public double doubleValue() {
        return value.doubleValue();
    }
}

public class BoundedGenericExample {
    public static void main(String[] args) {
        BoundedBox<Integer> intBox = new BoundedBox<>(10);
        BoundedBox<Double> doubleBox = new BoundedBox<>(12.5);
        BoundedBox<Float> floatBox = new BoundedBox<>(23.1f);
        BoundedBox<Long> longBox = new BoundedBox<>(100L);
        BoundedBox<Byte> byteBox = new BoundedBox<>((byte) 1);
        BoundedBox<Short> shortBox = new BoundedBox<>((short) 2);

        System.out.println("Integer box: "+ intBox.doubleValue());
        System.out.println("Double box: "+ doubleBox.doubleValue());
        System.out.println("Float box: "+ floatBox.doubleValue());
        System.out.println("Long box: "+ longBox.doubleValue());
        System.out.println("Byte box: "+ byteBox.doubleValue());
        System.out.println("Short box: "+ shortBox.doubleValue());
    }
}
