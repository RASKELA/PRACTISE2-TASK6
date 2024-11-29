package org.practise2.task3;

public class CopyCommand extends AbstractCommand {
    @Override
    public void execute() {
        // Реализация копирования данных
        System.out.println("Данные скопированы.");
    }

    @Override
    public void undo() {
        // Отмена копирования
        System.out.println("Отмена операции копирования.");
    }
}