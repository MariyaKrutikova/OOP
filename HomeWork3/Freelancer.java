/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания.
 *  *20*8
 */

public class Freelancer extends Employee {

    double workTime;

    public Freelancer(String name, String surname, double salary, int age, double workTime) {
        super(name, surname, salary, age);
        this.workTime = workTime;
    }

    public Freelancer(String name, String surname, double salary, int age) {
        super(name, surname, salary, age);     
    }

    @Override
    public double calculateSalary() {
        return salary * workTime;
        // return workTime;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Возраст %d; Заработная плата за месяц: %.2f (руб.)",
        surname, name, age, calculateSalary());
    }
}
