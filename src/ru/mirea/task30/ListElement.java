package ru.mirea.task30;

import ru.mirea.task29.Item;

public class ListElement {
    MenuItem item;
    ListElement prevItem;
    ListElement nextItem;

    ListElement(MenuItem item, ListElement parent){
        this.item = item;
        this.prevItem = parent;
    }
}
