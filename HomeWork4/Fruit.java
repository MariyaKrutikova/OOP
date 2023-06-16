
public abstract class Fruit {

    protected final float weight;
    protected final String sort;

    
    public Fruit(float weight, String sort) {
        this.weight = weight;
        this.sort = sort;
    }

    public float getWeight() {
        return weight;
    }

    public String getSort() {
        return sort;
    }


    @Override
    public String toString() {
        return "Fruit [weight=" + weight + ", sort=" + sort + "]";
    }


    }
