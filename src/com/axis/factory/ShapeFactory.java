package com.axis.factory;
import com.axis.models.Circle;
import com.axis.models.Rectangle;
import com.axis.models.Shape;

public class ShapeFactory {
	public Shape getShape(String shapeType) {
		if(shapeType==null)
			return null;
		if(shapeType.equalsIgnoreCase("circle"))
			return new Circle();
		if(shapeType.equalsIgnoreCase("rectangle"))
			return new Rectangle();
		return null;
	}

}
