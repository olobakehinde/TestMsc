import java.math.*;
public class perfectsquare {

    public static void main(String[]args){

        System.out.println(square(36));

    }
    static int square(int a){

        if(a < 0){
            return 0;
        }
        else{

        int firstresult= (int) Math.sqrt(a);

        int result = firstresult + 1;

        int val =(int) Math.pow(result,2);
        return val;
        }
    }
}
