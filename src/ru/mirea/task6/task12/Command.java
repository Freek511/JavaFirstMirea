
package ru.mirea.task6.task12;

public interface Command // интерфейс одной команды
{
    void execute(String str, int...args);
    void undo();
}
