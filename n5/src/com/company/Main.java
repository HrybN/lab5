package com.company;

public class Main {

    public static void main(String[] args) {

        int counter = 0;
        int[] array = new int[15];
        for(int i = 0; i < 15; i++) {
            array[i] = (int) Math.round(Math.random() * 10);

        }
        for(int i = 0; i < 15; i++) {
            System.out.print(array[i] + " ");
        }
        for(int i = 0; i < 15; i++) {
            if(array[i] % 2 == 0);
                counter++;
        }
        System.out.println("\n" + "Num of paired elements: " + counter);
    }
}
