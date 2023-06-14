import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import javax.sound.sampled.SourceDataLine;

public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     * @return
     */
    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int age = random.nextInt(18, 65);
        int salary = random.nextInt(10000, 20000);
        int hours = random.nextInt(8, 40);
        // Freelancer freelancer = new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(3)], salary);
        // Worker woker = new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(3)], random.nextInt(20000, 80000));
        
        Random rnd = new Random();
        int num = rnd.nextInt(1,3); 
        Employee employee;
        if (num == 1) {
            // employee = new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], random.nextInt(20000, 80000), age);
            employee = new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(3)], random.nextInt(20000, 80000), age); 
        }
        else 
            // employee = new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salary, age, hours);
            employee = new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(3)], salary, age, hours);
        return employee;
        }
                
    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *  Придумать несколько Comparator'ов для сортировки сотрудников
     *  по фамилии + имени или по возрасту и уровню ЗП.
     * @param args
     */
    public static void main(String[] args) {
                   
        // Freelancer freelancer = new Freelancer("Акакий", "Кукушкин", 40, 8);
        // // double salaryOfFreelancer = freelancer.calculateSalary();
        // // System.out.println(salaryOfFreelancer);
        // System.out.println(freelancer.toString());

       
        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++){
            employees[i] = generateEmployee();
        }

        Arrays.sort(employees); // new SalaryComparator()
        
        for(Employee employee : employees){
            System.out.println(employee);
        }

    }
}

