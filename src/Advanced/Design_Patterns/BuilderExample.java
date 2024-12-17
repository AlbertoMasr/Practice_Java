package Advanced.Design_Patterns;

class Car {
    private String engine;
    private String color;

    public static class Builder {
        private String engine;
        private String color;

        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }

    private Car(Builder builder) {
        this.engine = builder.engine;
        this.color = builder.color;
    }

    @Override
    public String toString() {
        return "Car [color=" + color + ", engine=" + engine + "]";
    }
}

public class BuilderExample {
    public static void main(String[] args) {
        Car car = new Car.Builder().color("Red").engine("V8").build();
        System.out.println(car);

        Car car2 = new Car.Builder().color("Blue").engine("V6").build();
        System.out.println(car2);
    }
}
