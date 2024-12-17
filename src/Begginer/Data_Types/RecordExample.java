package Begginer.Data_Types;

record Person(String name, int age) {}

public class RecordExample {
    public static void main(String[] args) {
        Person person = new Person("Coco", 4);

        System.out.println("Name: "+ person.name());
        System.out.println("Age: "+ person.age());
        System.out.println(person);
    }
}
