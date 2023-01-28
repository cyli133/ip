package duke.command;

import duke.task.TaskList;

public abstract class Commands {
    private int commandIds;
    private String commandStorage;
    public void setCommandStorage(String input) {
        this.commandStorage = input;
    };
    public String getCommandStorage() {
        return this.commandStorage;
    };
    public abstract void execute(TaskList list);
}