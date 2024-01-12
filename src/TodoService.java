/*
* File: TodoService.java
* Author: Németh Angéla
* Copyright: 2024, Németh Angéla
* Group: Szoft II-1-E
* Date: 2024-01-12
* Github: https://github.com/NemethAngela/Paclient
*/

import hu.szit.Client;

public class TodoService {
    String url;
    Client client;

    public TodoService()
    {
        url = "https://jsonplaceholder.typicode.com/todos";
        client = new Client();
    }

    public String GetTodos(){
        return client.get(url);
    }
}
