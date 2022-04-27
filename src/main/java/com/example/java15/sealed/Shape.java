package com.example.java15.sealed;

import java.awt.Point;

//import com.example.java15.sealed.Shape.Circle;
//import com.example.java15.sealed.Shape.Rectangle;

//sealed interface Shape permits Circle, Rectangle {
//
//	record Circle(Point center, int radius) implements Shape {
//	}
//
//	record Rectangle(Point lowerLeft, Point upperRight) implements Shape {
//	}
//}

public sealed interface Shape {
	record Circle(Point center, int radius) implements Shape {
	}

	record Rectangle(Point lowerLeft, Point upperRight) implements Shape {
	}
}

/*
float area = switch (shape) {
	case Circle c -> Math.PI * c.radius() * c.radius();
	case Rectangle r -> Math.abs((r.upperRight().y() - r.lowerLeft().y())* (r.upperRight().x() - r.lowerLeft().x()));
	// não é necessário cláusula default
}
*/