import java.util.ArrayList;

public class Box <T extends Fruit> {

@Override
    public String toString() {
        return "В коробке фрукт - " + name + ", вес коробки = " + boxWeight;
    }

public ArrayList <T> fruits = new ArrayList<>(); /*Список, в котором будут храниться фрукты T*/
public float boxWeight = 0;
private String name = "В коробке нет фруктов";

public Box() {
}

// Метод определения веса коробки
// getWeight() вычисление веса коробки
public float getBoxWeight() {
    if (fruits.size() > 0) {
        for (int i = 0; i < fruits.size(); i++) {
            boxWeight = boxWeight + fruits.get(i).getWEIGHT();
            // System.out.println("Вес яблока и вес коробки:");
            // System.out.println(fruits.get(i).getWEIGHT());
            // System.out.println(boxWeight);
        }
    }    
    else {
        System.out.println("В коробке нет фруктов.");
    }
    return boxWeight;   
}

// compare() сравнение текущей коробки с заданной
public boolean compare(Box<T> box) {
    return box.getBoxWeight() == getBoxWeight();
}
    
// Метод добавления фруктов в коробку
public void addFruitToBox(T fruit) {
    if (name.equals(fruit.getTYPE()) || name.equals("В коробке нет фруктов")) {
        fruits.add(fruit);
        name = fruit.getTYPE();
        this.boxWeight = boxWeight + 1;
        // System.out.println("Вес коробки:");
        // System.out.println(boxWeight);
    }
    else 
        System.out.println("Эта коробка для других фруктов: " + fruit.getTYPE());
        // System.out.println();
}


// addFruitsToBox() пересыпаение фруктов из текущей в заданную
public void fromBoxToBox(Box<T> intoBox) {
    // System.out.println(name); 
    // System.out.println(intoBox.getName());
    if (name.equals(intoBox.getName()) || intoBox.getName().equals("В коробке нет фруктов"))  { 
        for (int i = 0; i < fruits.size(); i++) { 
           intoBox.addFruitToBox(fruits.get(i));
        //    System.out.println(intoBox.getFruits());
        //    fruits.remove(i);              
        }  
        fruits.clear(); 
        name = "В коробке нет фруктов";
        this.boxWeight = 0;
        // System.out.println(intoBox.getFruits());
        // System.out.println(name); 
        // System.out.println(intoBox.getName());
    }
    else System.out.println("Переложить фрукты не возможно. Это коробка с другими фруктами.");
}
    

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public String getName() {
        return name;
    }


}
