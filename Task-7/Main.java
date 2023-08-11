public class Main {
    public static void main(String[] args) {
        ObjectCreation obj = new ObjectCreation_2();
        Object obj1 = new Object(obj);
        obj1.Action();

        ObjectCreation obj2 = new ObjectCreation_3();
        Object obj3 = new Object(obj2);
        obj3.Action();

        ObjectCreation obj4 = new ObjectCreation_4();
        Object obj5 = new Object(obj4);
        obj5.Action();
    }
}
