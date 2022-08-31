import java.util.Scanner;
import java.math.*;
import java.util.Arrays;
public class test {
   
public static void main(String[] args) {
    
    int [] array = {5,2,3,4} ;

    System.out.println(cal(array)); 
   }
    static double cal (int [] incoming){
        double ave = 0;
        double num = 0 ;
         
            for(int i=0,count=1;i<incoming.length;i++,count++){

                num += incoming[i];
                count ++;

               ave = num % count;
            }
            
            return ave; 
    }
    
}  
