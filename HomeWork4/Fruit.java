
public abstract class Fruit {

    private final float WEIGHT;
    private final String TYPE;
    
    public Fruit(float WEIGHT, String TYPE) {
        this.WEIGHT = WEIGHT;
        this.TYPE = TYPE;
    }

    public float getWEIGHT() {
        return WEIGHT;
    }

    public String getTYPE() {
        return TYPE;
    }

    @Override
    public String toString() {
        return "Фрукт [WEIGHT = " + WEIGHT + ", вид фрукта = " + TYPE + "]";
    }


}
