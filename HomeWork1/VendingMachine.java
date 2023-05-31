
// import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private final List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public  BottleOfWater getBottleOfWater(double volume){ 
        for(Product product : products){
            if (product instanceof BottleOfWater){
               if ( ((BottleOfWater)product).getVolume()  == volume){
                   return (BottleOfWater)product;
               }
            }
        }
        return null;
    }

    public Juice getJuice(String fruit) {
        for (Product product : products) {
            if (product instanceof Juice) {
                if (((Juice)product).getFruit() == fruit) {
                    return (Juice)product;
                }
            }
        }
        return null;
    }

    public Cookies getCookies (String type) {
        for (Product product : products) {
            if (product instanceof Cookies) {
                if (((Cookies)product).getType() == type) {
                    return (Cookies)product;
                }
            }
        }
        return null;
    }

}
