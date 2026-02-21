abstract public class Item {
    protected String title;
    protected int id;

abstract void displayInfo();

 public String getTitle() {
        return title;
    }

 public int getId() {
        return id;
    }
}
