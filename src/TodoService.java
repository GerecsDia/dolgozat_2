
/*
* Author: Gerecs Diána
* Copyright: 2024, Gerecs Diána
* Group: Szoft II/1/E
* Date: 2024-01-15
* Github: https://github.com/GerecsDia/dolgozat_2
* Licenc: GNU GPL
*/
import hu.szit.Client;

public class TodoService {
    String url;
    Client client;

    public TodoService() {
        url = "https://jsonplaceholder.typicode.com/todos";
        client = new Client();
        System.out.println("REST API lekérdezése");

    }

    public String getTodosFromApi() {
        return "Yeah";
    }

    public String getTodos() {
        return client.get(url);

    }

    public String addTodos(String json) {
        return client.post(url, json);

    }
}
