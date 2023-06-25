package ru.geekbrains.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {

    // private  Scanner scanner = new Scanner(System.in);

    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public Order() {
    }

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    // public void saveToJson() {
    //     String fileName = "order.json";
    //     // String fileName1 = "order.txt";
    //     try (FileWriter writer = new FileWriter(fileName, false)) {
    //         // writer.write("{\n");
    //         writer.write("\"clientName\":\""+ clientName + "\",\n");
    //         writer.write("\"product\":\""+product+"\",\n");
    //         writer.write("\"qnt\":"+qnt+",\n");
    //         writer.write("\"price\":"+price+"\n");
    //         // writer.write("}\n");
    //         writer.flush();
    //     } catch (IOException ex) {
    //         System.out.println(ex.getMessage());
    //     }
    // }

    // public void inputFromConsole(){
    //     clientName = prompt("Имя клиента: ");
    //     product = prompt("Продукт: ");
    //     qnt = Integer.parseInt(prompt("Кол-во: "));
    //     price = Integer.parseInt(prompt("Цена: "));
    // }

    // private String prompt(String message){
    //     System.out.println(message);
    //     return scanner.nextLine();
    // }

   
    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
