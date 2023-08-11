public class ObjectCreation_2 implements ObjectCreation {
    @Override
    public void run() {
        System.out.println("ObjectCreation_1 in interface ");
    }

}

class ObjectCreation_3 implements ObjectCreation {
    @Override
    public void run() {
        System.out.println("ObjectCreation_2 in Interface");
    }
}

class ObjectCreation_4 implements ObjectCreation {
    @Override
    public void run() {
        System.out.println("ObjectCreation_3 in Interface");
    }

}