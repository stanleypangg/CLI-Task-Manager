package entities;

public class Task {
    private int id;
    private String title;
    private String description;
    private boolean isCompleted;
    
    public Task(String title, boolean isCompleted) {
        this.title = title;
        this.isCompleted = isCompleted;
    }

    // public int getId() { 
    //     return this.id; 
    // }
    
    public String getTitle() {
        return this.title;
    }

    // public String getDescription() {
    //     return this.description;
    // }
    
    public boolean getIsCompleted() {
        return this.isCompleted;
    }

    // public void setId(int id) {
    //     this.id = id;
    // }

    public void setTitle(String title) {
        this.title = title;
    }

    // public void setDescription(String description) {
    //     this.description = description;
    // }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    @Override
    public String toString() {
        return "Task " + this.id + ": " + this.title + " | " + (this.isCompleted ? "Completed" : "To-Do");
    }
}
