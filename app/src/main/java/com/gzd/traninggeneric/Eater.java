package com.gzd.traninggeneric;

public class Eater<T extends Food> {
    void eat(T food) {
        food.eaten();
    }
}
