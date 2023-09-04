package com.teachmeskills.homework11.part2;
import com.teachmeskills.homework11.part2.Figure;

import java.awt.*;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public final class Tringle extends Figure {
    private int side1;
    private int side2;
    private int side3;

    public Tringle(int side1,int side2,int side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    @Override
    public double perimeter() {

        return side1+side2+side3;
    }

}
