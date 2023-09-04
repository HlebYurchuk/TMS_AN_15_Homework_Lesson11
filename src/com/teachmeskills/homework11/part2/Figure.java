package com.teachmeskills.homework11.part2;

public abstract sealed class Figure permits Circle, Rectangle,Tringle {

    abstract double perimeter();
}
