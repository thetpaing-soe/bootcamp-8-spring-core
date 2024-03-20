package org.example;

class Parent{

    int num = 1000;

    public Parent() {
        doSomething();
    }

    public void doSomething() {
        System.out.println(num);
    }
}
public class MyClass extends Parent {

    int num = 10;

    public MyClass() {
        super();
    }

    @Override
    public void doSomething() {
        System.out.println(num);
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.doSomething();
    }
}
