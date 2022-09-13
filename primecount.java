public class primecount {

    public static void main(String[]args){

        int a=10;int b=30;

        System.out.println(countprime(a,b));

    }
    static int countprime(int start, int end){
        if(start<=1){
            start=2;
        }
        if(end<start)
            return 0;
        int count =0 ;
        for(int i =start;i<end;i++){
            boolean flag= true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag)
            count++;
        }
        return count;
    }
}
      
