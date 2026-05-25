package org.example;

public class CalebAstudillo {
    int age;
    int carreer;

    CalebAstudillo(int age, int carreer) {
        this.age = age;
        this.carreer = carreer;
    }

    void sayHi() {
        System.out.println("Hello I have " + age + "and I study " + carreer);
    }
    void sayGoodbye() {
        System.out.println("Goodbye!");
    }
}
