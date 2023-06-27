package ru.geekbrains.lesson7.observer;

public class Program {


    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     *   добавить новый тип соискателя. +
     *   **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *   **.3 Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();

        // Student student1 = new Student("A");
        // Object student2 = new Student("B");
        // Observer student3 = new Student("C");


        Company geekBrains = new Company("GeekBrains", 70000, jobAgency, Vacancy.TESTER);
        Company google = new Company("Google", 100000, jobAgency, Vacancy.MANAGER);
        Company yandex = new Company("Yandex", 120000, jobAgency, Vacancy.MANAGER);
        Company apple = new Company("Apple", 5000, jobAgency, Vacancy.INTERN);


        Master ivanov = new Master("Ivanov", Vacancy.TESTER);
        Master petrov = new Master("Petrov", Vacancy.DEVELOPER);
        Student sidorov = new Student("Sidorov", Vacancy.INTERN);
        Specialist smirnov = new Specialist("Smirnov", Vacancy.MANAGER);

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(smirnov);

        for (int i = 0; i < 2; i++){
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
            apple.needEmployee();
        }

    }

}
