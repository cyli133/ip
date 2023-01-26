public class Deadline extends Tasks {
    private String date = "";
    public Deadline(String content, boolean isDone, String date) {
        super(content, isDone);
        this.date = date;
        this.type = 'D';
    }
    @Override
    public String getDuration() {
        return this.date;
    }

    @Override
    public String toString() {
        return "[" + this.getTypeIcon() + "]"
                + "[" + this.getStatusIcon() + "] " + this.seeTaskContent() + "(by: " + this.date + ")";
    }
}
