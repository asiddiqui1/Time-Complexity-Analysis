
package project6;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class Project6 {

    
    public static void main(String[] args) {
        System.out.printf("%-10s%-15s%-15s%-10s\n", "x", "fib(x)", "Recursive(ns)", "Iterative(ns)");
        System.out.println("======================================================");
      
        for(int i = 10; i<= 50; i+=10){
            
            //Recursive Fibonacci
            long startTime = System.nanoTime(); // calculates the run time in nanoseconds for recursive
            long recurFib = Fibonacci.recursiveFib(i);
            long timeElapsed = System.nanoTime() - startTime;
            
            //Iterative Fibonacci
            long startTime2 = System.nanoTime();
            long iterFib = Fibonacci.iterativeFib(i);
            long timeElapsed2 = System.nanoTime() - startTime2;
            
            System.out.printf("%-10d%-15d%-15d%-10d\n", i , recurFib, timeElapsed, timeElapsed2);
        }
		
        
                
        System.out.println("======================================================");
    }
    
}
