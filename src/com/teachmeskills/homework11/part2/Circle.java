package com.teachmeskills.homework11.part2;

import java.awt.*;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ServiceConfigurationError;

public final class Circle extends Figure {
    private int radius;
    public Circle(int radius){
        this.radius=radius;
    }

    @Override
   public double perimeter() {
        return 2*Math.PI*radius;
    }

}
