package org.example;

public class chava {
    int año;
    int carrera;

    chava(int año, int carrera) {
        this.año = año;
        this.carrera = carrera;
    }

    void sayHi() {
        System.out.println("Hola tengo: " + año + "y estudio " + carrera);
    }
}
