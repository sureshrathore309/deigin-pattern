package com.apisero.abstractFactory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
		Shape shapeCircle = shapeFactory.getShape("RECTANGLE");
		shapeCircle.draw();
		Shape shapeSquare = shapeFactory.getShape("SQUARE");
		shapeSquare.draw();

		AbstractFactory shapeFactoryRounded = FactoryProducer.getFactory(true);
		Shape shapeCircleRounded = shapeFactoryRounded.getShape("RECTANGLE");
		shapeCircleRounded.draw();
		Shape shapeSquareRounded = shapeFactoryRounded.getShape("SQUARE");
		shapeSquareRounded.draw();

	}

}
