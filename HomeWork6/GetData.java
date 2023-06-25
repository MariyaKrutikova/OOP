package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

public class GetData {

    private  Scanner scanner = new Scanner(System.in);
    private Order order;

    public GetData(Order order) {
        this.order = order;
    }

    public void inputFromConsole(){
        order.setClientName(prompt("Имя клиента: "));
        order.setProduct(prompt("Продукт: "));
        order.setQnt(Integer.parseInt(prompt("Кол-во: ")));
        order.setPrice(Integer.parseInt(prompt("Цена: ")));
    }

    private String prompt(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
}
