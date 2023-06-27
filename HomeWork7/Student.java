package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Student implements Observer {

    private static Random random = new Random();

    private String name;

    private double minSalary;

    private Vacancy studentVacancy;

    public Student(String name, Vacancy studentVacancy) {
        this.name = name;
        minSalary = random.nextDouble(2000, 3000);
        this.studentVacancy = studentVacancy;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, Vacancy vacancy) {
        if (minSalary <= salary & (studentVacancy.equals(vacancy))){
            System.out.printf("Студент %s (%f) >>> Мне нужна работа %s! (%s - %f)\n",
                    name, minSalary, vacancy, nameCompany, salary);
            minSalary = salary;
        }
        else{
            System.out.printf("Студент %s (%f) >>> Я найду работу получше! (%s - %f)\n",
                    name, minSalary, nameCompany, salary);
        }
    }

    public String getName() {
        return name;
    }

    public double getMinSalary() {
        return minSalary;
    }
}
