package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите данные для первого человека: ");
        Human person1 = getNewPerson();
        System.out.println("Пожалуйста, введите данные для второго человека: ");
        Human person2 = getNewPerson();
        System.out.println("Человек1 = " + person1);
        System.out.println("Человек2= " + person2);
        System.out.println("Человек1 может говорить с Человеком2 : " + person1.speak(person2));
        System.out.println("Человек1 может выдерживать общество Человека2 : " + person1.tolerateSociety(person2));
        System.out.println("Человек1 может проводить время с Человеком2 : " + person1.spendTimeTogether(person2));
        Human resultOfRelations = person1.haveRelationships(person2);
        if (resultOfRelations != null) {
            System.out.println("Результат отношений : " + resultOfRelations);
        } else {
            System.out.println("Не подошли друг другу и разбежались :С ");
        }


    }

    private static Human getNewPerson() {
        System.out.println("Выберете пол: (если мужчина, то введите true, а если женщина, то введите false и нажмите enter)");
        Scanner scanner = new Scanner(System.in);
        Boolean setGender = Boolean.parseBoolean(scanner.nextLine());
        Human person;
        if (setGender == true) {
            person = new Man();
        } else {
            person = new Women();
        }
        System.out.println("Введите имя человека и нажмите enter: ");
        person.setName(scanner.nextLine());
        System.out.println("Введите фамилию человека и нажмите enter: ");
        person.setSurname(scanner.nextLine());
        System.out.println("Введите рост человека и нажмите enter: ");
        person.setHeight(Integer.parseInt(scanner.nextLine()));
        System.out.println("Введите вес человека и нажмите enter: ");
        person.setWeight(Integer.parseInt(scanner.nextLine()));

        return person;
    }
}