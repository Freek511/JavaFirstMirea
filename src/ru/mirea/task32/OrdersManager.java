package ru.mirea.task32;


import java.io.Serializable;

public interface OrdersManager extends Serializable {
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrders();
    int ordersCostSummary();
    int ordersQuantity();


}
