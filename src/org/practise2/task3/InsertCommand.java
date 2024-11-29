package org.practise2.task3;

public class InsertCommand extends AbstractCommand {
    private String text;
    private String windowToInsert;

    public InsertCommand(String text, String windowToInsert) {
        this.text = text;
        this.windowToInsert = windowToInsert;
    }

    @Override
    public void execute() {
        // Реализация вставки текста
        System.out.println("Текст \"" + text + "\" вставлен в окно \"" + windowToInsert + "\".");
    }

    @Override
    public void undo() {
        // Отмена вставки текста
        System.out.println("Вставка текста \"" + text + "\" в окно \"" + windowToInsert + "\" отменена.");
    }
}