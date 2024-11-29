package org.practise2.task3;

public class Main {
    public static void main(String[] args) {
        WindowController controller = new WindowController();

        CopyCommand copyCommand = new CopyCommand();
        CutCommand cutCommand = new CutCommand("Маршрут №5", 2);
        InsertCommand insertCommand = new InsertCommand("Информация о маршруте", "Окно маршрутов");

        controller.addCommand(copyCommand);
        controller.addCommand(cutCommand);
        controller.addCommand(insertCommand);

        controller.executeAllPendingCommands();

        controller.undoChanges(2);
    }
}