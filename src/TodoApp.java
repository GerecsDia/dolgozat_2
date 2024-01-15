/* 
* Author: Gerecs Diána
* Copyright: 2024, Gerecs Diána
* Group: Szoft II/1/E
* Date: 2024-01-15
* Github: https://github.com/GerecsDia/dolgozat_2
* Licenc: GNU GPL
*/

import java.util.ArrayList;
import hu.szit.Convert;

public class TodoApp {

    TodoService todoService;

    public TodoApp() {
        todoService = new TodoService();
        getTodos();
    }

    public void getTodos() {
        String todosJson = todoService.getTodos();
        ArrayList<Todos> todosList = Convert.toListObject(todosJson, Todos.class);

        for (Todos todo : todosList) {
            System.out.println("ID: " + todo.id);
            System.out.println("UserID: " + todo.userId);
            System.out.println("Title: " + todo.title);
            System.out.println("Completed: " + todo.completed);
            System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) {
        new TodoApp();
    }
}
