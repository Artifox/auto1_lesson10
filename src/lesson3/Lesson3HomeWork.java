package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Lesson3HomeWork {
    public static void main(String[] args) {
        System.out.println("Task1: ");
        task1();
        System.out.println();
        System.out.println();
        System.out.println("Task2: ");
        task2();
        System.out.println();
        System.out.println();
        System.out.println("Task3: ");
        task3();
        System.out.println();
        System.out.println();
        System.out.println("Task4: ");
        task4();
        System.out.println();
        System.out.println();
        System.out.println("Task5: ");
        task5();
        System.out.println();
        System.out.println();
        System.out.println("Task6: ");
        task6();
    }

    public static void task1() {
        int[] array = new int[10];
        int counter = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                array[counter] = i;
                counter++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "] = " + array[i] + " ");
        }
    }

    public static void task2() {
        // вопрос: если не инициализировать int counter = 0, почему 0 не присваивается по умолчанию?
        int amountOfNumbers = 0;
        int counter = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                amountOfNumbers++;
            }
        }

        int[] array = new int[amountOfNumbers];
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                array[counter] = i;
                counter++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "] = " + array[i] + " ");
        }

    }

    public static void task3() {
        int[] array = new int[15];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "] = " + array[i] + " ");
        }

        System.out.println();
        int countOfEvenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countOfEvenNumbers++;
            }
        }
        System.out.println("Count of even numbers: " + countOfEvenNumbers);
    }

    public static void task4() {
        int[] array = new int[20];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(21);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                array[i] = 0;
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void task5() {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        Random rnd = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = rnd.nextInt(16);
            array2[i] = rnd.nextInt(16);
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + ", ");
        }

        double average1 = 0;
        double average2 = 0;
        for (int i = 0; i < array1.length; i++) {
            average1 = average1 + array1[i];
            average2 = average2 + array2[i];
        }
        average1 = average1 / array1.length;
        average2 = average2 / array2.length;

        System.out.println();
        if (average1 > average2) {
            System.out.println("Average of array 1: " + average1 + " > Average of array 2: " + average2);
        } else {
            System.out.println("Average of array 1: " + average1 + " < Average of array 2: " + average2);
        }
    }

    public static void task6_2() {
        int[] array = new int[]{1,2,3,4};
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(11);
        }
        //вопрос: почему при foreach outOfBound exection?
        /*for (int el : array){
            System.out.print(array[el]);
        }*/
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void task6(){
        int[] array = new int[4];
        int count = 0;
        Random rnd = new Random();
        for (int i = 0; i < array.length;i++){
            array[i] = rnd.nextInt(11);
        }

        for (int j = 0;j < array.length-1;j++){
            if (array[j] < array[j+1]){
                    count++;
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        if (count == array.length -1){
            System.out.println("Является строго возрастающей последовательностью");
        } else{
            System.out.println("Не является строго возрастающей последовательностью");
        }
    }

    public static void task7(){

    }
}
