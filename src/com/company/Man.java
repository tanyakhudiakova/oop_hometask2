package com.company;

public class Man extends Human {

    public Man() {
        super(true);

    }

    public Man(boolean gender, String name, String surname, float height, float weight) {
        super(gender, name, surname, height, weight);
    }

    @Override
    public String toString() {
        return "Man{} " + super.toString();
    }

    @Override
    boolean speak(Human human) {
        if (!human.getGender()) {
            return true;
        } else {
            double randomNumber = Math.random();
            return randomNumber < 0.5;
        }
    }

    @Override
    public boolean tolerateSociety(Human human) {
        if (human.getGender()) {
            double randomNumber = Math.random();
            return randomNumber < 0.056;
        } else {
            double randomNumber = Math.random();
            return randomNumber < 0.7;
        }

    }
}