package factorypattern;
public class FactoryPattern {
    public static void main(String[] args) {
        //Creating the factory object
        ShapeFactory shapeFactory = new ShapeFactory();
        //Creating circle object
        Shape circle = shapeFactory.getShape("Circle");
        //Creating rectangle object
        Shape rectangle = shapeFactory.getShape("Rectangle");
        //Calling circle draw function
        circle.draw();
        //alling rectangle draw function
        rectangle.draw();
    }
}
