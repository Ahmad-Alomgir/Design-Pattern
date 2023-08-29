public interface Shape{

    void draw();  // method to draw

}
class Circle implements Shape{
@Override
public  void draw(){

    System.out.println("Circle.....");
}

}
class Rectangle implements Shape{
@Override
public  void draw(){
    System.out.println("Rectangle.....");
}

}
class Square implements Shape{
    @Override
    public void draw(){
        System.out.println("Square.....");
    }
}