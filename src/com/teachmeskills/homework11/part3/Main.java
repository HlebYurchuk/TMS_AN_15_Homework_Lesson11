package com.teachmeskills.homework11.part3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       try {
           ArrayList<Integer> numbers = new ArrayList<>();

           Scanner scanner = new Scanner(System.in);
           try {
               int size = scanner.nextInt();
               for (int i = 0; i < size; i++) {
                   numbers.add((int) (Math.random() * 10));
               }
           } catch (Exception e) {
               System.out.println("Ошибка! Для ввода используйте числа");
           }

           System.out.println(numbers);

           int sum_list = 0;
           for (int num : numbers) {
               sum_list += num;
           }
           System.out.println("Среднее арифмитическое - " + sum_list / numbers.size());
       }catch (RuntimeException e){
           System.out.println("Неверная длинна коллекции. Используйте целые числа больше 0");
       }
    }
}

