package com.company;

public class Main {

    public static void main(String[] args) {
        int y = 0; // размерность массива
        for (int i = 2; i <= 20; i += 2) {
            y++;
        }

        int[] array = new int[y];
        int a=2;
        for (int i = 0; i < array.length; i++) {
            array[i] = a;
            a+=2;
        }

        for (int x : array) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println();

        for (int x: array){
            System.out.println(x);
        }


    }
}
