package ru.geekbrains.lesson5.presenters;

import ru.geekbrains.lesson5.models.Table;

import java.util.ArrayList;
// import java.util.Collection;

public interface View {

    void setObserver(ViewObserver observer);

    void updateTablesView(ArrayList<Table> tables);

    void updateReservationTableResult(int reservationNo);

}
