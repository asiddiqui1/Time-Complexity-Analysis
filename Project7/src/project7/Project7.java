/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project7;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * Aliza Siddiqui
 * 04-23-2020
 */

/** 
 * This class will give the user the time it takes for each sorting algorithm to sort an array of various sizes
 */
public class Project7 {

    public static void main(String[] args) {
        
      int[] arraySizes = {1000, 20000, 100000, 200000}; //Different sizes of array
      ArrayList <Long> times = new ArrayList<>(); //Will store the times for each sorting algorithm
     
      System.out.println("================TIME IN MILLISECONDS==================");
      System.out.printf("%-10s      %-10d%,-10d%,-10d%,-10d\n", "Array Size", 1000, 20000, 100000, 200000);
      System.out.println("======================================================");
      for(int i: arraySizes){ //For each array size...
         int[] array = populateArray(i);
         long start = System.currentTimeMillis();
         SortingAlgorithms.BubbleSort(array);
         long elapsed = System.currentTimeMillis() - start; 
         times.add(elapsed);
      }
     System.out.printf("%-13s      %-13d%,-13d%,-13d%,-13d\n", "Bubble Sort", times.get(0), times.get(1), times.get(2), times.get(3));
     System.out.println("------------------------------------------------------");
     
     times.clear(); //Will empty arraylist for next time values...
     
     for(int i: arraySizes){
         int[] array = populateArray(i);
         long start = System.currentTimeMillis();
         SortingAlgorithms.BubbleSortCS(array);
         long elapsed = System.currentTimeMillis() - start; 
         //System.out.println("Size: " + i + " Time: " + elapsed);
         times.add(elapsed);
      }
     System.out.printf("%-10s      %-10d%,-10d%,-10d%,-10d\n", "Bubble Sort SC", times.get(0), times.get(1), times.get(2), times.get(3));
     System.out.println("------------------------------------------------------");
     
     times.clear();
     
     for(int i: arraySizes){
         int[] array = populateArray(i);
         long start = System.currentTimeMillis();
         SortingAlgorithms.SelectionSort(array);
         long elapsed = System.currentTimeMillis() - start; 
         //System.out.println("Size: " + i + " Time: " + elapsed);
         times.add(elapsed);
      }
     System.out.printf("%-10s      %-10d%,-10d%,-10d%,-10d\n", "Selection Sort", times.get(0), times.get(1), times.get(2), times.get(3));
     System.out.println("------------------------------------------------------");
     
      times.clear();
     
     for(int i: arraySizes){
         int[] array = populateArray(i);
         long start = System.currentTimeMillis();
         SortingAlgorithms.InsertionSort(array);
         long elapsed = System.currentTimeMillis() - start; 
         //System.out.println("Size: " + i + " Time: " + elapsed);
         times.add(elapsed);
      }
     System.out.printf("%-10s      %-10d%,-10d%,-10d%,-10d\n", "Insertion Sort", times.get(0), times.get(1), times.get(2), times.get(3));
     System.out.println("------------------------------------------------------");
     
     times.clear();
     
     for(int i: arraySizes){
         int[] array = populateArray(i);
         long start = System.currentTimeMillis();
         SortingAlgorithms.MergeSort(array);
         long elapsed = System.currentTimeMillis() - start; 
         //System.out.println("Size: " + i + " Time: " + elapsed);
         times.add(elapsed);
      }
     System.out.printf("%-10s      %-14d%,-14d%,-14d%,-14d\n", "Merge Sort", times.get(0), times.get(1), times.get(2), times.get(3));
     System.out.println("------------------------------------------------------");
     
     times.clear();
     
     
     for(int i: arraySizes){
         int[] array = populateArray(i);
         long start = System.currentTimeMillis();
         SortingAlgorithms.JavaSort(array);
         long elapsed = System.currentTimeMillis() - start; 
         //System.out.println("Size: " + i + " Time: " + elapsed);
         times.add(elapsed);
      }
     System.out.printf("%-10s      %-14d%,-14d%,-14d%,-14d\n", "Java Sort", times.get(0), times.get(1), times.get(2), times.get(3));
     System.out.println("------------------------------------------------------");
     
     times.clear();
     
     for(int i: arraySizes){
         int[] array = populateArray(i);
         long start = System.currentTimeMillis();
         SortingAlgorithms.QuickSort(array, 0, i-1);
         long elapsed = System.currentTimeMillis() - start; 
         //System.out.println("Size: " + i + " Time: " + elapsed);
         times.add(elapsed);
      }
     System.out.printf("%-10s      %-10d%,-10d%,-10d%,-10d\n", "Quick Sort", times.get(0), times.get(1), times.get(2), times.get(3));
     System.out.println("------------------------------------------------------");
     
     times.clear();
     
     for(int i: arraySizes){
         int[] array = populateArray(i);
         long start = System.currentTimeMillis();
         SortingAlgorithms.HeapSort(array);
         long elapsed = System.currentTimeMillis() - start; 
         //System.out.println("Size: " + i + " Time: " + elapsed);
         times.add(elapsed);
      }
     System.out.printf("%-10s      %-14d%,-14d%,-14d%,-14d\n", "Heap Sort", times.get(0), times.get(1), times.get(2), times.get(3));
     System.out.println("------------------------------------------------------");
     
    }
    
    /**
     * This function will fill the array with random numbers in [0,1000]
     * @param size - size of the array (# of random ints)
     * @return - the array of random numbers
     */
    public static int[] populateArray(int size){
        int[] arr = new int[size];
        Random rand = new Random();
        for(int i=0;i<arr.length; i++){
            int num = rand.nextInt(1001);
            arr[i] = num;
        }
        
        return arr;
    }
    
    /** 
     * This function will print out each element of the array
     * @param arr -array to be printed
     */
    public static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i + ",");
        }
        System.out.println();
    }
    
    
}
