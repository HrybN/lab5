package com.company;

public class Main {

    public static void main(String[] args) {
	 int[] array1 = new int[10];
     int[] array2 = new int[10];
     int[] empty_array = new int[10];

        for (int i = 0; i < 10; i++)
            array1[i] = (int) Math.round(Math.random() * 10);
        for (int i = 0; i < 10; i++)
            array2[i] = (int) Math.round(Math.random() * 10);
        for (int i = 0; i < 10; i++)
            empty_array[i] = array1[i] + array2[i];

        System.out.println("First array: ");
     for (int i = 0; i < 10; i++) {
         System.out.print(array1[i] + " ");
     }
     System.out.println(" ");
     System.out.println("Second array: ");
     for (int i = 0; i < 10; i++) {
         System.out.print(array2[i] + " ");
     }
     System.out.println(" ");
     System.out.println("Sum of array: ");
      for (int i = 0; i < 10; i++) {
         System.out.print(empty_array[i] + " ");

      }
   }
}
