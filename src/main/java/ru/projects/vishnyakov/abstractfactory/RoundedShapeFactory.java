package ru.projects.vishnyakov.abstractfactory;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        }
        throw new UnsupportedOperationException("Unsupported " + shapeType);
    }
}
