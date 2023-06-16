
import java.util.ArrayList;

public class Box <F extends Fruit> {

    public double sumOfWeigt = 0;
    public int count = 0;
    private String sortgetSort = "Коробка пуста";
    private ArrayList<F> fruits = new ArrayList<F>();

    public Box() {
    }

    public ArrayList<F> getFruits() {
        return fruits;
    }

    public void addFruitToBox(Fruit fruits) {
        if (sortgetSort.equals(fruits.getSort()) || sortgetSort.equals("Empty box") ||
                fruits.getSort().equals("Orange") && sortgetSort.equals("Empty box for Orange") ||
                fruits.getSort().equals("Apple") && sortgetSort.equals("Empty box for Apple")) {
            if (this.fruits.size() == 0) count = 0;
            this.fruits.add((F) fruits);
            sortgetSort = fruits.getSort();
            this.sumOfWeigt = getWeihtOfBox();
        } else {
            System.out.println("В коробке должны быть разные фрукты!");
            System.out.println(fruits.getSort() + " " + sortgetSort);
        }
    }

    public double getWeihtOfBox() {
        for (; count < fruits.size(); count++) {
            sumOfWeigt = sumOfWeigt + fruits.get(count).getWeight();
        }
        if (fruits.size() == 0) sumOfWeigt = 0;
        return sumOfWeigt;
    }

    public boolean compare(Box<F> box) {
        return getWeihtOfBox() == box.getWeihtOfBox();
    }

    public void transferFruitThisBoxToBox(Box<F> toBox, int countMove) {
        if (countMove > fruits.size() || !sortgetSort.equals(toBox.sortgetSort) && !toBox.sortgetSort.equals("Empty box")) return;
        else {
            for (int i = 0; i < countMove; i++) {
                toBox.getFruits().add(fruits.remove(0));
            }
            toBox.sortgetSort = sortgetSort;
            this.sumOfWeigt = getWeihtOfBox();
            toBox.getWeihtOfBox();
            if (fruits.size() == 0) sortgetSort = "Empty box for " + toBox.sortgetSort;

        }
    }

    @Override
    public String toString() {
        return "Box{" +
                "Box weight=" + sumOfWeigt +
                ", sortgetSortOfFruits=" + sortgetSort +
                ", fruits=" + fruits +
                '}';
    }

}
