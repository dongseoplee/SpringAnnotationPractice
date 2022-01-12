package myannotation;

import java.lang.reflect.Method;

public class MyMain {
    public static void main(String[] args) {
        Method[] methodList = MyService.class.getMethods();

        for(Method m : methodList) {
            if(m.isAnnotationPresent(MyAnnotation.class)) {
                System.out.println(m.getName()); //Print method name.
                MyAnnotation annotation = m.getDeclaredAnnotation(MyAnnotation.class);

                //The value varies depending on the method.
                String value = annotation.value();
                int number = annotation.number();
                for(int i = 0; i < number; i++) {
                    System.out.print(value);
                }
                System.out.println();
            }
        }
    }
}