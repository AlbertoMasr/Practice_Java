package Advanced.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value();
}

public class AnnotationExample {
    @MyAnnotation("This a custom annotation")
    public void myMethod() {
        System.out.println("This is a method");
    }

    public static void main(String[] args) {
        AnnotationExample obj = new AnnotationExample();
        obj.myMethod();
    }
}
