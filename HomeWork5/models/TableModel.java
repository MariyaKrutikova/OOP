package ru.geekbrains.lesson5.models;
import ru.geekbrains.lesson5.presenters.Model;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {


    private ArrayList<Table> tables;

    /**
     * Получение списка всех столиков
     * @return
     */
    public ArrayList<Table> loadTables(){
        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     * @return Номер брони
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table table : tables) {
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
    }

    /**TODO: Разработать метод самостоятельно в рамках домашнего задания
     * Поменять бронь столика
     * @return
     */
    
         public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
//          удалить старый резерв
//          добавить новый
          for (Table table : tables) {
            if (table.getNo() == tableNo) {
                ArrayList <Reservation> tableReservList = table.getReservations();
                for (Reservation tableReserv : tableReservList) {
                    if (tableReserv.getId() == oldReservation) {
                        int index = tableReservList.indexOf(tableReserv);
                        tableReservList.remove(index);
                        break;
                    }
                }
                Reservation reservation = new Reservation(reservationDate, name);
                tableReservList.add(reservation);
                return reservation.getId();
            }
        }
        return -1;
     }
        //TODO: Для создания нового резерва столика стоит воспользоваться уже
        // существующим методом reservationTable
    }

