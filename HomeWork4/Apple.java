
public class Apple extends Fruit{
    
    private static final String sort = "Яблоко";
    private static final float weight = 1.5f;

    public Apple() {
        super(weight, sort);
    }

    @Override
    public String toString() {
        return "Яблоки. Сорт - " + sort + ". Вес одного яблока - " + weight;
    }
    
}
