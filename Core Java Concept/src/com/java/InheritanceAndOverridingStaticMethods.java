package com.java;

/*
 * Question - Will static methods be inherited? Can they be overridden?
 * Answer - Yes they can be inherited but they can not be overridden
 * 
 */
class Ai {
    public static void display() {
        System.out.println("Inside static method of superclass");
    }
}

class Bi extends Ai {
    public void show() {
        display();
    }

	/*
	 * public static void display() {
	 * System.out.println("Inside static method of this class"); }
	 */
    
    public void display() {
    	
    }
}

public class InheritanceAndOverridingStaticMethods {
    public static void main(String[] args) {
        Bi b = new Bi();
        // prints: Inside static method of this class
        b.display();

        Ai a = new Bi();
        // prints: Inside static method of superclass
        a.display();
    }
}