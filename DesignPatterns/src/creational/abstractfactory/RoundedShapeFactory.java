package creational.abstractfactory;

public class RoundedShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("square"))
			return new RoundedSquare();
		if(shapeType.equalsIgnoreCase("rectangle"))
			return new RoundedRectangle();
		return null;
	}

}
