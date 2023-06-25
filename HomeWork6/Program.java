package ru.geekbrains.lesson6.srp2;

public class Program {


    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {

        Order order1 = new Order("Ivan", "book", 2, 150);
        SaveFile file1 = new SaveFile(order1);
        file1.saveToTxt();


        Order order2 = new Order("Mary", "dress", 2, 500);
        SaveFile file2 = new SaveFile(order2);        
        file2.saveToJson();

        Order order3 = new Order("John", "bag", 1, 900);
        SaveFile file3 = new SaveFile(order3);        
        file3.saveToXML();

        Order order4 = new Order();
        GetData data = new GetData(order4);
        data.inputFromConsole();

        SaveFile file4 = new SaveFile(order4);
        file4.saveToPDF();          
        
    }
}
