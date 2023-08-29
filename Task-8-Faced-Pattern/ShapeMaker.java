public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;  // instance of Shape
    private Shape square;

    public ShapeMaker() { // constructor for creating a new Shape

        
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle() {  // another method for drawing.1
        circle.draw();

    }

    public void drawRectangle() { // another method for drawing.2

        rectangle.draw();
    }

    public void drawSquare() {// another method for drawing.3
        square.draw();
    }
}
