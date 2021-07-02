package com.company;

public abstract class Human {
    private final boolean gender;
    private String name;
    private String surname;
    private float height;
    private float weight;

    public Human(boolean gender, String name, String surname, float height, float weight) {
        this.gender = gender;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    protected Human(boolean gender) {
        this.gender = gender;
    }

    abstract boolean speak(Human human);

    abstract boolean tolerateSociety(Human human);

    public boolean spendTimeTogether(Human human) {
        float heightFirstPerson = this.height;
        float heightSecondPerson = human.height;
        float reductionRate = 100 * ((heightFirstPerson - heightSecondPerson) / heightSecondPerson);
        if (Math.abs(reductionRate) > 10) {
            double randomNumber = Math.random();
            return randomNumber < 0.85;
        } else {
            double randomNumber = Math.random();
            return randomNumber < 0.95;
        }
    }


    public Human haveRelationships(Human human) {
        boolean property = (this.speak(human) && this.tolerateSociety(human) && this.spendTimeTogether(human));
        System.out.println("Возможность иметь отноешния для двух людей: " + property);
        if (property) {
            if (this.gender == human.gender) {
                return null;
            } else {
                if (this.gender == true) {
                    return ((Women) human).bornBaby(this);
                } else {
                    return ((Women) this).bornBaby(human);
                }
            }
        } else {
            return null;
        }
    }
    public boolean getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Human{" +
                "gender=" + gender +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

