package org.practise2.task3;

public class CutCommand extends AbstractCommand {
    private String text;
    private int startLine;

    public CutCommand(String text, int startLine) {
        this.text = text;
        this.startLine = startLine;
    }

    @Override
    public void execute() {
        // Реализация вырезания текста
        System.out.println("Текст \"" + text + "\" вырезан с линии " + startLine + ".");
    }

    @Override
    public void undo() {
        // Восстановление вырезанного текста
        System.out.println("Текст \"" + text + "\" восстановлен на линию " + startLine + ".");
    }
}