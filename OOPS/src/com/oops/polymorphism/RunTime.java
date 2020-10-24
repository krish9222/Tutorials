package com.oops.polymorphism;

class Test { 
    // Implementing a method 
    public void method() 
    { 
        System.out.println("Method 1"); 
    } 
}

class Test2 extends Test { 
    // Implementing a method 
    public void method() 
    { 
        System.out.println("Method 2"); 
    } 
}

public class RunTime {  
    // Driver code 
    public static void main(String args[]) 
    { 
        Test test = new Test2(); 
  
        test.method(); 
    } 
}
