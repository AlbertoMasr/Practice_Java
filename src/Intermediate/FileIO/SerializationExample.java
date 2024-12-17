package Intermediate.FileIO;

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person {name=" + name + ", age=" + age + "}";
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/Intermediate/FileIO/person.ser"))) {
            Person person = new Person("Coco", 4);
            oos.writeObject(person);
            System.out.println("Person object has been serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/Intermediate/FileIO/person.ser"))) {
            Person person = (Person) ois.readObject();
            System.out.println("Person object has been deserialized.");
            System.out.println(person);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
