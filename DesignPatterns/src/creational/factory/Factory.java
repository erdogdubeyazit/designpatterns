package creational.factory;

public class Factory {

	public Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("circle"))
			return new Circle();
		if (shapeType.equalsIgnoreCase("rectangle"))
			return new Rectangle();
		return null;
	}

}
