package com.teachmeskills.homework11.part1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваши числа, используйте (exit) для выхода");

        while (sc.hasNext()) {
            String numbers = sc.next();
            if (numbers.toLowerCase().equals("exit")) {
               break;

            }
            try {
                int val = Integer.valueOf(numbers);
                arrayList.add(val);
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Неправильный ввод, используйте числа");
                continue;
            }

            System.out.println(arrayList);

            ArrayList<Integer> arrayList2 = new ArrayList<>();
           for (int j : arrayList) {
                if (j % 2 == 0)
                    arrayList2.add(j);
              System.out.println(arrayList2 + " - Ваши чётные числа из коллекции");
            }
        }
    }}
