import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        // Создаем массив котов
        List <Cat> myCats = new ArrayList<>();

        Cat cat1 = new Cat("Tishka", 10 );
        Cat cat2 = new Cat("Vasiliy", 10);
        Cat cat3 = new Cat("Tom", 10);
        Cat cat4 = new Cat("Myrzik", 10);
        Cat cat5 = new Cat("Belosnegka", 10);

        myCats.add(cat1);
        myCats.add(cat2);
        myCats.add(cat3);
        myCats.add(cat4);
        myCats.add(cat5);

       
        Plate plate = new Plate(50);
        // plate.info();
        
        /*Демонстрация работы первых двух заданий. */
        System.out.println("Первое и второе задания: ");
        plate.info();
        cat1.eat(plate);
        plate.info();
        cat1.catInfo();

        /*Демонстрация работы третьего задания.*/
        System.out.println();
        System.out.println("Третье задание: ");
        for (Cat cat : myCats) {
            cat.eat(plate);
            plate.info();
            cat.catInfo();
            System.out.println();
        }    

    /* Демонстрация работы четвертого задания. Каждый раз переходя к новому коту проверяем, хватит ли в тарелке еды. 
    Если еды не хватает, то в тарелку добавляем еды и кормим кота*/
    System.out.println();
    System.out.println("Четвертое задание: ");
    for (Cat cat : myCats) {
        if (plate.getFood() >= cat.getAppetite()) {
            cat.eat(plate);
            plate.info();
            cat.catInfo();
            System.out.println();
        }
        else {            
            plate.putFood(plate.getFood(), cat.getAppetite() - plate.getFood());
            plate.info();
            cat.eat(plate);
            plate.info();
            cat.catInfo();
            System.out.println();
        }       
    }
}
}