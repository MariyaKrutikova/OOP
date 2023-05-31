
public class Juice extends Product { //новый продукт - сок
    
    private double volume; // объем сока  
    private String fruit; // фрукт, из которого сделан сок
    
    public Juice() {
        this.brand = "nobrand";
        this.name = "noname";
        this.price = 75;
        this.volume = 0.5;
        this.fruit = "вишня";

    }

    // Конструктор 
    public Juice(String brand, String name, double price, double volume, String fruit) {
        super(brand, name, price);
        if (volume <= 0.2) {
            this.volume = 0.5;
        } else this.volume = volume;

        if (fruit == null) this.fruit = "мультифрукт";
        else this.fruit = fruit;
    }

    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    public String getFruit() {
        return fruit;
    }
    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    @Override
    public String displayInfo() {
        return String.format("[Сок] %s - %s - %f [Объем - %f, фрукт - %s]", brand, name, price, volume, fruit);
    }
    
}
