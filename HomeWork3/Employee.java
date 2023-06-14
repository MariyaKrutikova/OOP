public abstract class Employee implements Comparable<Employee> {

    protected String name;
    protected String surname;
    protected double salary; // Ставка заработной платы
    protected int age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
    
    public Employee(String name, String surname, double salary, int age) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();

    // @Override
    // public int compareTo(Employee o) {
    //     int res = surname.compareTo(o.surname);
    //     if (res == 0)
    //         return Double.compare(calculateSalary(), o.calculateSalary());
    //     else
    //         return res;
        // return this.calculateSalary() == o.calculateSalary() ? 0 : (this.calculateSalary() > o.calculateSalary() ? 1 : -1);
    // }

     @Override
    public int compareTo(Employee o) {
        int res = surname.compareTo(o.surname);
        if (res == 0)
            return Integer.compare(age, o.age);
        else
            return res;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
