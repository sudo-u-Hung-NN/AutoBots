import java.util.ArrayList;

public class TaskShelf {
    private int ID;
    private point location;
    private ArrayList<Task> TaskList = new ArrayList<Task>();

    // Methods
    public int getID() {return ID; }

    public void setID(int ID) {this.ID = ID; }

    public point getLocation() {return location; }

    public void setLocation(point location) {this.location = location; }

    public void insertShelf(Task t){
        this.TaskList.add(t);
    }

    public Task getTask(){
        Task t = this.TaskList.get(0);
        this.TaskList.remove(0);
        return t;
    }

    public boolean isEmpty(){
        return TaskList.isEmpty();
    }

    public void requestTaking(Network net){

    }

    // Constructor
    public TaskShelf(int ID){
        setID(ID);
    }

}