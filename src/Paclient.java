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
