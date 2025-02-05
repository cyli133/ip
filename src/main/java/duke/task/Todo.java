package duke.task;

import duke.UI.TextOutput;

/**
 * Represents task of the type 'Todo'.
 */
public class Todo extends Task {

    /**
     * Constructs a new Todo objcet with the given content and state.
     * @param content The content of the Todo object.
     * @param isDone The state of the Todo object.
     */
    public Todo(String content, boolean isDone) {
        super(content, isDone);
        this.taskType = taskType.T;
        this.time = null;
    }

    /**
     * Returns the string representation of Todo object.
     * @return String representation of Todo object.
     */
    @Override
    public String toString() {
        return "[" + this.getTypeIcon() + "]"
                + "[" + this.getStatusIcon() + "] " + this.getTaskContent();
    }

    @Override
    public String updateTaskTime(String ... dates) {
        return TextOutput.makeDisplayFailString();
    }
}
