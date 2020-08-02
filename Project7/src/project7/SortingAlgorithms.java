
package project7;

import java.util.Arrays;

/**
 * Aliza Siddiqui
 * 04-23-2020
 */
public class SortingAlgorithms {
    
    public static void BubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){ //you must go n-1 times
            for(int j=0; j<arr.length -i-1; j++){ //goes through actual array
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
            
    }
    
    public static void BubbleSortCS(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            boolean swap = false;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            
            if(!swap){
                break;
            }
        }
        
    }
    
    public static void SelectionSort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
             int minIndex = i; //you keep track of the index, not the value at the index
             for(int j = i+1; j<arr.length; j++){
                 if(arr[j] < arr[minIndex]){
                     minIndex = j;
                 }
             }
             if(minIndex != i){
               int temp = arr[i];
               arr[i] = arr[minIndex];
               arr[minIndex] = temp;
             }
            
        }
    }
    
    public static void InsertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int j = i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    
    /** This method is a helper method to Merge sort and merges individual sorted arrays together
     * Does the "conquering"
     * 
     * @param arr - original array
     * @param arrOne - Divided array 1
     * @param arrTwo - Divided array 2
     * @param left - length of arrayOne
     * @param right -length of arrayTwo
     */
    public static void Merge(int[] arr, int[] arrOne, int[] arrTwo, int left, int right){
        int i = 0, j = 0, k = 0;
        
        while(i < left && j < right){
            if(arrOne[i] <= arrTwo[j]){
                arr[k] = arrOne[i];
                i++;
            }
            
            else{
                arr[k] = arrTwo[j];
                j++;
            }
            
            k++;
        }
        
        while(i < left){
            arr[k] = arrOne[i];
            i++;
            k++;
        }
        
        while(j < right){
            arr[k] = arrTwo[j];
            j++;
            k++;
        }
}
    
    public static void MergeSort(int[] arr){
        if(arr.length != 1){
            int mid = arr.length/2;
            int[] arrOne = new int[mid];
            int[] arrTwo = new int[arr.length-mid];
            
            for(int i=0; i< mid; i++){
                arrOne[i] = arr[i];
            }
            for(int j= mid; j<arr.length; j++){
                arrTwo[j-mid] = arr[j];
            }
            
            MergeSort(arrOne);
            MergeSort(arrTwo);
            
            Merge(arr, arrOne, arrTwo, arrOne.length, arrTwo.length);
            
        }
    }
    
    public static void JavaSort(int[] arr){
        Arrays.sort(arr);
    }
    
    public static void QuickSort(int[] arr, int low, int high){
        if(low < high){
            int partitionIndex = Partition(arr, low, high);
            
            QuickSort(arr, low, partitionIndex-1);
            QuickSort(arr, partitionIndex +1, high);
        }
    }
    
    /**
     * This method is a helper method for Quick sort 
     * @param arr - original array
     * @param low - starting index
     * @param high - ending index
     * @return 
     */
    public static int Partition(int[] arr, int low, int high){
        int pivot = arr[high];
        
        int i = (low-1); //index of smaller element
        
        for (int j = low; j < high; j++){
            //if current element is smaller than pivot
            if(arr[j] < pivot){
                i++; //increment index of smaller element 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp2 = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp2;
        return (i+1);
    }
    
    public static void HeapSort(int[] arr){
        int n = arr.length;
        
        //Build heap (rearrange array)
        for(int i = n/2 -1; i>= 0; i--){
            heapify(arr, n, i);
        }
        
        for(int i = n-1; i>0; i--){
            
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            heapify(arr, i, 0);
        }
    }
    
    /** 
     * Helper method for Heap Sort
     */
    public static void heapify(int[] arr, int n, int i){
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;
        
        if(l < n && arr[l] > arr[largest]){
            largest = l;
        }
        
        if(r<n && arr[r] > arr[largest]){
            largest = r;
        }
        
        if(largest != i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            
            heapify(arr, n, largest);
        }
    }
    
    
    
}
