package com.teachmeskills.homework11.part4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> list = new ArrayList();

        list.add(new Order(001, "Капуста", 23));
        list.add(new Order(123, "Картошка", 300));
        list.add(new Order(101, "Морковка", 2));
        list.add(new Order(156, "Свекла", 1));

        System.out.println(list);

        Comparator<Order> orderComparator= new Comparator<Order>(){

            @Override
            public int compare(Order o1, Order o2) {
                return Double.compare(o1.getPrice(),o2.getPrice());
            }
        };
        Collections.sort(list, orderComparator);
        System.out.println(list);

    }

}

