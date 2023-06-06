public class Cat {
   
    private String name;
    private int appetite;
    private boolean satiety = false;
    
    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    
    /* Метод, заставляющий кота кушать. В качестве арнгумента получает тарелку с едой. 
    Если еды хватит, то кот становится сытым, количество еды в тарелке изменяется.*/
    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            satiety = true;
            System.out.println("Кот " + name +  " наелся");
            plate.setFood(plate.getFood() - appetite);           
        }
        else System.out.println("Коту "+ name + " не хватает еды");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

     // Метод, показывающий сытость кота.
     public void catInfo() {
        System.out.println("Кот " + name + " satiety = " + satiety);
    }
}
