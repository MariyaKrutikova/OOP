package ru.geekbrains.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;

public class SaveFile {

    private Order order;

    public SaveFile(Order order) {
        this.order = order;
    }

    public void saveToJson() {
        String fileName = "order.json";        
        try (FileWriter writer = new FileWriter(fileName, false)) {
            // writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+ order.getProduct() +"\",\n");
            writer.write("\"qnt\":"+ order.getQnt() +",\n");
            writer.write("\"price\":"+ order.getPrice() +"\n");
            // writer.write("}\n");
            writer.flush();
        } 
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saveToTxt() {
        String fileName = "order.txt";        
        try (FileWriter writer = new FileWriter(fileName, false)) {            
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+ order.getProduct() +"\",\n");
            writer.write("\"qnt\":"+ order.getQnt() +",\n");
            writer.write("\"price\":"+ order.getPrice() +"\n");
            writer.flush();
        } 
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saveToXML() {
        String fileName = "order.xml";        
        try (FileWriter writer = new FileWriter(fileName, false)) {            
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+ order.getProduct() +"\",\n");
            writer.write("\"qnt\":"+ order.getQnt() +",\n");
            writer.write("\"price\":"+ order.getPrice() +"\n");
            writer.flush();
        } 
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saveToPDF() {
        String fileName = "order.pdf";        
        try (FileWriter writer = new FileWriter(fileName, false)) {
            // writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+ order.getProduct() +"\",\n");
            writer.write("\"qnt\":"+ order.getQnt() +",\n");
            writer.write("\"price\":"+ order.getPrice() +"\n");
            // writer.write("}\n");
            writer.flush();
        } 
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
