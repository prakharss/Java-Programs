import java.util.*;

class A {
    public static void display() {
        System.out.println("Inside static method of superclass");
    }
}

class B extends A {
    public void show() {
        display();
    }

    public static void display() {
        System.out.println("Inside static method of this class");
    }
}

public class Solution {
    public static void main(String[] args) {
        B b = new B();
        // prints: Inside static method of this class
        b.display();

        A a = new B();
        // prints: Inside static method of superclass
        a.display();
    }
}