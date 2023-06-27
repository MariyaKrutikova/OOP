
package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Specialist implements Observer {
    /*У специалиста появилось поле вакансия*/

    private static Random random = new Random();

    private String name;

    private double minSalary;

    private Vacancy specialistVacancy;
   
    public Specialist(String name, Vacancy specialistVacancy) {
        this.name = name;
        this.specialistVacancy = specialistVacancy;
        minSalary = random.nextDouble(100000, 150000);
    }

    /* Метод проверяет соответствие как зарплаты, так и вакансии */
    @Override
    public void receiveOffer(String nameCompany, double salary, Vacancy vacancy) {
        if (minSalary <= salary & (specialistVacancy.equals(vacancy))) {
            System.out.printf("Специалист %s (%f) >>> Мне нужна работа %s! (%s - %f)\n",
                    name, minSalary, vacancy, nameCompany, salary);
                    minSalary = salary;
        }
        else{
            System.out.printf("Специалист %s (%f) >>> Я найду работу получше! (%s - %f)\n",
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
