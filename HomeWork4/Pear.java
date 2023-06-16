public class Pear extends Fruit {

    public Pear(float weight, String sort) {
        super(weight, sort);
    }

    @Override
    public String toString() {
        return "Груши. Сорт - " + sort + ". Вес одной груши - " + weight;
    }
    
}
