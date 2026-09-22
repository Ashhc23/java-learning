```java
public class MethodExample {

    // No parameter, no return type
    static void display() {
        System.out.println("hello");
    }

    // Parameter, no return type
    static void greet(String a) {
        System.out.println("hello " + a);
    }

    // No parameter, with return type
    static int display1() {
        return 10;
    }

    // Parameter, with return type
    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        display();

        greet("billa");

        System.out.println(sum(10, 20));

        System.out.println(display1());
    }
}
```
+