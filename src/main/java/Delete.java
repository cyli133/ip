public class Delete extends Commands{
    public Delete(String str) {
        this.setCommandStorage(str);
    }
    @Override
    public void execute(TaskList list) {
        String content = this.getCommandStorage();
        int taskNumber = Character.getNumericValue(content.charAt(content.length() - 1));
        taskNumber -= 1;
        System.out.println("Noted. I've removed this task:\n" + list.deleteTask(taskNumber));
    }
}
