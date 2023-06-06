public class Plate {

    private int food;
    
    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("В тарелке еды, ед.: " + food);
    }

    public int getFood() {
        return food;
    }

    /*Метод, добавляющий в тарелку еду */ 
    public void putFood(int food, int newFood) {       
            this.food = food + newFood;             
    }

    // Метод, устанавливающий изначальное количество еды в тарелке, кот из нее не ел. Обычный сеттер.
    public void setFood(int food) {
        this.food = food;
    }
    
       
}
