
package project6;


public class Fibonacci {
     //Finish this method: recusrive implemenation of a Fibonacci number generator
    public static long recursiveFib(int n)
    {
        if (n<= 2){
            return 1;
        }
        else{
            return recursiveFib(n-1) + recursiveFib(n-2);
        }
    }
    
    
    //Finish this method: iterative implemenation of Fibonacci number generator
    public static long iterativeFib(int n) {
        
	long finalVal;
        
        if(n<= 2){
            finalVal = 1;
        }
        else{
            long olderVal = 1;
            long oldVal = 1;
            long newVal = 1;
            
            for(int i = 3; i<= n ; i++){
                newVal = olderVal + oldVal;
                olderVal = oldVal;
                oldVal = newVal;
               
            }
            
            finalVal = newVal;
        }
        
        return finalVal;
        
    }
    

}
