

public class Cookies extends Product{
    
    private String type;
    private double calorie;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getCalorie() {
        return calorie;
    }
    public void setCalorie(double calorie) {
        this.calorie = calorie;
    }

    public Cookies(String brand, String name, double price, String type, double calorie) {
        super(type, type, calorie);
        if (type == null) this.type = "соленые";
        else this.type = type;
        
        if (calorie <= 0) this.calorie = 355;
        else this.calorie = calorie; 
    }
    
    @Override
    public String displayInfo() {
        return String.format("[Печенье] %s - %s - %f [Тип - %s, калорийность - %s]", brand, name, price, type, calorie);
    }
    
}
