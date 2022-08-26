import java.util.Scanner;

public class upcount {

    public static void main(String[]aStrings){

        Scanner input = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int length = input.nextInt();
        int [] arra = new int[length];

        for(int i=0,count=1; i<arra.length; i++,count++){
            System.out.print("enter a"+" "+count+" "+"of array:");
            arra[i]=input.nextInt();
        }

        System.out.println();
        System.out.println("enter a number?");
        int num = input.nextInt();

        int output = nupcount(arra,num);
        System.out.println(output);
    }

    public static int nupcount(int [] a, int number){

        int count = 0;
        int ps = 0;
        int pps = 0;

        for (int j =0; j<a.length; j++){
            pps = ps;
            ps += a[j];
            if(pps <= number && ps >number){
                count++;
            }
        }

        return count;

    }
    
}
