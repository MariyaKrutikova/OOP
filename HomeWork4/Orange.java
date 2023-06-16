public class Orange extends Fruit {

    private static final String sort = "Апельсин";
    private static final float weight = 2.2f;

    public Orange() {
        super(weight, sort);
    }

    @Override
    public String toString() {
        return "Апельсины. Сорт - " + sort + ". Вес одного апельсина - " + weight;
    }

    

    
}
