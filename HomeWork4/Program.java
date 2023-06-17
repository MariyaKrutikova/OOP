
public class Program {

        public static void main(String[] args) {

            // Создаем несколько яблок. Создаем коробку
            Apple apple1 = new Apple();
            Apple apple2 = new Apple();
            Apple apple3 = new Apple();
            Box <Fruit> appleBox = new Box<>();
            // Кладем яблоки в коробку
            appleBox.addFruitToBox(apple1);                    
            appleBox.addFruitToBox(apple2);                    
            appleBox.addFruitToBox(apple3);


            // Создаем несколько апельсинов. Создаем коробку
            Orange orange1 = new Orange();
            Orange orange2 = new Orange();
            Orange orange3 = new Orange();
            Box <Fruit> orangeBox = new Box<>();
            // Кладем апельсины в коробку
            orangeBox.addFruitToBox(orange1);                    
            orangeBox.addFruitToBox(orange2);                    
            orangeBox.addFruitToBox(orange3);


            // Создаем пустую коробку и перекладуваем в нее апельсины\яблоки из orangeBox
            Box <Fruit> emptyBox1 = new Box<>();       
            orangeBox.fromBoxToBox(emptyBox1);          
            System.out.println(emptyBox1.toString()); 
            System.out.println(orangeBox.toString());
            System.out.println();

            Box <Fruit> emptyBox2 = new Box<>();       
            appleBox.fromBoxToBox(emptyBox2);          
            System.out.println(emptyBox2.toString()); 
            System.out.println(orangeBox.toString());
            System.out.println();

            // Из коробки с апельсинами перекладываем апельсины в котобку с яблоками
            emptyBox1.fromBoxToBox(emptyBox2);
            System.out.println();

            // Сравнение двух коробок
            System.out.println(emptyBox1.compare(emptyBox2));
            System.out.println(appleBox.compare(orangeBox));
                    

    
            
            

        }

}

