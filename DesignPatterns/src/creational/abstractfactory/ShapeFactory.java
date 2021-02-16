package creational.abstractfactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("square"))
			return new Square();
		if(shapeType.equalsIgnoreCase("rectangle"))
			return new Rectangle();
		return null;
	}

}
