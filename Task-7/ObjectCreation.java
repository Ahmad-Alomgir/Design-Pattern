public interface ObjectCreation {
    void run();
    // interface creation
}

class Object { // instance of interface
    private ObjectCreation creation;

    public Object(ObjectCreation creation) {
        this.creation = creation;
        // Constructor
    }

    public void Action() {
        creation.run();
        // Method creation
    }

}
