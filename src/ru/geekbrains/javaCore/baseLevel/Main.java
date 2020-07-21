package ru.geekbrains.javaCore.baseLevel;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] num1 = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        int[] num2 = new int[8];
        int[] num3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int[][] num4 = new int[5][5];
        int[] num5 = { 21, 5, 3, 2, 11, 4, 5, 34, 14, 8, 9, 7 };
        int[] num6 = { 1, 5, 3, 2, 11 };


        //задание 1
        System.out.println("Задание 1.\nИсходный массив данных:");
        System.out.println(Arrays.toString(num1));
        System.out.println("Инвертированный массив данных:");
        invertArr(num1);
        System.out.println();

        //задание 2
        System.out.println("Задание 2.\nИсходный массив данных:");
        System.out.println(Arrays.toString(num2));
        System.out.println("Заполненный массив данных:");
        fillArr(num2);
        System.out.println();

        //задание 3
        System.out.println("Задание 3.\nИсходный массив данных:");
        System.out.println(Arrays.toString(num3));
        System.out.println("Заполненный массив данных:");
        multiplyArr(num3);
        System.out.println();

        //задание 4
        System.out.println("Задание 4.\nЗаполненный массив данных:");
        fillDiagArr(num4);
        System.out.println();

        //задание 5
        //использую два метода для раздельного поиска мин и макс чисел в массиве
        System.out.println("Задание 5.");
        minElementArr(num5);
        maxElementArr(num5);
        System.out.println();

        //задание 6
        System.out.println("Задание 6.");
        System.out.print("в массиве есть место, в котором сумма левой и правой части равны - ");
        System.out.println( checkBalance(num6) );


    }


    //метод для задания 1
    public static void invertArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //инвертируем 1-->0 и 0-->1
            if(arr[i] == 1) {
                arr[i] = 0;
            } else if(arr[i] == 0) {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //метод для задания 2
    public static void fillArr(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] + 3;    //заполняем массив арифметической прогрессией +3
        }
        System.out.println(Arrays.toString(arr));
    }

    //метод для задания 3
    public static void multiplyArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //метод для задания 4
    public static void fillDiagArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    //методы для задания 5
    public static void minElementArr(int[] arr) {
        int indexMin = 0;
        int i;
        for (i = 1; i < arr.length; i++) {
            if(arr[indexMin] > arr[i]) {
                indexMin = i;
            }
        }
        System.out.println("Минимальное значение элемента массива = " + arr[indexMin]);
    }

    public static void maxElementArr(int[] arr) {
        int indexMax = 0;
        int i;
        for (i = 1; i < arr.length; i++) {
            if(arr[indexMax] < arr[i]) {
                indexMax = i;
            }
        }
        System.out.println("Максимальное значение элемента массива = " + arr[indexMax]);
    }

    //метод для задания 6
    public static boolean checkBalance(int[] arr) {
        int leftSum  = 0;
        int rightSum = 0;
        for (int i = 0; i < arr.length; i++) {
            leftSum = leftSum + arr[i];
            for (int j = i+1; j < arr.length; j++) {
                rightSum = rightSum + arr[j];
            }
            if( leftSum == rightSum ) {
                return true;
            }
            rightSum = 0;
        }
        return false;
    }

}
