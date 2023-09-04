package com.teachmeskills.homework11.part2;
import com.teachmeskills.homework11.part2.Figure;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public final class Rectangle extends Figure {

    private int side1;
    private int side2;

    public Rectangle(int side1,int side2){
        this.side1=side1;
        this.side2=side2;
    }


    @Override
   public double perimeter() {
        return (side1+side2)*2;
    }

}
