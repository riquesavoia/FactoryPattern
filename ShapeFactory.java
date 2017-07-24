package factorypattern;

public class ShapeFactory {
    public Shape getShape(String type){
        if(type == "Circle"){
            return new Circle();
        }
        else if(type == "Rectangle"){
            return new Rectangle();
        }
        else
            return null;
    }
}
