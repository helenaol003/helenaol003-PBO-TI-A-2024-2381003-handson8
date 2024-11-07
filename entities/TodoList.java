package entities;

public class TodoList {
    private String todo;

    public String getTodo() {
        return todo;
    }

    public void setTodo(final String todo) {
        this.todo = todo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
}
