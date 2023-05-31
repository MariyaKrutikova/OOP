
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Product product1 = new Product();
        product1.brand = "ООО Чистый Источник";
        product1.name = "Бутылка с водой";
        product1.price = 125.15;
        System.out.println(product1.displayInfo());

        Product product2 = new Product("ООО Чистый Источник", "Бутылка с водой #2", -90.15);
        //product2.brand = "ООО Чистый Источник";
        //product2.name = "__";
        //product2.price = -15;
        product2.setPrice(30);
        System.out.println(product2.displayInfo());

        BottleOfWater bottleOfWater1 =
                new BottleOfWater("ООО Чистый Источник", "Бутылка с водой #3", -90.15, 1.5);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfMilk
                = new BottleOfMilk("ООО Чистый Источник", "Бутылка с молоком #1", -90.15, 1.5, 10);
        System.out.println(bottleOfMilk.displayInfo());

        // Создан новый продукт juice1. См. класс Juice
        Product juice1 = new Juice("ООО Соки", "J7", 135.00, 0, null);
        System.out.println(juice1.displayInfo());

        // Создан новый продукт juice2. Использован конструктор по умолчанию. См. класс Juice
        Juice juice2 = new Juice();
        System.out.println(juice2.displayInfo());

        Cookies cookies1 = new Cookies("АО ВашаПеченька", "Cheese", 0, "С сыром", 0);
        System.out.println(cookies1.displayInfo());

        List <Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(bottleOfWater1);
        products.add(bottleOfMilk);
        products.add(juice1);
        products.add(juice2);
        products.add(cookies1);

        VendingMachine vendingMachine = new VendingMachine(products);

        // BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(1.5);
        // if (bottleOfWaterResult != null){
        //     System.out.println("Вы купили:");
        //     System.out.println(bottleOfWaterResult.displayInfo());
        // }
        // else {
        //     System.out.println("Такой бутылки с водой нет в автомате.");
        // }

        Juice myJuice = vendingMachine.getJuice("мультифрукт");
        if (myJuice != null) {
            System.out.println("Вы купили: " + myJuice.displayInfo());
        }

        Cookies myCookie = vendingMachine.getCookies("С сыром");
        if (myCookie != null) System.out.println("Вы купили: " + myCookie.displayInfo());
    }
}
