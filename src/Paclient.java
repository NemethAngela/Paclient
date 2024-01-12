/*
* File: Paclient.java
* Author: Németh Angéla
* Copyright: 2024, Németh Angéla
* Group: Szoft II-1-E
* Date: 2024-01-12
* Github: https://github.com/NemethAngela/Paclient
*/

import java.util.ArrayList;

import hu.szit.Convert;

public class Paclient {
    public Paclient() {
        super();

        TodoService service = new TodoService();
        String todos = service.GetTodos();

        ArrayList<Todo> todoList = Convert.toListObject(todos, Todo.class);

        for (Todo todo: todoList){
            System.out.println(todo.title);
        }
    }


}
