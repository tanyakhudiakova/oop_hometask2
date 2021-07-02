package com.company;

import java.util.Scanner;

public class Women extends Human {
    public Women() {
        super(false);
    }

    public Women(boolean gender, String name, String surname, float height, float weight) {
        super(gender, name, surname, height, weight);
    }

    @Override
    public String toString() {
        return "Women{} " + super.toString();
    }

    @Override
    boolean speak(Human human) {
        return true;
    }

    @Override
    public boolean tolerateSociety(Human human) {
        if (human.getGender()) {
            double randomNumber = Math.random();
            return randomNumber < 0.05;
        } else {
            double randomNumber = Math.random();
            return randomNumber < 0.7;
        }
    }

    protected Human bornBaby(Human human1) {
        Human baby = null;
        double randomNumber = Math.random();

        if (randomNumber > 0.5) {
            baby = new Man();
        } else {
            baby = new Women();
        }

        System.out.println("Введите, пожалуйста, имя ребенка и нажмите enter: ");
        Scanner scanner = new Scanner(System.in);
        baby.setName(scanner.nextLine());
        baby.setSurname(human1.getSurname());
        if (baby.getGender()) {
            float boyHeight = human1.getHeight() + (0.1f * this.getHeight());
            baby.setHeight(boyHeight);
        } else {
            float girlHeight = this.getHeight() + (0.1f * human1.getHeight());
            baby.setHeight(girlHeight);
        }
        if (baby.getGender()) {
            float boyWeight = human1.getWeight() + (0.1f * this.getWeight());
            baby.setWeight(boyWeight);
        } else {
            float girlWeight = this.getWeight() + (0.1f * human1.getWeight());
            baby.setWeight(girlWeight);
        }
        return baby;
    }
}