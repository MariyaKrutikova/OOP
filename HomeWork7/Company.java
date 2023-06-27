package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Company {

    private static Random random = new Random();
    private String nameCompany;
    private  double maxSalary;
    private Vacancy vacancy;

    private Publisher jobAgency;

    public Company(String nameCompany, double maxSalary, Publisher jobAgency, Vacancy vacancy) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        this.vacancy = vacancy;
    }

    public void needEmployee(){
        double salary = random.nextDouble(2500, 150000);
        jobAgency.sendOffer(nameCompany, salary, vacancy);
    }

}
