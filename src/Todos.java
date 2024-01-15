
/*
* Author: Gerecs Diána
* Copyright: 2024, Gerecs Diána
* Group: Szoft II/1/E
* Date: 2024-01-15
* Github: https://github.com/GerecsDia/dolgozat_2
* Licenc: GNU GPL
*/

public class Todos {
    int userId;
    int id;
    String title;
    String completed;

    public Todos() {
    }

    public Todos(String title) {
        this.title = title;
    }

    public Todos(String title, String completed) {
        this.title = title;
        this.completed = completed;
    }

    public Todos(int userId, int id, String title, String completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }
}
