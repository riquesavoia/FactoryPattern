package factorypattern;
public class FactoryPattern {
    public static void main(String[] args) {
        //Instanciando a classe factory
        ShapeFactory shapeFactory = new ShapeFactory();
        //Criando objeto circulo
        Shape circle = shapeFactory.getShape("Circle");
        //Criando objeto retângulo
        Shape rectangle = shapeFactory.getShape("Rectangle");
        //Chamando função draw do circulo
        circle.draw();
        //Chamando função draw do retangulo
        rectangle.draw();
    }
}
