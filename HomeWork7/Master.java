package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Master implements Observer {

    /*У мастера появилось поле вакансия*/

    private static Random random = new Random();

    private String name;

    private double minSalary;

    private Vacancy masterVacancy;

    public Master(String name, Vacancy masterVacancy) {
        this.name = name;
        this.masterVacancy = masterVacancy;
        minSalary = random.nextDouble(80000, 100000);
    }

    /* Метод проверяет соответствие как зарплаты, так и вакансии */
    @Override
    public void receiveOffer(String nameCompany, double salary, Vacancy vacancy) {
        if (minSalary <= salary & (masterVacancy.equals(vacancy))){
            System.out.printf("Мастер %s (%f) >>> Мне нужна работа %s! (%s - %f)\n",
                    name, minSalary, vacancy, nameCompany, salary);
            minSalary = salary;
        }
        else{
            System.out.printf("Мастер %s (%f) >>> Я найду работу получше! (%s - %f)\n",
                    name, minSalary, nameCompany, salary);
        }
    }

    public String getName() {
        return name;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public Vacancy getMasterVacancy() {
        return masterVacancy;
    }

}
