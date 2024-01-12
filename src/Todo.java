/*
* File: Todo.java
* Author: Németh Angéla
* Copyright: 2024, Németh Angéla
* Group: Szoft II-1-E
* Date: 2024-01-12
* Github: https://github.com/NemethAngela/Paclient
*/

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
