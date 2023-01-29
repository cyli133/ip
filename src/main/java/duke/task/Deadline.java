package duke.task;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Locale;

/**
 * This class represents task of the type 'deadline'.
 */
public class Deadline extends Tasks {
    private LocalDateTime time = null;

    /**
     * Construct a new Deadline instance with the given content, date and isDone state.
     * This method stores the string data as a LocalDateTime object.
     * @param content
     * @param date
     * @param isDone
     */
    public Deadline(String content, String date, boolean isDone) {
        super(content, isDone);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d/MM/yyyy HHmm");
        format.withLocale(Locale.ENGLISH);
        this.time = LocalDateTime.parse(date, format);
        this.type = 'D';
    }

    /**
     * This method returns the string representation of the Deadline object.
     * @return String
     */
    @Override
    public String toString() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm");
        String time = this.time.format(format);
        return "[" + this.getTypeIcon() + "]"
                + "[" + this.getStatusIcon() + "] " + this.seeTaskContent() + " (by: " + time + ")";
    }
}
