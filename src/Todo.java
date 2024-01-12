public class Todo {
    int userId;
    int id;
    String title;
    Boolean completed;

    public Todo(int userId, int id, String title, Boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }
}
