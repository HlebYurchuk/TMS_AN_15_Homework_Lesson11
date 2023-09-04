package com.teachmeskills.homework11.part2;

import java.awt.*;
import java.util.ArrayList;

public class  main {
    public static void main(String[] args) {

        {
            ArrayList<Figure> arrayList = new ArrayList<>();

            arrayList.add(new Circle(4));
            arrayList.add(new Circle(2));
            arrayList.add(new Rectangle(2, 5));
            arrayList.add(new Tringle(7, 9, 5));
            arrayList.add(new Rectangle(1, 6));
            arrayList.add(new Tringle(8, 5, 5));


            for (Figure i : arrayList) {
                System.out.println(i.perimeter());
            }
        }
    }
}